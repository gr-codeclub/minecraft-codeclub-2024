
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.something.init;

import net.neoforged.neoforge.client.event.EntityRenderersEvent;
import net.neoforged.fml.common.EventBusSubscriber;
import net.neoforged.bus.api.SubscribeEvent;
import net.neoforged.api.distmarker.Dist;

import net.mcreator.something.client.renderer.KityyJakyRenderer;
import net.mcreator.something.client.renderer.JakyChairRenderer;

@EventBusSubscriber(bus = EventBusSubscriber.Bus.MOD, value = Dist.CLIENT)
public class SomethingModEntityRenderers {
	@SubscribeEvent
	public static void registerEntityRenderers(EntityRenderersEvent.RegisterRenderers event) {
		event.registerEntityRenderer(SomethingModEntities.KITYY_JAKY.get(), KityyJakyRenderer::new);
		event.registerEntityRenderer(SomethingModEntities.JAKY_CHAIR.get(), JakyChairRenderer::new);
	}
}
