package net.mcreator.oogaboogablockgen.procedures;

import net.minecraft.world.level.block.state.properties.Property;
import net.minecraft.world.level.block.state.properties.EnumProperty;
import net.minecraft.world.level.block.state.BlockState;
import net.minecraft.world.level.block.Blocks;
import net.minecraft.world.level.LevelAccessor;
import net.minecraft.core.BlockPos;

public class OGBWandRightclickedProcedure {
	public static void execute(LevelAccessor world, double x, double y, double z) {
		double ZOffset = 0;
		double XOffset = 0;
		double YOffset = 0;
		double X1Offset = 0;
		double Z1Offset = 0;
		double X2Offset = 0;
		double Z2Offset = 0;
		ZOffset = -2;
		XOffset = -2;
		YOffset = 0;
		for (int index0 = 0; index0 < 5; index0++) {
			for (int index1 = 0; index1 < 7; index1++) {
				world.setBlock(BlockPos.containing(x + XOffset, y + 0, z + ZOffset), Blocks.OAK_PLANKS.defaultBlockState(), 3);
				world.setBlock(BlockPos.containing(x + XOffset, y + 5, z + ZOffset), Blocks.SMOOTH_QUARTZ.defaultBlockState(), 3);
				XOffset = XOffset + 1;
			}
			ZOffset = ZOffset + 1;
			XOffset = -2;
		}
		XOffset = -2;
		YOffset = 0;
		for (int index2 = 0; index2 < 7; index2++) {
			for (int index3 = 0; index3 < 5; index3++) {
				world.setBlock(BlockPos.containing(x + XOffset, y + YOffset, z + 2), Blocks.POLISHED_ANDESITE.defaultBlockState(), 3);
				world.setBlock(BlockPos.containing(x + XOffset, y + YOffset, z - 2), Blocks.QUARTZ_PILLAR.defaultBlockState(), 3);
				XOffset = XOffset + 1;
			}
			YOffset = YOffset + 1;
			XOffset = -2;
		}
		ZOffset = -2;
		YOffset = 0;
		XOffset = -2;
		for (int index4 = 0; index4 < 7; index4++) {
			for (int index5 = 0; index5 < 5; index5++) {
				world.setBlock(BlockPos.containing(x + 2, y + YOffset, z + ZOffset), Blocks.QUARTZ_PILLAR.defaultBlockState(), 3);
				world.setBlock(BlockPos.containing(x - 2, y + YOffset, z + ZOffset), Blocks.QUARTZ_PILLAR.defaultBlockState(), 3);
				ZOffset = ZOffset + 1;
			}
			YOffset = YOffset + 1;
			ZOffset = -2;
		}
		world.setBlock(BlockPos.containing(x + 1, y + 3, z + 2), Blocks.LIGHT_GRAY_STAINED_GLASS_PANE.defaultBlockState(), 3);
		world.setBlock(BlockPos.containing(x + 1, y + 1, z + 2), Blocks.LIGHT_GRAY_STAINED_GLASS_PANE.defaultBlockState(), 3);
		world.setBlock(BlockPos.containing(x + 1, y + 2, z + 2), Blocks.LIGHT_GRAY_STAINED_GLASS_PANE.defaultBlockState(), 3);
		world.setBlock(BlockPos.containing(x - 1, y + 1, z + 2), Blocks.AIR.defaultBlockState(), 3);
		world.setBlock(BlockPos.containing(x - 1, y + 2, z + 2), Blocks.AIR.defaultBlockState(), 3);
		world.setBlock(BlockPos.containing(x - 1, y + 2, z + 2), (new Object() {
			public BlockState with(BlockState _bs, String _property, String _newValue) {
				Property<?> _prop = _bs.getBlock().getStateDefinition().getProperty(_property);
				return _prop instanceof EnumProperty _ep && _ep.getValue(_newValue).isPresent() ? _bs.setValue(_ep, (Enum) _ep.getValue(_newValue).get()) : _bs;
			}
		}.with(Blocks.BAMBOO_DOOR.defaultBlockState(), "half", "upper")), 3);
		world.setBlock(BlockPos.containing(x - 1, y + 1, z + 2), Blocks.BAMBOO_DOOR.defaultBlockState(), 3);
	}
}
