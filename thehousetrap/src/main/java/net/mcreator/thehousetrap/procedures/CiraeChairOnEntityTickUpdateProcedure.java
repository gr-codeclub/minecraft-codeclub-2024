package net.mcreator.thehousetrap.procedures;

import net.minecraft.world.phys.Vec3;
import net.minecraft.world.level.LevelAccessor;
import net.minecraft.world.entity.Entity;
import net.minecraft.util.RandomSource;
import net.minecraft.util.Mth;
import net.minecraft.core.particles.ParticleTypes;

public class CiraeChairOnEntityTickUpdateProcedure {
	public static void execute(LevelAccessor world, double x, double y, double z, Entity entity) {
		if (entity == null)
			return;
		if (entity.isVehicle()) {
			world.addParticle(ParticleTypes.FIREWORK, x, y, z, 1, 1, 1);
			world.addParticle(ParticleTypes.FIREWORK, x, y, z, (-1), 1, (-1));
			world.addParticle(ParticleTypes.FIREWORK, x, y, z, 0, 1, 0);
			world.addParticle(ParticleTypes.FIREWORK, x, y, z, 1, 1, 0);
			if (Mth.nextInt(RandomSource.create(), 1, 100) > 99) {
				for (Entity entityiterator : entity.getIndirectPassengers()) {
					entityiterator.stopRiding();
					entityiterator.setDeltaMovement(new Vec3(0, 10, 0));
				}
			}
		}
	}
}
