
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.yousefmod.init;

import net.neoforged.neoforge.registries.DeferredRegister;
import net.neoforged.neoforge.registries.DeferredItem;
import net.neoforged.neoforge.registries.DeferredHolder;
import net.neoforged.neoforge.common.DeferredSpawnEggItem;

import net.minecraft.world.level.block.Block;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.BlockItem;

import net.mcreator.yousefmod.item.YOUSEFwandItem;
import net.mcreator.yousefmod.item.SquidGamedimensionItem;
import net.mcreator.yousefmod.YousefmodMod;

public class YousefmodModItems {
	public static final DeferredRegister.Items REGISTRY = DeferredRegister.createItems(YousefmodMod.MODID);
	public static final DeferredItem<Item> BEBEA = block(YousefmodModBlocks.BEBEA);
	public static final DeferredItem<Item> YOUSE_FWAND = REGISTRY.register("youse_fwand", YOUSEFwandItem::new);
	public static final DeferredItem<Item> IMADYOUSEFBLOCK = block(YousefmodModBlocks.IMADYOUSEFBLOCK);
	public static final DeferredItem<Item> DRAGONN_SPAWN_EGG = REGISTRY.register("dragonn_spawn_egg", () -> new DeferredSpawnEggItem(YousefmodModEntities.DRAGONN, -1, -1, new Item.Properties()));
	public static final DeferredItem<Item> TESTBLOCKYOUSEF = block(YousefmodModBlocks.TESTBLOCKYOUSEF);
	public static final DeferredItem<Item> SQUID_GAMEDIMENSION = REGISTRY.register("squid_gamedimension", SquidGamedimensionItem::new);
	public static final DeferredItem<Item> FOOTBALL = block(YousefmodModBlocks.FOOTBALL);
	public static final DeferredItem<Item> YOYOCHAIR_SPAWN_EGG = REGISTRY.register("yoyochair_spawn_egg", () -> new DeferredSpawnEggItem(YousefmodModEntities.YOYOCHAIR, -1, -1, new Item.Properties()));
	public static final DeferredItem<Item> BLOC = block(YousefmodModBlocks.BLOC);
	public static final DeferredItem<Item> MBINIGUSINI_SPAWN_EGG = REGISTRY.register("mbinigusini_spawn_egg", () -> new DeferredSpawnEggItem(YousefmodModEntities.MBINIGUSINI, -1, -1, new Item.Properties()));

	// Start of user code block custom items
	// End of user code block custom items
	private static DeferredItem<Item> block(DeferredHolder<Block, Block> block) {
		return REGISTRY.register(block.getId().getPath(), () -> new BlockItem(block.get(), new Item.Properties()));
	}
}
