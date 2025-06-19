
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.oogaboogablockgen.init;

import net.neoforged.neoforge.client.event.EntityRenderersEvent;
import net.neoforged.fml.common.EventBusSubscriber;
import net.neoforged.bus.api.SubscribeEvent;
import net.neoforged.api.distmarker.Dist;

import net.mcreator.oogaboogablockgen.client.model.ModelRandomAhhChair;
import net.mcreator.oogaboogablockgen.client.model.ModelMy_Majestic_Pet_Grenade;

@EventBusSubscriber(bus = EventBusSubscriber.Bus.MOD, value = {Dist.CLIENT})
public class OogaboogablockgenModModels {
	@SubscribeEvent
	public static void registerLayerDefinitions(EntityRenderersEvent.RegisterLayerDefinitions event) {
		event.registerLayerDefinition(ModelMy_Majestic_Pet_Grenade.LAYER_LOCATION, ModelMy_Majestic_Pet_Grenade::createBodyLayer);
		event.registerLayerDefinition(ModelRandomAhhChair.LAYER_LOCATION, ModelRandomAhhChair::createBodyLayer);
	}
}
