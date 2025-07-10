
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.thehousetrap.init;

import net.neoforged.neoforge.client.event.EntityRenderersEvent;
import net.neoforged.fml.common.EventBusSubscriber;
import net.neoforged.bus.api.SubscribeEvent;
import net.neoforged.api.distmarker.Dist;

@EventBusSubscriber(bus = EventBusSubscriber.Bus.MOD, value = Dist.CLIENT)
public class ThehousetrapModEntityRenderers {
	@SubscribeEvent
	public static void registerEntityRenderers(EntityRenderersEvent.RegisterRenderers event) {
		event.registerEntityRenderer(ThehousetrapModEntities.CIRAEWOLF.get(), CiraewolfRenderer::new);
		event.registerEntityRenderer(ThehousetrapModEntities.CIRAE_CHAIR.get(), CiraeChairRenderer::new);
		event.registerEntityRenderer(ThehousetrapModEntities.DEX.get(), DexRenderer::new);
	}
}
