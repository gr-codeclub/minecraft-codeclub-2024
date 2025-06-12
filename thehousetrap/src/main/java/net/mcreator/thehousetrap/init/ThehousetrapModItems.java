
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.thehousetrap.init;

import net.neoforged.neoforge.registries.DeferredRegister;
import net.neoforged.neoforge.registries.DeferredItem;
import net.neoforged.neoforge.registries.DeferredHolder;
import net.neoforged.neoforge.common.DeferredSpawnEggItem;

import net.minecraft.world.level.block.Block;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.BlockItem;

import net.mcreator.thehousetrap.item.SquidgameItem;
import net.mcreator.thehousetrap.item.CiraeFroggyItem;
import net.mcreator.thehousetrap.ThehousetrapMod;

public class ThehousetrapModItems {
	public static final DeferredRegister.Items REGISTRY = DeferredRegister.createItems(ThehousetrapMod.MODID);
	public static final DeferredItem<Item> CIRAEBLOCK = block(ThehousetrapModBlocks.CIRAEBLOCK);
	public static final DeferredItem<Item> CIRAE_FROGGY = REGISTRY.register("cirae_froggy", CiraeFroggyItem::new);
	public static final DeferredItem<Item> CIRAEISTHEBEST = block(ThehousetrapModBlocks.CIRAEISTHEBEST);
	public static final DeferredItem<Item> CIRAEWOLF_SPAWN_EGG = REGISTRY.register("ciraewolf_spawn_egg", () -> new DeferredSpawnEggItem(ThehousetrapModEntities.CIRAEWOLF, -1, -1, new Item.Properties()));
	public static final DeferredItem<Item> HI = block(ThehousetrapModBlocks.HI);
	public static final DeferredItem<Item> SQUIDGAME = REGISTRY.register("squidgame", SquidgameItem::new);
	public static final DeferredItem<Item> COSYBLOCK = block(ThehousetrapModBlocks.COSYBLOCK);
	public static final DeferredItem<Item> CIRAEHOUSE = block(ThehousetrapModBlocks.CIRAEHOUSE);
	public static final DeferredItem<Item> CIRAE_CHAIR_SPAWN_EGG = REGISTRY.register("cirae_chair_spawn_egg", () -> new DeferredSpawnEggItem(ThehousetrapModEntities.CIRAE_CHAIR, -1, -1, new Item.Properties()));
	public static final DeferredItem<Item> DEX_SPAWN_EGG = REGISTRY.register("dex_spawn_egg", () -> new DeferredSpawnEggItem(ThehousetrapModEntities.DEX, -1, -1, new Item.Properties()));

	// Start of user code block custom items
	// End of user code block custom items
	private static DeferredItem<Item> block(DeferredHolder<Block, Block> block) {
		return REGISTRY.register(block.getId().getPath(), () -> new BlockItem(block.get(), new Item.Properties()));
	}
}
