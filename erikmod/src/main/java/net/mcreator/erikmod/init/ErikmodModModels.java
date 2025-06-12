
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.erikmod.init;

import net.neoforged.neoforge.client.event.EntityRenderersEvent;
import net.neoforged.fml.common.EventBusSubscriber;
import net.neoforged.bus.api.SubscribeEvent;
import net.neoforged.api.distmarker.Dist;

import net.mcreator.erikmod.client.model.Modelshockwave;
import net.mcreator.erikmod.client.model.Modelerikchair;

@EventBusSubscriber(bus = EventBusSubscriber.Bus.MOD, value = {Dist.CLIENT})
public class ErikmodModModels {
	@SubscribeEvent
	public static void registerLayerDefinitions(EntityRenderersEvent.RegisterLayerDefinitions event) {
		event.registerLayerDefinition(Modelshockwave.LAYER_LOCATION, Modelshockwave::createBodyLayer);
		event.registerLayerDefinition(Modelerikchair.LAYER_LOCATION, Modelerikchair::createBodyLayer);
	}
}
