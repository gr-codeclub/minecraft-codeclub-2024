
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.thehousetrap.init;

import net.neoforged.neoforge.client.event.EntityRenderersEvent;
import net.neoforged.fml.common.EventBusSubscriber;
import net.neoforged.bus.api.SubscribeEvent;
import net.neoforged.api.distmarker.Dist;

import net.mcreator.thehousetrap.client.model.Modeldexchair;

@EventBusSubscriber(bus = EventBusSubscriber.Bus.MOD, value = {Dist.CLIENT})
public class ThehousetrapModModels {
	@SubscribeEvent
	public static void registerLayerDefinitions(EntityRenderersEvent.RegisterLayerDefinitions event) {
		event.registerLayerDefinition(Modeldexchair.LAYER_LOCATION, Modeldexchair::createBodyLayer);
	}
}
