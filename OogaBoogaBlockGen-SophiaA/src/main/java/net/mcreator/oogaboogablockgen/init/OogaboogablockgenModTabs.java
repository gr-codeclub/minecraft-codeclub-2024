
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.oogaboogablockgen.init;

import net.neoforged.neoforge.registries.DeferredRegister;
import net.neoforged.neoforge.event.BuildCreativeModeTabContentsEvent;
import net.neoforged.fml.common.EventBusSubscriber;
import net.neoforged.bus.api.SubscribeEvent;

import net.minecraft.world.item.CreativeModeTabs;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.core.registries.Registries;

import net.mcreator.oogaboogablockgen.OogaboogablockgenMod;

@EventBusSubscriber(bus = EventBusSubscriber.Bus.MOD)
public class OogaboogablockgenModTabs {
	public static final DeferredRegister<CreativeModeTab> REGISTRY = DeferredRegister.create(Registries.CREATIVE_MODE_TAB, OogaboogablockgenMod.MODID);

	@SubscribeEvent
	public static void buildTabContentsVanilla(BuildCreativeModeTabContentsEvent tabData) {
		if (tabData.getTabKey() == CreativeModeTabs.BUILDING_BLOCKS) {

			tabData.accept(OogaboogablockgenModBlocks.OOGA_BOOGA_BLOCK_GEN.get().asItem());
			tabData.accept(OogaboogablockgenModBlocks.GOOFY_AHH_BLOCK_YIPPEEE.get().asItem());
			tabData.accept(OogaboogablockgenModBlocks.BUILDS_OBSIDIAN.get().asItem());
			tabData.accept(OogaboogablockgenModItems.HYPERVENTALATION_SAMSUNG_REFRIDGERATION_WAND.get());
			tabData.accept(OogaboogablockgenModBlocks.HELP_ME_PLEASE_JACOB_TRAPPED_ME_IN_HIS_BASEMENT.get().asItem());

		} else if (tabData.getTabKey() == CreativeModeTabs.FUNCTIONAL_BLOCKS) {

			tabData.accept(OogaboogablockgenModBlocks.GOOFY_AHH_BLOCK_YIPPEEE.get().asItem());
			tabData.accept(OogaboogablockgenModItems.MONEY.get());
			tabData.accept(OogaboogablockgenModItems.THANK_YOU_FOR_PAYING_YOUR_FANUM_TAX.get());
			tabData.accept(OogaboogablockgenModItems.THANKS_FOR_THE_TAX_MONEY.get());
			tabData.accept(OogaboogablockgenModItems.EMERALD_SWORD.get());
			tabData.accept(OogaboogablockgenModBlocks.BUILDS_OBSIDIAN.get().asItem());

		} else if (tabData.getTabKey() == CreativeModeTabs.OP_BLOCKS) {
			if (tabData.hasPermissions()) {
				tabData.accept(OogaboogablockgenModItems.THANK_YOU_FOR_PAYING_YOUR_FANUM_TAX.get());
				tabData.accept(OogaboogablockgenModItems.THANKS_FOR_THE_TAX_MONEY.get());
				tabData.accept(OogaboogablockgenModItems.HYPERVENTALATION_SAMSUNG_REFRIDGERATION_WAND.get());
			}
		} else if (tabData.getTabKey() == CreativeModeTabs.COMBAT) {

			tabData.accept(OogaboogablockgenModItems.EMERALD_SWORD.get());
			tabData.accept(OogaboogablockgenModItems.THE_BUILDS.get());

		} else if (tabData.getTabKey() == CreativeModeTabs.SPAWN_EGGS) {

			tabData.accept(OogaboogablockgenModItems.DUCK_SPAWN_EGG.get());

		} else if (tabData.getTabKey() == CreativeModeTabs.INGREDIENTS) {

			tabData.accept(OogaboogablockgenModItems.MONEY.get());

		} else if (tabData.getTabKey() == CreativeModeTabs.TOOLS_AND_UTILITIES) {

			tabData.accept(OogaboogablockgenModItems.OGB_WAND.get());
			tabData.accept(OogaboogablockgenModItems.MONEY.get());
			tabData.accept(OogaboogablockgenModItems.EMERALD_SWORD.get());
			tabData.accept(OogaboogablockgenModItems.THE_BUILDS.get());
			tabData.accept(OogaboogablockgenModItems.HYPERVENTALATION_SAMSUNG_REFRIDGERATION_WAND.get());

		} else if (tabData.getTabKey() == CreativeModeTabs.NATURAL_BLOCKS) {

			tabData.accept(OogaboogablockgenModItems.THE_BUILD_WATER_BUCKET.get());
			tabData.accept(OogaboogablockgenModBlocks.BUILDS_OBSIDIAN.get().asItem());

		}
	}
}
