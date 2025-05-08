
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.erikmod.init;

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

import net.mcreator.erikmod.ErikmodMod;

@EventBusSubscriber(bus = EventBusSubscriber.Bus.MOD)
public class ErikmodModTabs {
	public static final DeferredRegister<CreativeModeTab> REGISTRY = DeferredRegister.create(Registries.CREATIVE_MODE_TAB, ErikmodMod.MODID);
	public static final DeferredHolder<CreativeModeTab, CreativeModeTab> ERIKTAB = REGISTRY.register("eriktab",
			() -> CreativeModeTab.builder().title(Component.translatable("item_group.erikmod.eriktab")).icon(() -> new ItemStack(ErikmodModBlocks.ERIK_BLOCKS.get())).displayItems((parameters, tabData) -> {
				tabData.accept(ErikmodModItems.ERIKWANDTHEBEST.get());
				tabData.accept(ErikmodModBlocks.ERIKYTU.get().asItem());
				tabData.accept(ErikmodModBlocks.ABOY.get().asItem());
			}).withSearchBar().build());

	@SubscribeEvent
	public static void buildTabContentsVanilla(BuildCreativeModeTabContentsEvent tabData) {
		if (tabData.getTabKey() == CreativeModeTabs.BUILDING_BLOCKS) {

			tabData.accept(ErikmodModBlocks.ERIK_BLOCKS.get().asItem());
			tabData.accept(ErikmodModBlocks.ERIKYTU.get().asItem());

		} else if (tabData.getTabKey() == CreativeModeTabs.SPAWN_EGGS) {

			tabData.accept(ErikmodModItems.ERIKIISHIM_SPAWN_EGG.get());
			tabData.accept(ErikmodModItems.ERIKBLUE_SPAWN_EGG.get());

		} else if (tabData.getTabKey() == CreativeModeTabs.TOOLS_AND_UTILITIES) {

			tabData.accept(ErikmodModItems.ERIKISHIM.get());

		}
	}
}
