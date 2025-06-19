
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.oogaboogablockgen.init;

import net.neoforged.neoforge.client.event.EntityRenderersEvent;
import net.neoforged.fml.common.EventBusSubscriber;
import net.neoforged.bus.api.SubscribeEvent;
import net.neoforged.api.distmarker.Dist;

import net.mcreator.oogaboogablockgen.client.renderer.GrenadeRenderer;
import net.mcreator.oogaboogablockgen.client.renderer.DuckRenderer;
import net.mcreator.oogaboogablockgen.client.renderer.ChairRenderer;

@EventBusSubscriber(bus = EventBusSubscriber.Bus.MOD, value = Dist.CLIENT)
public class OogaboogablockgenModEntityRenderers {
	@SubscribeEvent
	public static void registerEntityRenderers(EntityRenderersEvent.RegisterRenderers event) {
		event.registerEntityRenderer(OogaboogablockgenModEntities.DUCK.get(), DuckRenderer::new);
		event.registerEntityRenderer(OogaboogablockgenModEntities.CHAIR.get(), ChairRenderer::new);
		event.registerEntityRenderer(OogaboogablockgenModEntities.GRENADE.get(), GrenadeRenderer::new);
	}
}
