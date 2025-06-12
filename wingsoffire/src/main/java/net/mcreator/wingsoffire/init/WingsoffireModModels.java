
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.wingsoffire.init;

import net.neoforged.neoforge.client.event.EntityRenderersEvent;
import net.neoforged.fml.common.EventBusSubscriber;
import net.neoforged.bus.api.SubscribeEvent;
import net.neoforged.api.distmarker.Dist;

import net.mcreator.wingsoffire.client.model.Modelscott;
import net.mcreator.wingsoffire.client.model.Modelanikamodel;

@EventBusSubscriber(bus = EventBusSubscriber.Bus.MOD, value = {Dist.CLIENT})
public class WingsoffireModModels {
	@SubscribeEvent
	public static void registerLayerDefinitions(EntityRenderersEvent.RegisterLayerDefinitions event) {
		event.registerLayerDefinition(Modelscott.LAYER_LOCATION, Modelscott::createBodyLayer);
		event.registerLayerDefinition(Modelanikamodel.LAYER_LOCATION, Modelanikamodel::createBodyLayer);
	}
}
