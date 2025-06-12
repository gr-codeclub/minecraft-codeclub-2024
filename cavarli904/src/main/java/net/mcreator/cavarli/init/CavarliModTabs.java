
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.cavarli.init;

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

import net.mcreator.cavarli.CavarliMod;

@EventBusSubscriber(bus = EventBusSubscriber.Bus.MOD)
public class CavarliModTabs {
	public static final DeferredRegister<CreativeModeTab> REGISTRY = DeferredRegister.create(Registries.CREATIVE_MODE_TAB, CavarliMod.MODID);
	public static final DeferredHolder<CreativeModeTab, CreativeModeTab> OHIOCAVARLI = REGISTRY.register("ohiocavarli",
			() -> CreativeModeTab.builder().title(Component.translatable("item_group.cavarli.ohiocavarli")).icon(() -> new ItemStack(CavarliModBlocks.CAVARLI_BLOCK.get())).displayItems((parameters, tabData) -> {
				tabData.accept(CavarliModItems.CAVARL_INOOB_1234567890.get());
			}).withSearchBar().build());

	@SubscribeEvent
	public static void buildTabContentsVanilla(BuildCreativeModeTabContentsEvent tabData) {
		if (tabData.getTabKey() == CreativeModeTabs.BUILDING_BLOCKS) {

			tabData.accept(CavarliModBlocks.CAVARLI_BLOCK.get().asItem());

		} else if (tabData.getTabKey() == CreativeModeTabs.SPAWN_EGGS) {

			tabData.accept(CavarliModItems.NOOB_1234567890_OHIO_SPAWN_EGG.get());

		} else if (tabData.getTabKey() == CreativeModeTabs.TOOLS_AND_UTILITIES) {

			tabData.accept(CavarliModItems.LOLC_1234.get());

		}
	}
}
