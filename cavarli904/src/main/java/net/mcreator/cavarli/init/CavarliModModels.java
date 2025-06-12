
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.cavarli.init;

import net.neoforged.neoforge.client.event.EntityRenderersEvent;
import net.neoforged.fml.common.EventBusSubscriber;
import net.neoforged.bus.api.SubscribeEvent;
import net.neoforged.api.distmarker.Dist;

import net.mcreator.cavarli.client.model.Modelcj;
import net.mcreator.cavarli.client.model.Modelcavarli;

@EventBusSubscriber(bus = EventBusSubscriber.Bus.MOD, value = {Dist.CLIENT})
public class CavarliModModels {
	@SubscribeEvent
	public static void registerLayerDefinitions(EntityRenderersEvent.RegisterLayerDefinitions event) {
		event.registerLayerDefinition(Modelcavarli.LAYER_LOCATION, Modelcavarli::createBodyLayer);
		event.registerLayerDefinition(Modelcj.LAYER_LOCATION, Modelcj::createBodyLayer);
	}
}
