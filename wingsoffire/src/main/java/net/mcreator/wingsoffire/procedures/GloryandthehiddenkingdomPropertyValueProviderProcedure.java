package net.mcreator.wingsoffire.procedures;

import net.minecraft.world.level.LevelAccessor;

public class GloryandthehiddenkingdomPropertyValueProviderProcedure {
	public static double execute(LevelAccessor world) {
		if (world.getLevelData().isRaining()) {
			return 0;
		}
		return 1;
	}
}
