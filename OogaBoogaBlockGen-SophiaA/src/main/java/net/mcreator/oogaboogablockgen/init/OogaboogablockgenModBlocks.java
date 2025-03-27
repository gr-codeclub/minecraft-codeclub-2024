
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.oogaboogablockgen.init;

import net.neoforged.neoforge.registries.DeferredRegister;
import net.neoforged.neoforge.registries.DeferredBlock;

import net.minecraft.world.level.block.Block;

import net.mcreator.oogaboogablockgen.block.TheBuildsPortalBlock;
import net.mcreator.oogaboogablockgen.block.TheBuildWaterBlock;
import net.mcreator.oogaboogablockgen.block.OogaBoogaBlockGenBlock;
import net.mcreator.oogaboogablockgen.block.HelpMePleaseJamillaTrappedMeInHerBasementBlock;
import net.mcreator.oogaboogablockgen.block.GoofyAhhBlockYIPPEEEBlock;
import net.mcreator.oogaboogablockgen.block.BuildsObsidioBlock;
import net.mcreator.oogaboogablockgen.block.BUILDBLOCKKKKKKKKKKKKKKBlock;
import net.mcreator.oogaboogablockgen.OogaboogablockgenMod;

public class OogaboogablockgenModBlocks {
	public static final DeferredRegister.Blocks REGISTRY = DeferredRegister.createBlocks(OogaboogablockgenMod.MODID);
	public static final DeferredBlock<Block> OOGA_BOOGA_BLOCK_GEN = REGISTRY.register("ooga_booga_block_gen", OogaBoogaBlockGenBlock::new);
	public static final DeferredBlock<Block> GOOFY_AHH_BLOCK_YIPPEEE = REGISTRY.register("goofy_ahh_block_yippeee", GoofyAhhBlockYIPPEEEBlock::new);
	public static final DeferredBlock<Block> THE_BUILD_WATER = REGISTRY.register("the_build_water", TheBuildWaterBlock::new);
	public static final DeferredBlock<Block> THE_BUILDS_PORTAL = REGISTRY.register("the_builds_portal", TheBuildsPortalBlock::new);
	public static final DeferredBlock<Block> BUILDS_OBSIDIAN = REGISTRY.register("builds_obsidian", BuildsObsidioBlock::new);
	public static final DeferredBlock<Block> BUILDBLOCKKKKKKKKKKKKKK = REGISTRY.register("buildblockkkkkkkkkkkkkk", BUILDBLOCKKKKKKKKKKKKKKBlock::new);
	public static final DeferredBlock<Block> HELP_ME_PLEASE_JACOB_TRAPPED_ME_IN_HIS_BASEMENT = REGISTRY.register("help_me_please_jacob_trapped_me_in_his_basement", HelpMePleaseJamillaTrappedMeInHerBasementBlock::new);
	// Start of user code block custom blocks
	// End of user code block custom blocks
}
