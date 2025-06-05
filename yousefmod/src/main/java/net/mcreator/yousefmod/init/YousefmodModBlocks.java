
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.yousefmod.init;

import net.neoforged.neoforge.registries.DeferredRegister;
import net.neoforged.neoforge.registries.DeferredBlock;

import net.minecraft.world.level.block.Block;

import net.mcreator.yousefmod.block.TestblockyousefBlock;
import net.mcreator.yousefmod.block.SquidGamedimensionPortalBlock;
import net.mcreator.yousefmod.block.ImadyousefblockBlock;
import net.mcreator.yousefmod.block.FootballBlock;
import net.mcreator.yousefmod.block.BlocBlock;
import net.mcreator.yousefmod.block.BebeaBlock;
import net.mcreator.yousefmod.YousefmodMod;

public class YousefmodModBlocks {
	public static final DeferredRegister.Blocks REGISTRY = DeferredRegister.createBlocks(YousefmodMod.MODID);
	public static final DeferredBlock<Block> BEBEA = REGISTRY.register("bebea", BebeaBlock::new);
	public static final DeferredBlock<Block> IMADYOUSEFBLOCK = REGISTRY.register("imadyousefblock", ImadyousefblockBlock::new);
	public static final DeferredBlock<Block> TESTBLOCKYOUSEF = REGISTRY.register("testblockyousef", TestblockyousefBlock::new);
	public static final DeferredBlock<Block> SQUID_GAMEDIMENSION_PORTAL = REGISTRY.register("squid_gamedimension_portal", SquidGamedimensionPortalBlock::new);
	public static final DeferredBlock<Block> FOOTBALL = REGISTRY.register("football", FootballBlock::new);
	public static final DeferredBlock<Block> BLOC = REGISTRY.register("bloc", BlocBlock::new);
	// Start of user code block custom blocks
	// End of user code block custom blocks
}
