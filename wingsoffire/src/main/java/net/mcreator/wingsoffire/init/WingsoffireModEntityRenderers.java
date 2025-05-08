
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.wingsoffire.init;

import net.neoforged.neoforge.client.event.EntityRenderersEvent;
import net.neoforged.fml.common.EventBusSubscriber;
import net.neoforged.bus.api.SubscribeEvent;
import net.neoforged.api.distmarker.Dist;

import net.mcreator.wingsoffire.client.renderer.AnikawofRenderer;
import net.mcreator.wingsoffire.client.renderer.AnikaChairRenderer;

@EventBusSubscriber(bus = EventBusSubscriber.Bus.MOD, value = Dist.CLIENT)
public class WingsoffireModEntityRenderers {
	@SubscribeEvent
	public static void registerEntityRenderers(EntityRenderersEvent.RegisterRenderers event) {
		event.registerEntityRenderer(WingsoffireModEntities.ANIKAWOF.get(), AnikawofRenderer::new);
		event.registerEntityRenderer(WingsoffireModEntities.ANIKA_CHAIR.get(), AnikaChairRenderer::new);
	}
}
