package net.mcreator.yousefmod.procedures;

import net.minecraft.world.level.block.state.properties.Property;
import net.minecraft.world.level.block.state.properties.EnumProperty;
import net.minecraft.world.level.block.state.BlockState;
import net.minecraft.world.level.block.Blocks;
import net.minecraft.world.level.LevelAccessor;
import net.minecraft.core.BlockPos;

public class HousefbuilderProcedure {
	public static void execute(LevelAccessor world, double x, double y, double z) {
		double zOffset = 0;
		double xOffset = 0;
		double yOffset = 0;
		zOffset = -1;
		xOffset = -1;
		yOffset = -1;
		for (int index0 = 0; index0 < 3; index0++) {
			for (int index1 = 0; index1 < 3; index1++) {
				world.setBlock(BlockPos.containing(x + xOffset, y - 1, z + zOffset), Blocks.STRIPPED_BIRCH_WOOD.defaultBlockState(), 3);
				xOffset = 1 + xOffset;
			}
			xOffset = -1;
			zOffset = 1 + zOffset;
		}
		zOffset = -1;
		xOffset = -1;
		yOffset = -1;
		for (int index2 = 0; index2 < 3; index2++) {
			for (int index3 = 0; index3 < 3; index3++) {
				world.setBlock(BlockPos.containing(x + xOffset, y + yOffset, z + zOffset), Blocks.STRIPPED_BIRCH_WOOD.defaultBlockState(), 3);
				xOffset = 1 + xOffset;
			}
			xOffset = -1;
			yOffset = 1 + yOffset;
		}
		for (int index4 = 0; index4 < 3; index4++) {
			for (int index5 = 0; index5 < 3; index5++) {
				world.setBlock(BlockPos.containing(x + xOffset, y + 10, z + zOffset), Blocks.STRIPPED_BIRCH_WOOD.defaultBlockState(), 3);
				xOffset = 1 + xOffset;
			}
			xOffset = -1;
			zOffset = 1 + zOffset;
		}
		world.setBlock(BlockPos.containing(x + 1, y, z + 2), Blocks.GLASS.defaultBlockState(), 3);
		world.setBlock(BlockPos.containing(x + 1, y, z + 2), Blocks.GLASS.defaultBlockState(), 3);
		world.setBlock(BlockPos.containing(x - 1, y, z + 2), Blocks.AIR.defaultBlockState(), 3);
		world.setBlock(BlockPos.containing(x - 1, y + 1, z + 2), Blocks.AIR.defaultBlockState(), 3);
		world.setBlock(BlockPos.containing(x - 1, y, z + 2), Blocks.SPRUCE_DOOR.defaultBlockState(), 3);
		world.setBlock(BlockPos.containing(x - 1, y, z + 2), (new Object() {
			public BlockState with(BlockState _bs, String _property, String _newValue) {
				Property<?> _prop = _bs.getBlock().getStateDefinition().getProperty(_property);
				return _prop instanceof EnumProperty _ep && _ep.getValue(_newValue).isPresent() ? _bs.setValue(_ep, (Enum) _ep.getValue(_newValue).get()) : _bs;
			}
		}.with(Blocks.SPRUCE_DOOR.defaultBlockState(), "half", "upper")), 3);
	}
}
