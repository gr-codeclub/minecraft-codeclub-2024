
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.yousefmod.init;

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

import net.mcreator.yousefmod.entity.YoyochairEntity;
import net.mcreator.yousefmod.entity.DragonnEntity;
import net.mcreator.yousefmod.YousefmodMod;

@EventBusSubscriber(bus = EventBusSubscriber.Bus.MOD)
public class YousefmodModEntities {
	public static final DeferredRegister<EntityType<?>> REGISTRY = DeferredRegister.create(Registries.ENTITY_TYPE, YousefmodMod.MODID);
	public static final DeferredHolder<EntityType<?>, EntityType<DragonnEntity>> DRAGONN = register("dragonn",
			EntityType.Builder.<DragonnEntity>of(DragonnEntity::new, MobCategory.MONSTER).setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(3)

					.sized(15.8f, 15.8f));
	public static final DeferredHolder<EntityType<?>, EntityType<YoyochairEntity>> YOYOCHAIR = register("yoyochair",
			EntityType.Builder.<YoyochairEntity>of(YoyochairEntity::new, MobCategory.MONSTER).setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(3)

					.sized(0.6f, 1.8f));

	// Start of user code block custom entities
	// End of user code block custom entities
	private static <T extends Entity> DeferredHolder<EntityType<?>, EntityType<T>> register(String registryname, EntityType.Builder<T> entityTypeBuilder) {
		return REGISTRY.register(registryname, () -> (EntityType<T>) entityTypeBuilder.build(registryname));
	}

	@SubscribeEvent
	public static void init(RegisterSpawnPlacementsEvent event) {
		DragonnEntity.init(event);
		YoyochairEntity.init(event);
	}

	@SubscribeEvent
	public static void registerAttributes(EntityAttributeCreationEvent event) {
		event.put(DRAGONN.get(), DragonnEntity.createAttributes().build());
		event.put(YOYOCHAIR.get(), YoyochairEntity.createAttributes().build());
	}
}
