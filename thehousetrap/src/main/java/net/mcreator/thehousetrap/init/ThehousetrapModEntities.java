
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.thehousetrap.init;

import net.neoforged.neoforge.registries.DeferredRegister;
import net.neoforged.neoforge.registries.DeferredHolder;
import net.neoforged.neoforge.event.entity.RegisterSpawnPlacementsEvent;
import net.neoforged.neoforge.event.entity.EntityAttributeCreationEvent;
import net.neoforged.fml.common.EventBusSubscriber;
import net.neoforged.bus.api.SubscribeEvent;

import net.minecraft.world.entity.MobCategory;
import net.minecraft.world.entity.EntityType;
import net.minecraft.world.entity.Entity;
import net.minecraft.core.registries.Registries;

import net.mcreator.thehousetrap.ThehousetrapMod;

@EventBusSubscriber(bus = EventBusSubscriber.Bus.MOD)
public class ThehousetrapModEntities {
	public static final DeferredRegister<EntityType<?>> REGISTRY = DeferredRegister.create(Registries.ENTITY_TYPE, ThehousetrapMod.MODID);
	public static final DeferredHolder<EntityType<?>, EntityType<CiraewolfEntity>> CIRAEWOLF = register("ciraewolf",
			EntityType.Builder.<CiraewolfEntity>of(CiraewolfEntity::new, MobCategory.MONSTER).setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(3)

					.sized(0.6f, 0.7f));
	public static final DeferredHolder<EntityType<?>, EntityType<CiraeChairEntity>> CIRAE_CHAIR = register("cirae_chair",
			EntityType.Builder.<CiraeChairEntity>of(CiraeChairEntity::new, MobCategory.MONSTER).setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(3)

					.sized(0.6f, 1.8f));
	public static final DeferredHolder<EntityType<?>, EntityType<DexEntity>> DEX = register("dex", EntityType.Builder.<DexEntity>of(DexEntity::new, MobCategory.MONSTER).setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(3)

			.sized(0.6f, 1.8f));

	// Start of user code block custom entities
	// End of user code block custom entities
	private static <T extends Entity> DeferredHolder<EntityType<?>, EntityType<T>> register(String registryname, EntityType.Builder<T> entityTypeBuilder) {
		return REGISTRY.register(registryname, () -> (EntityType<T>) entityTypeBuilder.build(registryname));
	}

	@SubscribeEvent
	public static void init(RegisterSpawnPlacementsEvent event) {
		CiraewolfEntity.init(event);
		CiraeChairEntity.init(event);
		DexEntity.init(event);
	}

	@SubscribeEvent
	public static void registerAttributes(EntityAttributeCreationEvent event) {
		event.put(CIRAEWOLF.get(), CiraewolfEntity.createAttributes().build());
		event.put(CIRAE_CHAIR.get(), CiraeChairEntity.createAttributes().build());
		event.put(DEX.get(), DexEntity.createAttributes().build());
	}
}
