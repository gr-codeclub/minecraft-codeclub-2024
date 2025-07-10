
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.cavarli.init;

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

import net.mcreator.cavarli.entity.Noob1234567890OHIOEntity;
import net.mcreator.cavarli.entity.CjEntity;
import net.mcreator.cavarli.entity.CavarliChairEntity;
import net.mcreator.cavarli.CavarliMod;

@EventBusSubscriber(bus = EventBusSubscriber.Bus.MOD)
public class CavarliModEntities {
	public static final DeferredRegister<EntityType<?>> REGISTRY = DeferredRegister.create(Registries.ENTITY_TYPE, CavarliMod.MODID);
	public static final DeferredHolder<EntityType<?>, EntityType<Noob1234567890OHIOEntity>> NOOB_1234567890_OHIO = register("noob_1234567890_ohio",
			EntityType.Builder.<Noob1234567890OHIOEntity>of(Noob1234567890OHIOEntity::new, MobCategory.MONSTER).setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(3)

					.sized(0.4f, 0.7f));
	public static final DeferredHolder<EntityType<?>, EntityType<CavarliChairEntity>> CAVARLI_CHAIR = register("cavarli_chair",
			EntityType.Builder.<CavarliChairEntity>of(CavarliChairEntity::new, MobCategory.MONSTER).setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(3)

					.sized(0.6f, 1.8f));
	public static final DeferredHolder<EntityType<?>, EntityType<CjEntity>> CJ = register("cj", EntityType.Builder.<CjEntity>of(CjEntity::new, MobCategory.MONSTER).setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(3)

			.sized(0.6f, 1.8f));

	// Start of user code block custom entities
	// End of user code block custom entities
	private static <T extends Entity> DeferredHolder<EntityType<?>, EntityType<T>> register(String registryname, EntityType.Builder<T> entityTypeBuilder) {
		return REGISTRY.register(registryname, () -> (EntityType<T>) entityTypeBuilder.build(registryname));
	}

	@SubscribeEvent
	public static void init(RegisterSpawnPlacementsEvent event) {
		Noob1234567890OHIOEntity.init(event);
		CavarliChairEntity.init(event);
		CjEntity.init(event);
	}

	@SubscribeEvent
	public static void registerAttributes(EntityAttributeCreationEvent event) {
		event.put(NOOB_1234567890_OHIO.get(), Noob1234567890OHIOEntity.createAttributes().build());
		event.put(CAVARLI_CHAIR.get(), CavarliChairEntity.createAttributes().build());
		event.put(CJ.get(), CjEntity.createAttributes().build());
	}
}
