
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.thehousetrap.init;

import net.neoforged.neoforge.registries.DeferredRegister;
import net.neoforged.neoforge.registries.DeferredHolder;
import net.neoforged.neoforge.event.BuildCreativeModeTabContentsEvent;
import net.neoforged.fml.common.EventBusSubscriber;
import net.neoforged.bus.api.SubscribeEvent;

import net.minecraft.world.level.block.Blocks;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.CreativeModeTabs;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.network.chat.Component;
import net.minecraft.core.registries.Registries;

import net.mcreator.thehousetrap.ThehousetrapMod;

@EventBusSubscriber(bus = EventBusSubscriber.Bus.MOD)
public class ThehousetrapModTabs {
	public static final DeferredRegister<CreativeModeTab> REGISTRY = DeferredRegister.create(Registries.CREATIVE_MODE_TAB, ThehousetrapMod.MODID);
	public static final DeferredHolder<CreativeModeTab, CreativeModeTab> FROGGY = REGISTRY.register("froggy",
			() -> CreativeModeTab.builder().title(Component.translatable("item_group.thehousetrap.froggy")).icon(() -> new ItemStack(Blocks.SMALL_AMETHYST_BUD)).displayItems((parameters, tabData) -> {
				tabData.accept(ThehousetrapModItems.CIRAE_FROGGY.get());
				tabData.accept(ThehousetrapModBlocks.CIRAEISTHEBEST.get().asItem());
				tabData.accept(ThehousetrapModBlocks.CIRAEHOUSE.get().asItem());
			}).withSearchBar().build());

	@SubscribeEvent
	public static void buildTabContentsVanilla(BuildCreativeModeTabContentsEvent tabData) {
		if (tabData.getTabKey() == CreativeModeTabs.BUILDING_BLOCKS) {

			tabData.accept(ThehousetrapModBlocks.CIRAEBLOCK.get().asItem());

		} else if (tabData.getTabKey() == CreativeModeTabs.SPAWN_EGGS) {

			tabData.accept(ThehousetrapModItems.CIRAEWOLF_SPAWN_EGG.get());
			tabData.accept(ThehousetrapModItems.CIRAE_CHAIR_SPAWN_EGG.get());
			tabData.accept(ThehousetrapModItems.DEX_SPAWN_EGG.get());

		} else if (tabData.getTabKey() == CreativeModeTabs.TOOLS_AND_UTILITIES) {

			tabData.accept(ThehousetrapModItems.SQUIDGAME.get());

		}
	}
}
