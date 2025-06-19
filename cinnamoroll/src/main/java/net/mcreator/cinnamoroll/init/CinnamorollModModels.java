
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.cinnamoroll.init;

import net.neoforged.neoforge.client.event.EntityRenderersEvent;
import net.neoforged.fml.common.EventBusSubscriber;
import net.neoforged.bus.api.SubscribeEvent;
import net.neoforged.api.distmarker.Dist;

import net.mcreator.cinnamoroll.client.model.Modelfamous;
import net.mcreator.cinnamoroll.client.model.Modelcute;

@EventBusSubscriber(bus = EventBusSubscriber.Bus.MOD, value = {Dist.CLIENT})
public class CinnamorollModModels {
	@SubscribeEvent
	public static void registerLayerDefinitions(EntityRenderersEvent.RegisterLayerDefinitions event) {
		event.registerLayerDefinition(Modelcute.LAYER_LOCATION, Modelcute::createBodyLayer);
		event.registerLayerDefinition(Modelfamous.LAYER_LOCATION, Modelfamous::createBodyLayer);
	}
}
