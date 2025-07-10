
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.thehousetrap.init;

import net.neoforged.neoforge.registries.DeferredRegister;
import net.neoforged.neoforge.registries.DeferredHolder;
import net.neoforged.neoforge.capabilities.RegisterCapabilitiesEvent;
import net.neoforged.neoforge.capabilities.Capabilities;
import net.neoforged.fml.common.EventBusSubscriber;
import net.neoforged.bus.api.SubscribeEvent;

import net.minecraft.world.level.block.entity.BlockEntityType;
import net.minecraft.world.level.block.Block;
import net.minecraft.core.registries.BuiltInRegistries;

import net.mcreator.thehousetrap.ThehousetrapMod;

@EventBusSubscriber(bus = EventBusSubscriber.Bus.MOD)
public class ThehousetrapModBlockEntities {
	public static final DeferredRegister<BlockEntityType<?>> REGISTRY = DeferredRegister.create(BuiltInRegistries.BLOCK_ENTITY_TYPE, ThehousetrapMod.MODID);
	public static final DeferredHolder<BlockEntityType<?>, BlockEntityType<?>> CIRAEBLOCK = register("ciraeblock", ThehousetrapModBlocks.CIRAEBLOCK, CiraeblockBlockEntity::new);
	public static final DeferredHolder<BlockEntityType<?>, BlockEntityType<?>> CIRAEISTHEBEST = register("ciraeisthebest", ThehousetrapModBlocks.CIRAEISTHEBEST, CIRAEISTHEBESTBlockEntity::new);

	// Start of user code block custom block entities
	// End of user code block custom block entities
	private static DeferredHolder<BlockEntityType<?>, BlockEntityType<?>> register(String registryname, DeferredHolder<Block, Block> block, BlockEntityType.BlockEntitySupplier<?> supplier) {
		return REGISTRY.register(registryname, () -> BlockEntityType.Builder.of(supplier, block.get()).build(null));
	}

	@SubscribeEvent
	public static void registerCapabilities(RegisterCapabilitiesEvent event) {
		event.registerBlockEntity(Capabilities.ItemHandler.BLOCK, CIRAEBLOCK.get(), (blockEntity, side) -> ((CiraeblockBlockEntity) blockEntity).getItemHandler());
		event.registerBlockEntity(Capabilities.ItemHandler.BLOCK, CIRAEISTHEBEST.get(), (blockEntity, side) -> ((CIRAEISTHEBESTBlockEntity) blockEntity).getItemHandler());
	}
}
