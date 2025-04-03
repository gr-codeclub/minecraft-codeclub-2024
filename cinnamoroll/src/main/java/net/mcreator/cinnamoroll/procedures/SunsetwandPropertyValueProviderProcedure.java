package net.mcreator.cinnamoroll.procedures;

import net.minecraft.world.level.LevelAccessor;

public class SunsetwandPropertyValueProviderProcedure {
	public static double execute(LevelAccessor world) {
		if (world.getLevelData().isRaining()) {
			return 0;
		}
		return 1;
	}
}
