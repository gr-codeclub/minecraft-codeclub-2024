package net.mcreator.thehousetrap.procedures;

import net.minecraft.world.level.block.Blocks;
import net.minecraft.world.level.LevelAccessor;
import net.minecraft.core.BlockPos;

import net.mcreator.thehousetrap.init.ThehousetrapModBlocks;

public class IdkOnBlockRightClickedProcedure {
	public static void execute(LevelAccessor world, double x, double y, double z) {
		double xoffset = 0;
		double yoffset = 0;
		double zoffeset = 0;
		xoffset = -2;
		yoffset = 0;
		zoffeset = -2;
		for (int index0 = 0; index0 < 5; index0++) {
			for (int index1 = 0; index1 < 5; index1++) {
				world.setBlock(BlockPos.containing(x + xoffset, y - 1, z + zoffeset), ThehousetrapModBlocks.COSYBLOCK.get().defaultBlockState(), 3);
				world.setBlock(BlockPos.containing(x + xoffset, y + 3, z + zoffeset), Blocks.STRIPPED_CHERRY_LOG.defaultBlockState(), 3);
				xoffset = xoffset + 1;
			}
			xoffset = -2;
			zoffeset = zoffeset + 1;
		}
		xoffset = -2;
		yoffset = 0;
		zoffeset = -2;
		for (int index2 = 0; index2 < 3; index2++) {
			for (int index3 = 0; index3 < 5; index3++) {
				world.setBlock(BlockPos.containing(x - 2, y + yoffset, z + zoffeset), ThehousetrapModBlocks.COSYBLOCK.get().defaultBlockState(), 3);
				world.setBlock(BlockPos.containing(x + 2, y + yoffset, z + zoffeset), Blocks.STRIPPED_CHERRY_LOG.defaultBlockState(), 3);
				zoffeset = xoffset + 1;
			}
			zoffeset = -2;
			yoffset = yoffset + 1;
		}
		xoffset = -2;
		yoffset = 0;
		zoffeset = -2;
		for (int index4 = 0; index4 < 3; index4++) {
			for (int index5 = 0; index5 < 5; index5++) {
				world.setBlock(BlockPos.containing(x + xoffset, y + yoffset, z - 2), ThehousetrapModBlocks.COSYBLOCK.get().defaultBlockState(), 3);
				world.setBlock(BlockPos.containing(x + xoffset, y + yoffset, z + 2), Blocks.STRIPPED_CHERRY_LOG.defaultBlockState(), 3);
				xoffset = xoffset + 1;
			}
			xoffset = -2;
			yoffset = yoffset + 1;
		}
	}
}
