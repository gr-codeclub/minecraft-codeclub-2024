
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.scottmod.init;

import net.neoforged.neoforge.client.event.EntityRenderersEvent;
import net.neoforged.fml.common.EventBusSubscriber;
import net.neoforged.bus.api.SubscribeEvent;
import net.neoforged.api.distmarker.Dist;

import net.mcreator.scottmod.client.model.ModelPetRock;

@EventBusSubscriber(bus = EventBusSubscriber.Bus.MOD, value = {Dist.CLIENT})
public class ScottmodModModels {
	@SubscribeEvent
	public static void registerLayerDefinitions(EntityRenderersEvent.RegisterLayerDefinitions event) {
		event.registerLayerDefinition(ModelPetRock.LAYER_LOCATION, ModelPetRock::createBodyLayer);
	}
}
