package net.mcreator.thehousetrap.procedures;

import net.minecraft.world.level.LevelAccessor;
import net.minecraft.world.entity.Entity;
import net.minecraft.core.BlockPos;

import net.mcreator.thehousetrap.init.ThehousetrapModBlocks;

public class CiraeblockOnBlockRightClicked2Procedure {
	public static void execute(LevelAccessor world, double x, double y, double z, Entity entity) {
		if (entity == null)
			return;
		double cirae1x = 0;
		double cirae1y = 0;
		double ciraez = 0;
		cirae1x = x;
		cirae1y = y;
		ciraez = z;
		while ((world.getBlockState(BlockPos.containing(cirae1x + (entity.getDirection()).getStepX(), cirae1y + (entity.getDirection()).getStepY(), ciraez + (entity.getDirection()).getStepZ()))).getBlock() == ThehousetrapModBlocks.CIRAEBLOCK.get()) {
			cirae1x = cirae1x + (entity.getDirection()).getStepX();
			cirae1y = cirae1y + (entity.getDirection()).getStepY();
			ciraez = ciraez + (entity.getDirection()).getStepZ();
		}
		world.setBlock(BlockPos.containing(cirae1x + (entity.getDirection()).getStepX(), cirae1y + (entity.getDirection()).getStepY(), ciraez + (entity.getDirection()).getStepZ()), ThehousetrapModBlocks.CIRAEBLOCK.get().defaultBlockState(), 3);
	}
}
