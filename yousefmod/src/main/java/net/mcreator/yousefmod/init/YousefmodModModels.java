
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.yousefmod.init;

import net.neoforged.neoforge.client.event.EntityRenderersEvent;
import net.neoforged.fml.common.EventBusSubscriber;
import net.neoforged.bus.api.SubscribeEvent;
import net.neoforged.api.distmarker.Dist;

import net.mcreator.yousefmod.client.model.Modelyoyochair;
import net.mcreator.yousefmod.client.model.Modelbombininigusinini;

@EventBusSubscriber(bus = EventBusSubscriber.Bus.MOD, value = {Dist.CLIENT})
public class YousefmodModModels {
	@SubscribeEvent
	public static void registerLayerDefinitions(EntityRenderersEvent.RegisterLayerDefinitions event) {
		event.registerLayerDefinition(Modelbombininigusinini.LAYER_LOCATION, Modelbombininigusinini::createBodyLayer);
		event.registerLayerDefinition(Modelyoyochair.LAYER_LOCATION, Modelyoyochair::createBodyLayer);
	}
}
