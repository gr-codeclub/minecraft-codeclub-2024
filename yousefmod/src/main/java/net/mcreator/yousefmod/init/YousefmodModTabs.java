
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.yousefmod.init;

import net.neoforged.neoforge.registries.DeferredRegister;
import net.neoforged.neoforge.registries.DeferredHolder;
import net.neoforged.neoforge.event.BuildCreativeModeTabContentsEvent;
import net.neoforged.fml.common.EventBusSubscriber;
import net.neoforged.bus.api.SubscribeEvent;

import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.CreativeModeTabs;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.network.chat.Component;
import net.minecraft.core.registries.Registries;

import net.mcreator.yousefmod.YousefmodMod;

@EventBusSubscriber(bus = EventBusSubscriber.Bus.MOD)
public class YousefmodModTabs {
	public static final DeferredRegister<CreativeModeTab> REGISTRY = DeferredRegister.create(Registries.CREATIVE_MODE_TAB, YousefmodMod.MODID);
	public static final DeferredHolder<CreativeModeTab, CreativeModeTab> YOUSEFMOD = REGISTRY.register("yousefmod",
			() -> CreativeModeTab.builder().title(Component.translatable("item_group.yousefmod.yousefmod")).icon(() -> new ItemStack(YousefmodModBlocks.BEBEA.get())).displayItems((parameters, tabData) -> {
				tabData.accept(YousefmodModItems.YOUSE_FWAND.get());
				tabData.accept(YousefmodModBlocks.IMADYOUSEFBLOCK.get().asItem());
				tabData.accept(YousefmodModBlocks.TESTBLOCKYOUSEF.get().asItem());
				tabData.accept(YousefmodModBlocks.FOOTBALL.get().asItem());
			}).withSearchBar().build());

	@SubscribeEvent
	public static void buildTabContentsVanilla(BuildCreativeModeTabContentsEvent tabData) {
		if (tabData.getTabKey() == CreativeModeTabs.BUILDING_BLOCKS) {

			tabData.accept(YousefmodModBlocks.BEBEA.get().asItem());

		} else if (tabData.getTabKey() == CreativeModeTabs.SPAWN_EGGS) {

			tabData.accept(YousefmodModItems.DRAGONN_SPAWN_EGG.get());
			tabData.accept(YousefmodModItems.YOYOCHAIR_SPAWN_EGG.get());

		} else if (tabData.getTabKey() == CreativeModeTabs.TOOLS_AND_UTILITIES) {

			tabData.accept(YousefmodModItems.YOUSE_FWAND.get());
			tabData.accept(YousefmodModItems.SQUID_GAMEDIMENSION.get());

		} else if (tabData.getTabKey() == CreativeModeTabs.NATURAL_BLOCKS) {

			tabData.accept(YousefmodModBlocks.BLOC.get().asItem());

		}
	}
}
