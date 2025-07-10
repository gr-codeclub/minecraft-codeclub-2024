
/*
 *	MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.thehousetrap.init;

import net.neoforged.neoforge.client.event.RegisterMenuScreensEvent;
import net.neoforged.fml.common.EventBusSubscriber;
import net.neoforged.bus.api.SubscribeEvent;
import net.neoforged.api.distmarker.Dist;

@EventBusSubscriber(bus = EventBusSubscriber.Bus.MOD, value = Dist.CLIENT)
public class ThehousetrapModScreens {
	@SubscribeEvent
	public static void clientLoad(RegisterMenuScreensEvent event) {
		event.register(ThehousetrapModMenus.CIREISSOSIGMA.get(), CIREISSOSIGMAScreen::new);
	}
}
