
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.cavarli.init;

import net.neoforged.neoforge.client.event.EntityRenderersEvent;
import net.neoforged.fml.common.EventBusSubscriber;
import net.neoforged.bus.api.SubscribeEvent;
import net.neoforged.api.distmarker.Dist;

import net.mcreator.cavarli.client.renderer.SusRenderer;
import net.mcreator.cavarli.client.renderer.SonicRenderer;
import net.mcreator.cavarli.client.renderer.Noob1234567890OHIORenderer;
import net.mcreator.cavarli.client.renderer.GyatRenderer;
import net.mcreator.cavarli.client.renderer.CavarliChairRenderer;

@EventBusSubscriber(bus = EventBusSubscriber.Bus.MOD, value = Dist.CLIENT)
public class CavarliModEntityRenderers {
	@SubscribeEvent
	public static void registerEntityRenderers(EntityRenderersEvent.RegisterRenderers event) {
		event.registerEntityRenderer(CavarliModEntities.NOOB_1234567890_OHIO.get(), Noob1234567890OHIORenderer::new);
		event.registerEntityRenderer(CavarliModEntities.CAVARLI_CHAIR.get(), CavarliChairRenderer::new);
		event.registerEntityRenderer(CavarliModEntities.GYAT.get(), GyatRenderer::new);
		event.registerEntityRenderer(CavarliModEntities.SONIC.get(), SonicRenderer::new);
		event.registerEntityRenderer(CavarliModEntities.SUS.get(), SusRenderer::new);
	}
}
