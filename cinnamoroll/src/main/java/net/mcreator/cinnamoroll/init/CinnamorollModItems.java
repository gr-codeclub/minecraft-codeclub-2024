
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.cinnamoroll.init;

import net.neoforged.neoforge.registries.DeferredRegister;
import net.neoforged.neoforge.registries.DeferredHolder;

import net.minecraft.world.level.block.Block;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.BlockItem;

import net.mcreator.cinnamoroll.CinnamorollMod;

public class CinnamorollModItems {
	public static final DeferredRegister.Items REGISTRY = DeferredRegister.createItems(CinnamorollMod.MODID);
	public static final DeferredHolder<Item, Item> WINTER_LAND = block(CinnamorollModBlocks.WINTER_LAND);

	// Start of user code block custom items
	// End of user code block custom items
	private static DeferredHolder<Item, Item> block(DeferredHolder<Block, Block> block) {
		return REGISTRY.register(block.getId().getPath(), () -> new BlockItem(block.get(), new Item.Properties()));
	}
}
