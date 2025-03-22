
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.cavarli.init;

import net.neoforged.neoforge.registries.DeferredRegister;
import net.neoforged.neoforge.registries.DeferredItem;
import net.neoforged.neoforge.registries.DeferredHolder;
import net.neoforged.neoforge.common.DeferredSpawnEggItem;

import net.minecraft.world.level.block.Block;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.BlockItem;

import net.mcreator.cavarli.item.Lolc1234Item;
import net.mcreator.cavarli.item.HouseWandToolItem;
import net.mcreator.cavarli.item.CAVARLInoob1234567890Item;
import net.mcreator.cavarli.CavarliMod;

public class CavarliModItems {
	public static final DeferredRegister.Items REGISTRY = DeferredRegister.createItems(CavarliMod.MODID);
	public static final DeferredItem<Item> CAVARLI_BLOCK = block(CavarliModBlocks.CAVARLI_BLOCK);
	public static final DeferredItem<Item> CAVARL_INOOB_1234567890 = REGISTRY.register("cavarl_inoob_1234567890", CAVARLInoob1234567890Item::new);
	public static final DeferredItem<Item> OHIOTOLENOOB_1234 = block(CavarliModBlocks.OHIOTOLENOOB_1234);
	public static final DeferredItem<Item> NOOB_1234567890_OHIO_SPAWN_EGG = REGISTRY.register("noob_1234567890_ohio_spawn_egg", () -> new DeferredSpawnEggItem(CavarliModEntities.NOOB_1234567890_OHIO, -1, -1, new Item.Properties()));
	public static final DeferredItem<Item> LOLC_1234 = REGISTRY.register("lolc_1234", Lolc1234Item::new);
	public static final DeferredItem<Item> HOUSE_WAND_TOOL = REGISTRY.register("house_wand_tool", HouseWandToolItem::new);

	// Start of user code block custom items
	// End of user code block custom items
	private static DeferredItem<Item> block(DeferredHolder<Block, Block> block) {
		return REGISTRY.register(block.getId().getPath(), () -> new BlockItem(block.get(), new Item.Properties()));
	}
}
