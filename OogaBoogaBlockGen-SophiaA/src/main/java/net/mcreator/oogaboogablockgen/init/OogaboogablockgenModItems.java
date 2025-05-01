
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.oogaboogablockgen.init;

import net.neoforged.neoforge.registries.DeferredRegister;
import net.neoforged.neoforge.registries.DeferredItem;
import net.neoforged.neoforge.registries.DeferredHolder;
import net.neoforged.neoforge.common.DeferredSpawnEggItem;

import net.minecraft.world.level.block.Block;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.BlockItem;

import net.mcreator.oogaboogablockgen.item.TheBuildsItem;
import net.mcreator.oogaboogablockgen.item.TheBuildWaterItem;
import net.mcreator.oogaboogablockgen.item.ThanksForTheTaxMoneyItem;
import net.mcreator.oogaboogablockgen.item.ThankYouForPayingYourFanumTaxItem;
import net.mcreator.oogaboogablockgen.item.OGBWandItem;
import net.mcreator.oogaboogablockgen.item.MoneyItem;
import net.mcreator.oogaboogablockgen.item.HyperventalationSamsungRefridgerationWandItem;
import net.mcreator.oogaboogablockgen.item.EmeraldSwordItem;
import net.mcreator.oogaboogablockgen.OogaboogablockgenMod;

public class OogaboogablockgenModItems {
	public static final DeferredRegister.Items REGISTRY = DeferredRegister.createItems(OogaboogablockgenMod.MODID);
	public static final DeferredItem<Item> OOGA_BOOGA_BLOCK_GEN = block(OogaboogablockgenModBlocks.OOGA_BOOGA_BLOCK_GEN);
	public static final DeferredItem<Item> OGB_WAND = REGISTRY.register("ogb_wand", OGBWandItem::new);
	public static final DeferredItem<Item> GOOFY_AHH_BLOCK_YIPPEEE = block(OogaboogablockgenModBlocks.GOOFY_AHH_BLOCK_YIPPEEE);
	public static final DeferredItem<Item> MONEY = REGISTRY.register("money", MoneyItem::new);
	public static final DeferredItem<Item> THANK_YOU_FOR_PAYING_YOUR_FANUM_TAX = REGISTRY.register("thank_you_for_paying_your_fanum_tax", ThankYouForPayingYourFanumTaxItem::new);
	public static final DeferredItem<Item> THANKS_FOR_THE_TAX_MONEY = REGISTRY.register("thanks_for_the_tax_money", ThanksForTheTaxMoneyItem::new);
	public static final DeferredItem<Item> DUCK_SPAWN_EGG = REGISTRY.register("duck_spawn_egg", () -> new DeferredSpawnEggItem(OogaboogablockgenModEntities.DUCK, -15120359, -11648462, new Item.Properties()));
	public static final DeferredItem<Item> EMERALD_SWORD = REGISTRY.register("emerald_sword", EmeraldSwordItem::new);
	public static final DeferredItem<Item> THE_BUILD_WATER_BUCKET = REGISTRY.register("the_build_water_bucket", TheBuildWaterItem::new);
	public static final DeferredItem<Item> THE_BUILDS = REGISTRY.register("the_builds", TheBuildsItem::new);
	public static final DeferredItem<Item> BUILDS_OBSIDIAN = block(OogaboogablockgenModBlocks.BUILDS_OBSIDIAN);
	public static final DeferredItem<Item> BUILDBLOCKKKKKKKKKKKKKK = block(OogaboogablockgenModBlocks.BUILDBLOCKKKKKKKKKKKKKK);
	public static final DeferredItem<Item> HYPERVENTALATION_SAMSUNG_REFRIDGERATION_WAND = REGISTRY.register("hyperventalation_samsung_refridgeration_wand", HyperventalationSamsungRefridgerationWandItem::new);
	public static final DeferredItem<Item> HELP_ME_PLEASE_JACOB_TRAPPED_ME_IN_HIS_BASEMENT = block(OogaboogablockgenModBlocks.HELP_ME_PLEASE_JACOB_TRAPPED_ME_IN_HIS_BASEMENT);
	public static final DeferredItem<Item> CHAIR_SPAWN_EGG = REGISTRY.register("chair_spawn_egg", () -> new DeferredSpawnEggItem(OogaboogablockgenModEntities.CHAIR, -6239863, -7309725, new Item.Properties()));

	// Start of user code block custom items
	// End of user code block custom items
	private static DeferredItem<Item> block(DeferredHolder<Block, Block> block) {
		return REGISTRY.register(block.getId().getPath(), () -> new BlockItem(block.get(), new Item.Properties()));
	}
}
