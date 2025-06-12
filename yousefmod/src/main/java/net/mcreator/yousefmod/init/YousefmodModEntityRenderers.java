
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.yousefmod.init;

import net.neoforged.neoforge.client.event.EntityRenderersEvent;
import net.neoforged.fml.common.EventBusSubscriber;
import net.neoforged.bus.api.SubscribeEvent;
import net.neoforged.api.distmarker.Dist;

import net.mcreator.yousefmod.client.renderer.YoyochairRenderer;
import net.mcreator.yousefmod.client.renderer.MbinigusiniRenderer;
import net.mcreator.yousefmod.client.renderer.DragonnRenderer;

@EventBusSubscriber(bus = EventBusSubscriber.Bus.MOD, value = Dist.CLIENT)
public class YousefmodModEntityRenderers {
	@SubscribeEvent
	public static void registerEntityRenderers(EntityRenderersEvent.RegisterRenderers event) {
		event.registerEntityRenderer(YousefmodModEntities.DRAGONN.get(), DragonnRenderer::new);
		event.registerEntityRenderer(YousefmodModEntities.YOYOCHAIR.get(), YoyochairRenderer::new);
		event.registerEntityRenderer(YousefmodModEntities.MBINIGUSINI.get(), MbinigusiniRenderer::new);
	}
}
