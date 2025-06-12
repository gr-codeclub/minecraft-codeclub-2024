
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.erikmod.init;

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

import net.mcreator.erikmod.entity.ShockwaveEntity;
import net.mcreator.erikmod.entity.ErikiishimEntity;
import net.mcreator.erikmod.entity.ErikblueEntity;
import net.mcreator.erikmod.ErikmodMod;

@EventBusSubscriber(bus = EventBusSubscriber.Bus.MOD)
public class ErikmodModEntities {
	public static final DeferredRegister<EntityType<?>> REGISTRY = DeferredRegister.create(Registries.ENTITY_TYPE, ErikmodMod.MODID);
	public static final DeferredHolder<EntityType<?>, EntityType<ErikiishimEntity>> ERIKIISHIM = register("erikiishim",
			EntityType.Builder.<ErikiishimEntity>of(ErikiishimEntity::new, MobCategory.MONSTER).setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(3)

					.sized(0.6f, 1.95f));
	public static final DeferredHolder<EntityType<?>, EntityType<ErikblueEntity>> ERIKBLUE = register("erikblue",
			EntityType.Builder.<ErikblueEntity>of(ErikblueEntity::new, MobCategory.MONSTER).setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(3)

					.sized(0.6f, 1.8f));
	public static final DeferredHolder<EntityType<?>, EntityType<ShockwaveEntity>> SHOCKWAVE = register("shockwave",
			EntityType.Builder.<ShockwaveEntity>of(ShockwaveEntity::new, MobCategory.MONSTER).setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(3)

					.sized(0.6f, 1.8f));

	// Start of user code block custom entities
	// End of user code block custom entities
	private static <T extends Entity> DeferredHolder<EntityType<?>, EntityType<T>> register(String registryname, EntityType.Builder<T> entityTypeBuilder) {
		return REGISTRY.register(registryname, () -> (EntityType<T>) entityTypeBuilder.build(registryname));
	}

	@SubscribeEvent
	public static void init(RegisterSpawnPlacementsEvent event) {
		ErikiishimEntity.init(event);
		ErikblueEntity.init(event);
		ShockwaveEntity.init(event);
	}

	@SubscribeEvent
	public static void registerAttributes(EntityAttributeCreationEvent event) {
		event.put(ERIKIISHIM.get(), ErikiishimEntity.createAttributes().build());
		event.put(ERIKBLUE.get(), ErikblueEntity.createAttributes().build());
		event.put(SHOCKWAVE.get(), ShockwaveEntity.createAttributes().build());
	}
}
