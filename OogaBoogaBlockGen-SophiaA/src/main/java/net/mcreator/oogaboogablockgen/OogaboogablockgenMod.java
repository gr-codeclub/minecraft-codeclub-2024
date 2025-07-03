package net.mcreator.oogaboogablockgen;

import org.apache.logging.log4j.Logger;
import org.apache.logging.log4j.LogManager;

import net.neoforged.neoforge.network.registration.PayloadRegistrar;
import net.neoforged.neoforge.network.handling.IPayloadHandler;
import net.neoforged.neoforge.network.event.RegisterPayloadHandlersEvent;
import net.neoforged.neoforge.event.tick.ServerTickEvent;
import net.neoforged.neoforge.common.NeoForge;
import net.neoforged.fml.util.thread.SidedThreadGroups;
import net.neoforged.fml.common.Mod;
import net.neoforged.bus.api.SubscribeEvent;
import net.neoforged.bus.api.IEventBus;

import net.minecraft.util.Tuple;
import net.minecraft.network.protocol.common.custom.CustomPacketPayload;
import net.minecraft.network.codec.StreamCodec;
import net.minecraft.network.FriendlyByteBuf;

import net.mcreator.oogaboogablockgen.init.OogaboogablockgenModTabs;
import net.mcreator.oogaboogablockgen.init.OogaboogablockgenModSounds;
import net.mcreator.oogaboogablockgen.init.OogaboogablockgenModPotions;
import net.mcreator.oogaboogablockgen.init.OogaboogablockgenModParticleTypes;
import net.mcreator.oogaboogablockgen.init.OogaboogablockgenModMobEffects;
import net.mcreator.oogaboogablockgen.init.OogaboogablockgenModMenus;
import net.mcreator.oogaboogablockgen.init.OogaboogablockgenModItems;
import net.mcreator.oogaboogablockgen.init.OogaboogablockgenModFluids;
import net.mcreator.oogaboogablockgen.init.OogaboogablockgenModFluidTypes;
import net.mcreator.oogaboogablockgen.init.OogaboogablockgenModEntities;
import net.mcreator.oogaboogablockgen.init.OogaboogablockgenModBlocks;
import net.mcreator.oogaboogablockgen.init.OogaboogablockgenModBlockEntities;

import java.util.concurrent.ConcurrentLinkedQueue;
import java.util.Map;
import java.util.List;
import java.util.HashMap;
import java.util.Collection;
import java.util.ArrayList;

@Mod("oogaboogablockgen")
public class OogaboogablockgenMod {
	public static final Logger LOGGER = LogManager.getLogger(OogaboogablockgenMod.class);
	public static final String MODID = "oogaboogablockgen";

	public OogaboogablockgenMod(IEventBus modEventBus) {
		// Start of user code block mod constructor
		// End of user code block mod constructor
		NeoForge.EVENT_BUS.register(this);
		modEventBus.addListener(this::registerNetworking);
		OogaboogablockgenModSounds.REGISTRY.register(modEventBus);
		OogaboogablockgenModBlocks.REGISTRY.register(modEventBus);
		OogaboogablockgenModBlockEntities.REGISTRY.register(modEventBus);
		OogaboogablockgenModItems.REGISTRY.register(modEventBus);
		OogaboogablockgenModEntities.REGISTRY.register(modEventBus);
		OogaboogablockgenModTabs.REGISTRY.register(modEventBus);

		OogaboogablockgenModPotions.REGISTRY.register(modEventBus);
		OogaboogablockgenModMobEffects.REGISTRY.register(modEventBus);
		OogaboogablockgenModMenus.REGISTRY.register(modEventBus);
		OogaboogablockgenModParticleTypes.REGISTRY.register(modEventBus);

		OogaboogablockgenModFluids.REGISTRY.register(modEventBus);
		OogaboogablockgenModFluidTypes.REGISTRY.register(modEventBus);

		// Start of user code block mod init
		// End of user code block mod init
	}

	// Start of user code block mod methods
	// End of user code block mod methods
	private static boolean networkingRegistered = false;
	private static final Map<CustomPacketPayload.Type<?>, NetworkMessage<?>> MESSAGES = new HashMap<>();

	private record NetworkMessage<T extends CustomPacketPayload>(StreamCodec<? extends FriendlyByteBuf, T> reader, IPayloadHandler<T> handler) {
	}

	public static <T extends CustomPacketPayload> void addNetworkMessage(CustomPacketPayload.Type<T> id, StreamCodec<? extends FriendlyByteBuf, T> reader, IPayloadHandler<T> handler) {
		if (networkingRegistered)
			throw new IllegalStateException("Cannot register new network messages after networking has been registered");
		MESSAGES.put(id, new NetworkMessage<>(reader, handler));
	}

	@SuppressWarnings({"rawtypes", "unchecked"})
	private void registerNetworking(final RegisterPayloadHandlersEvent event) {
		final PayloadRegistrar registrar = event.registrar(MODID);
		MESSAGES.forEach((id, networkMessage) -> registrar.playBidirectional(id, ((NetworkMessage) networkMessage).reader(), ((NetworkMessage) networkMessage).handler()));
		networkingRegistered = true;
	}

	private static final Collection<Tuple<Runnable, Integer>> workQueue = new ConcurrentLinkedQueue<>();

	public static void queueServerWork(int tick, Runnable action) {
		if (Thread.currentThread().getThreadGroup() == SidedThreadGroups.SERVER)
			workQueue.add(new Tuple<>(action, tick));
	}

	@SubscribeEvent
	public void tick(ServerTickEvent.Post event) {
		List<Tuple<Runnable, Integer>> actions = new ArrayList<>();
		workQueue.forEach(work -> {
			work.setB(work.getB() - 1);
			if (work.getB() == 0)
				actions.add(work);
		});
		actions.forEach(e -> e.getA().run());
		workQueue.removeAll(actions);
	}
}
