
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.cinnamoroll.init;

import net.neoforged.neoforge.registries.DeferredRegister;
import net.neoforged.neoforge.registries.DeferredHolder;

import net.minecraft.world.level.block.Block;

import net.mcreator.cinnamoroll.block.WinterLandBlock;
import net.mcreator.cinnamoroll.CinnamorollMod;

public class CinnamorollModBlocks {
	public static final DeferredRegister.Blocks REGISTRY = DeferredRegister.createBlocks(CinnamorollMod.MODID);
	public static final DeferredHolder<Block, Block> WINTER_LAND = REGISTRY.register("winter_land", WinterLandBlock::new);
	// Start of user code block custom blocks
	// End of user code block custom blocks
}
