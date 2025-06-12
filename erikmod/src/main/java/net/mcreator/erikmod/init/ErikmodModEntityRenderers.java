
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.erikmod.init;

import net.neoforged.neoforge.client.event.EntityRenderersEvent;
import net.neoforged.fml.common.EventBusSubscriber;
import net.neoforged.bus.api.SubscribeEvent;
import net.neoforged.api.distmarker.Dist;

import net.mcreator.erikmod.client.renderer.ShockwaveRenderer;
import net.mcreator.erikmod.client.renderer.ErikiishimRenderer;
import net.mcreator.erikmod.client.renderer.ErikblueRenderer;

@EventBusSubscriber(bus = EventBusSubscriber.Bus.MOD, value = Dist.CLIENT)
public class ErikmodModEntityRenderers {
	@SubscribeEvent
	public static void registerEntityRenderers(EntityRenderersEvent.RegisterRenderers event) {
		event.registerEntityRenderer(ErikmodModEntities.ERIKIISHIM.get(), ErikiishimRenderer::new);
		event.registerEntityRenderer(ErikmodModEntities.ERIKBLUE.get(), ErikblueRenderer::new);
		event.registerEntityRenderer(ErikmodModEntities.SHOCKWAVE.get(), ShockwaveRenderer::new);
	}
}
