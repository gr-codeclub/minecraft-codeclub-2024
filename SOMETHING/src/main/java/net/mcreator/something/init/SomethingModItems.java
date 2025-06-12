
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.something.init;

import net.neoforged.neoforge.registries.DeferredRegister;
import net.neoforged.neoforge.registries.DeferredItem;
import net.neoforged.neoforge.registries.DeferredHolder;
import net.neoforged.neoforge.common.DeferredSpawnEggItem;

import net.minecraft.world.level.block.Block;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.BlockItem;

import net.mcreator.something.item.TheKEYItem;
import net.mcreator.something.item.OverunderItem;
import net.mcreator.something.item.NOTWATERItem;
import net.mcreator.something.item.JakysDimentionItem;
import net.mcreator.something.SomethingMod;

public class SomethingModItems {
	public static final DeferredRegister.Items REGISTRY = DeferredRegister.createItems(SomethingMod.MODID);
	public static final DeferredItem<Item> THE_KEY = REGISTRY.register("the_key", TheKEYItem::new);
	public static final DeferredItem<Item> JUSTINBEBE = block(SomethingModBlocks.JUSTINBEBE);
	public static final DeferredItem<Item> NOTWATER_BUCKET = REGISTRY.register("notwater_bucket", NOTWATERItem::new);
	public static final DeferredItem<Item> OVERUNDER = REGISTRY.register("overunder", OverunderItem::new);
	public static final DeferredItem<Item> VOLDEMORT_IS_STEALING_MY_SHAMPOO = block(SomethingModBlocks.VOLDEMORT_IS_STEALING_MY_SHAMPOO);
	public static final DeferredItem<Item> KITYY_JAKY_SPAWN_EGG = REGISTRY.register("kityy_jaky_spawn_egg", () -> new DeferredSpawnEggItem(SomethingModEntities.KITYY_JAKY, -1, -1, new Item.Properties()));
	public static final DeferredItem<Item> JAKYS_DIMENTION = REGISTRY.register("jakys_dimention", JakysDimentionItem::new);
	public static final DeferredItem<Item> EPIC_GAMES_SWORD_JAKY = block(SomethingModBlocks.EPIC_GAMES_SWORD_JAKY);
	public static final DeferredItem<Item> ABSOULOUTLEY_NOT_JAKY = block(SomethingModBlocks.ABSOULOUTLEY_NOT_JAKY);
	public static final DeferredItem<Item> JAKY_CHAIR_SPAWN_EGG = REGISTRY.register("jaky_chair_spawn_egg", () -> new DeferredSpawnEggItem(SomethingModEntities.JAKY_CHAIR, -1, -1, new Item.Properties()));
	public static final DeferredItem<Item> POO_SPAWN_EGG = REGISTRY.register("poo_spawn_egg", () -> new DeferredSpawnEggItem(SomethingModEntities.POO, -1, -1, new Item.Properties()));

	// Start of user code block custom items
	// End of user code block custom items
	private static DeferredItem<Item> block(DeferredHolder<Block, Block> block) {
		return REGISTRY.register(block.getId().getPath(), () -> new BlockItem(block.get(), new Item.Properties()));
	}
}
