package net.mcreator.yousefmod.procedures;

import net.minecraft.world.level.block.Blocks;
import net.minecraft.world.level.LevelAccessor;
import net.minecraft.core.BlockPos;

public class HousefbuilderProcedure {
	public static void execute(LevelAccessor world, double x, double y, double z) {
		double zOffset = 0;
		double xOffset = 0;
		double yOffset = 0;
		zOffset = -2;
		xOffset = -2;
		yOffset = 0;
		for (int index0 = 0; index0 < 5; index0++) {
			for (int index1 = 0; index1 < 5; index1++) {
				world.setBlock(BlockPos.containing(x + xOffset, y - 1, z + zOffset), Blocks.SMOOTH_SANDSTONE.defaultBlockState(), 3);
				world.setBlock(BlockPos.containing(x + xOffset, y + 3, z + zOffset), Blocks.SMOOTH_SANDSTONE.defaultBlockState(), 3);
				xOffset = 1 + xOffset;
			}
			xOffset = -2;
			zOffset = 1 + zOffset;
		}
		xOffset = -2;
		yOffset = 0;
		for (int index2 = 0; index2 < 3; index2++) {
			for (int index3 = 0; index3 < 5; index3++) {
				world.setBlock(BlockPos.containing(x + xOffset, y + yOffset, z + 2), Blocks.SMOOTH_SANDSTONE.defaultBlockState(), 3);
				world.setBlock(BlockPos.containing(x + xOffset, y + yOffset, z - 2), Blocks.SMOOTH_SANDSTONE.defaultBlockState(), 3);
				xOffset = 1 + xOffset;
			}
			xOffset = -2;
			yOffset = 1 + yOffset;
		}
		zOffset = -2;
		xOffset = -2;
		yOffset = 0;
		for (int index4 = 0; index4 < 5; index4++) {
			world.setBlock(BlockPos.containing(x + 2, y + yOffset, z + zOffset), Blocks.SMOOTH_SANDSTONE.defaultBlockState(), 3);
			world.setBlock(BlockPos.containing(x - 2, y + yOffset, z + zOffset), Blocks.SMOOTH_SANDSTONE.defaultBlockState(), 3);
			zOffset = 1 + zOffset;
		}
		zOffset = -2;
		yOffset = 1 + yOffset;
	}
}
