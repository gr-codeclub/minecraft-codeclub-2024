
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.erikmod.init;

import net.neoforged.neoforge.registries.DeferredRegister;
import net.neoforged.neoforge.registries.DeferredItem;
import net.neoforged.neoforge.registries.DeferredHolder;
import net.neoforged.neoforge.common.DeferredSpawnEggItem;

import net.minecraft.world.level.block.Block;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.BlockItem;

import net.mcreator.erikmod.item.ErikwandthebestItem;
import net.mcreator.erikmod.item.ErikishimItem;
import net.mcreator.erikmod.ErikmodMod;

public class ErikmodModItems {
	public static final DeferredRegister.Items REGISTRY = DeferredRegister.createItems(ErikmodMod.MODID);
	public static final DeferredItem<Item> ERIK_BLOCKS = block(ErikmodModBlocks.ERIK_BLOCKS);
	public static final DeferredItem<Item> ERIKWANDTHEBEST = REGISTRY.register("erikwandthebest", ErikwandthebestItem::new);
	public static final DeferredItem<Item> ERIKYTU = block(ErikmodModBlocks.ERIKYTU);
	public static final DeferredItem<Item> ERIKIISHIM_SPAWN_EGG = REGISTRY.register("erikiishim_spawn_egg", () -> new DeferredSpawnEggItem(ErikmodModEntities.ERIKIISHIM, -1, -1, new Item.Properties()));
	public static final DeferredItem<Item> ERIKISHIM = REGISTRY.register("erikishim", ErikishimItem::new);
	public static final DeferredItem<Item> ABOY = block(ErikmodModBlocks.ABOY);
	public static final DeferredItem<Item> ERIKBLUE_SPAWN_EGG = REGISTRY.register("erikblue_spawn_egg", () -> new DeferredSpawnEggItem(ErikmodModEntities.ERIKBLUE, -1, -1, new Item.Properties()));
	public static final DeferredItem<Item> SHOCKWAVE_SPAWN_EGG = REGISTRY.register("shockwave_spawn_egg", () -> new DeferredSpawnEggItem(ErikmodModEntities.SHOCKWAVE, -1, -1, new Item.Properties()));

	// Start of user code block custom items
	// End of user code block custom items
	private static DeferredItem<Item> block(DeferredHolder<Block, Block> block) {
		return REGISTRY.register(block.getId().getPath(), () -> new BlockItem(block.get(), new Item.Properties()));
	}
}
