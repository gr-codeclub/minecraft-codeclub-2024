
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.thehousetrap.init;

import net.neoforged.neoforge.registries.DeferredRegister;
import net.neoforged.neoforge.registries.DeferredBlock;

import net.minecraft.world.level.block.Block;

import net.mcreator.thehousetrap.ThehousetrapMod;

public class ThehousetrapModBlocks {
	public static final DeferredRegister.Blocks REGISTRY = DeferredRegister.createBlocks(ThehousetrapMod.MODID);
	public static final DeferredBlock<Block> CIRAEBLOCK = REGISTRY.register("ciraeblock", CiraeblockBlock::new);
	public static final DeferredBlock<Block> CIRAEISTHEBEST = REGISTRY.register("ciraeisthebest", CIRAEISTHEBESTBlock::new);
	public static final DeferredBlock<Block> HI = REGISTRY.register("hi", HiBlock::new);
	public static final DeferredBlock<Block> SQUIDGAME_PORTAL = REGISTRY.register("squidgame_portal", SquidgamePortalBlock::new);
	public static final DeferredBlock<Block> COSYBLOCK = REGISTRY.register("cosyblock", CosyblockBlock::new);
	public static final DeferredBlock<Block> CIRAEHOUSE = REGISTRY.register("ciraehouse", CiraehouseBlock::new);
	// Start of user code block custom blocks
	// End of user code block custom blocks
}
