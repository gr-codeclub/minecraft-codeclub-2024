package net.mcreator.cinnamoroll.procedures;

import net.minecraft.world.level.block.state.properties.Property;
import net.minecraft.world.level.block.state.properties.EnumProperty;
import net.minecraft.world.level.block.state.BlockState;
import net.minecraft.world.level.block.Blocks;
import net.minecraft.world.level.LevelAccessor;
import net.minecraft.core.BlockPos;

import net.mcreator.cinnamoroll.init.CinnamorollModBlocks;

public class HouseOnBlockRightClickedProcedure {
	public static void execute(LevelAccessor world, double x, double y, double z) {
		double xoffset = 0;
		double zoffset = 0;
		double yoffset = 0;
		xoffset = -2;
		yoffset = 0;
		zoffset = -2;
		for (int index0 = 0; index0 < 5; index0++) {
			for (int index1 = 0; index1 < 5; index1++) {
				world.setBlock(BlockPos.containing(x + xoffset, y - 1, z + zoffset), CinnamorollModBlocks.HOUSE.get().defaultBlockState(), 3);
				world.setBlock(BlockPos.containing(x + xoffset, y + 3, z + zoffset), CinnamorollModBlocks.HOUSE.get().defaultBlockState(), 3);
				xoffset = xoffset + 1;
			}
			xoffset = -2;
			zoffset = zoffset + 1;
		}
		xoffset = -2;
		yoffset = 0;
		zoffset = -2;
		for (int index2 = 0; index2 < 3; index2++) {
			for (int index3 = 0; index3 < 5; index3++) {
				world.setBlock(BlockPos.containing(x + xoffset, y + yoffset, z + 2), CinnamorollModBlocks.HOUSE.get().defaultBlockState(), 3);
				world.setBlock(BlockPos.containing(x + xoffset, y + yoffset, z - 2), CinnamorollModBlocks.HOUSE.get().defaultBlockState(), 3);
				xoffset = xoffset + 1;
			}
			xoffset = -2;
			yoffset = yoffset + 1;
		}
		xoffset = -2;
		yoffset = 0;
		zoffset = -2;
		for (int index4 = 0; index4 < 3; index4++) {
			for (int index5 = 0; index5 < 5; index5++) {
				world.setBlock(BlockPos.containing(x + 2, y + yoffset, z + zoffset), CinnamorollModBlocks.HOUSE.get().defaultBlockState(), 3);
				world.setBlock(BlockPos.containing(x - 2, y + yoffset, z + zoffset), CinnamorollModBlocks.HOUSE.get().defaultBlockState(), 3);
				zoffset = zoffset + 1;
			}
			xoffset = -2;
			yoffset = yoffset + 1;
		}
		{
			BlockPos _bp = BlockPos.containing(x + 1, y + 1, z + 2);
			BlockState _bs = Blocks.GLASS.defaultBlockState();
			BlockState _bso = world.getBlockState(_bp);
			for (Property<?> _propertyOld : _bso.getProperties()) {
				Property _propertyNew = _bs.getBlock().getStateDefinition().getProperty(_propertyOld.getName());
				if (_propertyNew != null && _bs.getValue(_propertyNew) != null)
					try {
						_bs = _bs.setValue(_propertyNew, _bso.getValue(_propertyOld));
					} catch (Exception e) {
					}
			}
			world.setBlock(_bp, _bs, 3);
		}
		{
			BlockPos _bp = BlockPos.containing(x + 2, y + 1, z + 2);
			BlockState _bs = Blocks.GLASS.defaultBlockState();
			BlockState _bso = world.getBlockState(_bp);
			for (Property<?> _propertyOld : _bso.getProperties()) {
				Property _propertyNew = _bs.getBlock().getStateDefinition().getProperty(_propertyOld.getName());
				if (_propertyNew != null && _bs.getValue(_propertyNew) != null)
					try {
						_bs = _bs.setValue(_propertyNew, _bso.getValue(_propertyOld));
					} catch (Exception e) {
					}
			}
			world.setBlock(_bp, _bs, 3);
		}
		world.setBlock(BlockPos.containing(x - 1, y, z + 2), Blocks.AIR.defaultBlockState(), 3);
		world.setBlock(BlockPos.containing(x - 1, y + 1, z + 2), Blocks.AIR.defaultBlockState(), 3);
		world.setBlock(BlockPos.containing(x - 1, y + 1, z + 2), (new Object() {
			public BlockState with(BlockState _bs, String _property, String _newValue) {
				Property<?> _prop = _bs.getBlock().getStateDefinition().getProperty(_property);
				return _prop instanceof EnumProperty _ep && _ep.getValue(_newValue).isPresent() ? _bs.setValue(_ep, (Enum) _ep.getValue(_newValue).get()) : _bs;
			}
		}.with(Blocks.OAK_DOOR.defaultBlockState(), "half", "upper")), 3);
		world.setBlock(BlockPos.containing(x - 1, y, z + 2), Blocks.OAK_DOOR.defaultBlockState(), 3);
	}
}
