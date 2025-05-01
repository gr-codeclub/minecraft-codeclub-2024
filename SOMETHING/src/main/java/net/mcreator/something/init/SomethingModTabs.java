
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.something.init;

import net.neoforged.neoforge.registries.DeferredRegister;
import net.neoforged.neoforge.event.BuildCreativeModeTabContentsEvent;
import net.neoforged.fml.common.EventBusSubscriber;
import net.neoforged.bus.api.SubscribeEvent;

import net.minecraft.world.item.CreativeModeTabs;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.core.registries.Registries;

import net.mcreator.something.SomethingMod;

@EventBusSubscriber(bus = EventBusSubscriber.Bus.MOD)
public class SomethingModTabs {
	public static final DeferredRegister<CreativeModeTab> REGISTRY = DeferredRegister.create(Registries.CREATIVE_MODE_TAB, SomethingMod.MODID);

	@SubscribeEvent
	public static void buildTabContentsVanilla(BuildCreativeModeTabContentsEvent tabData) {
		if (tabData.getTabKey() == CreativeModeTabs.BUILDING_BLOCKS) {

			tabData.accept(SomethingModBlocks.JUSTINBEBE.get().asItem());
			tabData.accept(SomethingModItems.NOTWATER_BUCKET.get());
			tabData.accept(SomethingModBlocks.ABSOULOUTLEY_NOT_JAKY.get().asItem());

		} else if (tabData.getTabKey() == CreativeModeTabs.REDSTONE_BLOCKS) {

			tabData.accept(SomethingModBlocks.VOLDEMORT_IS_STEALING_MY_SHAMPOO.get().asItem());

		} else if (tabData.getTabKey() == CreativeModeTabs.SPAWN_EGGS) {

			tabData.accept(SomethingModItems.KITYY_JAKY_SPAWN_EGG.get());
			tabData.accept(SomethingModItems.JAKY_CHAIR_SPAWN_EGG.get());

		} else if (tabData.getTabKey() == CreativeModeTabs.TOOLS_AND_UTILITIES) {

			tabData.accept(SomethingModItems.OVERUNDER.get());
			tabData.accept(SomethingModItems.JAKYS_DIMENTION.get());

		}
	}
}
