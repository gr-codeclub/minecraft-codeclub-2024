package net.mcreator.dextermod.procedures;

import net.minecraft.world.phys.Vec3;
import net.minecraft.world.level.LevelAccessor;
import net.minecraft.world.entity.Entity;
import net.minecraft.util.RandomSource;
import net.minecraft.util.Mth;
import net.minecraft.server.level.ServerLevel;
import net.minecraft.core.particles.ParticleTypes;

import java.util.ArrayList;

public class JalsonChairOnEntityTickUpdateProcedure {
	public static void execute(LevelAccessor world, double x, double y, double z, Entity entity) {
		if (entity == null)
			return;
		if (entity.isVehicle()) {
			if (world instanceof ServerLevel _level)
				_level.sendParticles(ParticleTypes.CAMPFIRE_SIGNAL_SMOKE, x, y, z, 50, 3, 3, 3, 1);
			if (Mth.nextInt(RandomSource.create(), 1, 100) > 99) {
				for (Entity entityiterator : new ArrayList<>(entity.getPassengers())) {
					entityiterator.stopRiding();
					entityiterator.setDeltaMovement(new Vec3(0, 100, 0));
				}
			}
		}
	}
}
