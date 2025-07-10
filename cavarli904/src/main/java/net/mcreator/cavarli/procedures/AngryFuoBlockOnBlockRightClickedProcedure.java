package net.mcreator.cavarli.procedures;

import net.minecraft.world.level.LevelAccessor;
import net.minecraft.core.BlockPos;

import net.mcreator.cavarli.init.CavarliModBlocks;

public class AngryFuoBlockOnBlockRightClickedProcedure {
	public static void execute(LevelAccessor world, double x, double y, double z) {
		double xOffset = 0;
		double zOffset = 0;
		double yOffset = 0;
		xOffset = -2;
		zOffset = 0;
		yOffset = -2;
		for (int index0 = 0; index0 < 5; index0++) {
			for (int index1 = 0; index1 < 5; index1++) {
				world.setBlock(BlockPos.containing(x + xOffset, y - 1, z + zOffset), CavarliModBlocks.TTRS_BLOCK.get().defaultBlockState(), 3);
				world.setBlock(BlockPos.containing(x + xOffset, y - 1, z + zOffset), CavarliModBlocks.ANGRY_FUO_BLOCK.get().defaultBlockState(), 3);
				xOffset = -2;
			}
			xOffset = -2;
			zOffset = zOffset + 1;
		}
		xOffset = -2;
		zOffset = 0;
		yOffset = -2;
		for (int index2 = 0; index2 < 5; index2++) {
			for (int index3 = 0; index3 < 5; index3++) {
				world.setBlock(BlockPos.containing(x + xOffset, y - yOffset, z + 2), CavarliModBlocks.TTRS_BLOCK.get().defaultBlockState(), 3);
				world.setBlock(BlockPos.containing(x + xOffset, y - yOffset, z + 2), CavarliModBlocks.ANGRY_FUO_BLOCK.get().defaultBlockState(), 3);
				xOffset = -2;
			}
			xOffset = -2;
			zOffset = zOffset + 1;
		}
	}
}
