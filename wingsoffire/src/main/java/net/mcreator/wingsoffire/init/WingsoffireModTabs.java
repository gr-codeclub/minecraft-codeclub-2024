
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.wingsoffire.init;

import net.neoforged.neoforge.registries.DeferredRegister;
import net.neoforged.neoforge.registries.DeferredHolder;
import net.neoforged.neoforge.event.BuildCreativeModeTabContentsEvent;
import net.neoforged.fml.common.EventBusSubscriber;
import net.neoforged.bus.api.SubscribeEvent;

import net.minecraft.world.item.Items;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.CreativeModeTabs;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.network.chat.Component;
import net.minecraft.core.registries.Registries;

import net.mcreator.wingsoffire.WingsoffireMod;

@EventBusSubscriber(bus = EventBusSubscriber.Bus.MOD)
public class WingsoffireModTabs {
	public static final DeferredRegister<CreativeModeTab> REGISTRY = DeferredRegister.create(Registries.CREATIVE_MODE_TAB, WingsoffireMod.MODID);
	public static final DeferredHolder<CreativeModeTab, CreativeModeTab> GLORYS_TAB = REGISTRY.register("glorys_tab",
			() -> CreativeModeTab.builder().title(Component.translatable("item_group.wingsoffire.glorys_tab")).icon(() -> new ItemStack(Items.TRIDENT)).displayItems((parameters, tabData) -> {
				tabData.accept(WingsoffireModItems.GLORYANDTHEHIDDENKINGDOM.get());
				tabData.accept(WingsoffireModBlocks.CHECKERS.get().asItem());
				tabData.accept(WingsoffireModBlocks.FUNBLOCK.get().asItem());
				tabData.accept(WingsoffireModBlocks.MOMOFROGSIGMA.get().asItem());
				tabData.accept(WingsoffireModBlocks.POLLYFROGBLOCK.get().asItem());
				tabData.accept(WingsoffireModBlocks.MOMOLANDHOUSEBLOCK.get().asItem());
				tabData.accept(WingsoffireModBlocks.BLOCKY.get().asItem());
			}).withSearchBar().build());

	@SubscribeEvent
	public static void buildTabContentsVanilla(BuildCreativeModeTabContentsEvent tabData) {
		if (tabData.getTabKey() == CreativeModeTabs.BUILDING_BLOCKS) {

			tabData.accept(WingsoffireModBlocks.WINGS_OF_FIREEX.get().asItem());
			tabData.accept(WingsoffireModBlocks.CHECKERS.get().asItem());
			tabData.accept(WingsoffireModBlocks.FUNBLOCK.get().asItem());

		} else if (tabData.getTabKey() == CreativeModeTabs.SPAWN_EGGS) {

			tabData.accept(WingsoffireModItems.ANIKAWOF_SPAWN_EGG.get());

		} else if (tabData.getTabKey() == CreativeModeTabs.TOOLS_AND_UTILITIES) {

			tabData.accept(WingsoffireModItems.MOMOFROGDIMENSION.get());

		}
	}
}
