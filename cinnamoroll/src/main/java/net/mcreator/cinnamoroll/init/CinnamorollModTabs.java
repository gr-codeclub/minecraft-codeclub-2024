
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.cinnamoroll.init;

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

import net.mcreator.cinnamoroll.CinnamorollMod;

@EventBusSubscriber(bus = EventBusSubscriber.Bus.MOD)
public class CinnamorollModTabs {
	public static final DeferredRegister<CreativeModeTab> REGISTRY = DeferredRegister.create(Registries.CREATIVE_MODE_TAB, CinnamorollMod.MODID);
	public static final DeferredHolder<CreativeModeTab, CreativeModeTab> LOLLIPOP = REGISTRY.register("lollipop",
			() -> CreativeModeTab.builder().title(Component.translatable("item_group.cinnamoroll.lollipop")).icon(() -> new ItemStack(CinnamorollModBlocks.WINTER_LAND.get())).displayItems((parameters, tabData) -> {
				tabData.accept(CinnamorollModBlocks.WINTER_LAND.get().asItem());
				tabData.accept(CinnamorollModBlocks.LO_L.get().asItem());
				tabData.accept(CinnamorollModBlocks.WINTERBLOCK_2.get().asItem());
				tabData.accept(CinnamorollModBlocks.HOUSE.get().asItem());
			})

					.build());

	@SubscribeEvent
	public static void buildTabContentsVanilla(BuildCreativeModeTabContentsEvent tabData) {
		if (tabData.getTabKey() == CreativeModeTabs.BUILDING_BLOCKS) {

			tabData.accept(CinnamorollModBlocks.WINTER_LAND.get().asItem());
			tabData.accept(CinnamorollModBlocks.WINTERBLOCK_2.get().asItem());

		} else if (tabData.getTabKey() == CreativeModeTabs.SPAWN_EGGS) {

			tabData.accept(CinnamorollModItems.JAMCHAIR_SPAWN_EGG.get());
			tabData.accept(CinnamorollModItems.CUTE_SPAWN_EGG.get());

		} else if (tabData.getTabKey() == CreativeModeTabs.TOOLS_AND_UTILITIES) {

			tabData.accept(CinnamorollModItems.BOB_THE_BUILDER.get());

		}
	}
}
