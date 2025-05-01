package net.mcreator.something.procedures;

import net.minecraft.world.level.block.Blocks;
import net.minecraft.world.level.LevelAccessor;
import net.minecraft.core.BlockPos;

public class AbsouloutleyNotJakyOnBlockRightClickedProcedure {
	public static void execute(LevelAccessor world, double x, double y, double z) {
		double xOfset = 0;
		double yOfset = 0;
		double zOfset = 0;
		xOfset = -2;
		yOfset = 0;
		zOfset = -2;
		for (int index0 = 0; index0 < 5; index0++) {
			for (int index1 = 0; index1 < 5; index1++) {
				world.setBlock(BlockPos.containing(x + xOfset, y - 1, z + zOfset), Blocks.OAK_PLANKS.defaultBlockState(), 3);
				world.setBlock(BlockPos.containing(x + xOfset, y + 3, z + zOfset), Blocks.CHERRY_PLANKS.defaultBlockState(), 3);
				xOfset = xOfset + 1;
			}
			xOfset = -2;
			zOfset = zOfset + 1;
		}
		yOfset = 0;
		zOfset = -2;
		for (int index2 = 0; index2 < 3; index2++) {
			for (int index3 = 0; index3 < 5; index3++) {
				world.setBlock(BlockPos.containing(x + 2, y + yOfset, z + zOfset), Blocks.BAMBOO_MOSAIC.defaultBlockState(), 3);
				world.setBlock(BlockPos.containing(x - 2, y + yOfset, z + zOfset), Blocks.CRIMSON_PLANKS.defaultBlockState(), 3);
				zOfset = zOfset + 1;
			}
			zOfset = -2;
			yOfset = yOfset + 1;
		}
		xOfset = -2;
		yOfset = 0;
		for (int index4 = 0; index4 < 3; index4++) {
			for (int index5 = 0; index5 < 5; index5++) {
				world.setBlock(BlockPos.containing(x + xOfset, y + yOfset, z - 2), Blocks.WAXED_WEATHERED_CHISELED_COPPER.defaultBlockState(), 3);
				world.setBlock(BlockPos.containing(x + xOfset, y + yOfset, z + 2), Blocks.REDSTONE_BLOCK.defaultBlockState(), 3);
				xOfset = xOfset + 1;
			}
			xOfset = -2;
			yOfset = yOfset + 1;
		}
	}
}
