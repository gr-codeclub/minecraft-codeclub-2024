
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.wingsoffire.init;

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

import net.mcreator.wingsoffire.entity.SCOTTTHESCOOTEREntity;
import net.mcreator.wingsoffire.entity.AnikawofEntity;
import net.mcreator.wingsoffire.entity.AnikaChairEntity;
import net.mcreator.wingsoffire.WingsoffireMod;

@EventBusSubscriber(bus = EventBusSubscriber.Bus.MOD)
public class WingsoffireModEntities {
	public static final DeferredRegister<EntityType<?>> REGISTRY = DeferredRegister.create(Registries.ENTITY_TYPE, WingsoffireMod.MODID);
	public static final DeferredHolder<EntityType<?>, EntityType<AnikawofEntity>> ANIKAWOF = register("anikawof",
			EntityType.Builder.<AnikawofEntity>of(AnikawofEntity::new, MobCategory.MONSTER).setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(3)

					.sized(0.9f, 1.4f));
	public static final DeferredHolder<EntityType<?>, EntityType<AnikaChairEntity>> ANIKA_CHAIR = register("anika_chair",
			EntityType.Builder.<AnikaChairEntity>of(AnikaChairEntity::new, MobCategory.MONSTER).setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(3)

					.sized(0.6f, 1.8f));
	public static final DeferredHolder<EntityType<?>, EntityType<SCOTTTHESCOOTEREntity>> SCOTTTHESCOOTER = register("scottthescooter",
			EntityType.Builder.<SCOTTTHESCOOTEREntity>of(SCOTTTHESCOOTEREntity::new, MobCategory.MONSTER).setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(3)

					.sized(0.6f, 1.8f));

	// Start of user code block custom entities
	// End of user code block custom entities
	private static <T extends Entity> DeferredHolder<EntityType<?>, EntityType<T>> register(String registryname, EntityType.Builder<T> entityTypeBuilder) {
		return REGISTRY.register(registryname, () -> (EntityType<T>) entityTypeBuilder.build(registryname));
	}

	@SubscribeEvent
	public static void init(RegisterSpawnPlacementsEvent event) {
		AnikawofEntity.init(event);
		AnikaChairEntity.init(event);
		SCOTTTHESCOOTEREntity.init(event);
	}

	@SubscribeEvent
	public static void registerAttributes(EntityAttributeCreationEvent event) {
		event.put(ANIKAWOF.get(), AnikawofEntity.createAttributes().build());
		event.put(ANIKA_CHAIR.get(), AnikaChairEntity.createAttributes().build());
		event.put(SCOTTTHESCOOTER.get(), SCOTTTHESCOOTEREntity.createAttributes().build());
	}
}
