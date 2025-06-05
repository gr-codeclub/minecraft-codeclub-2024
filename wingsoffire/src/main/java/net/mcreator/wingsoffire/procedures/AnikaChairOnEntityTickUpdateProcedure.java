package net.mcreator.wingsoffire.procedures;

import net.minecraft.world.phys.Vec3;
import net.minecraft.world.level.LevelAccessor;
import net.minecraft.world.entity.MobSpawnType;
import net.minecraft.world.entity.EntityType;
import net.minecraft.world.entity.Entity;
import net.minecraft.util.RandomSource;
import net.minecraft.util.Mth;
import net.minecraft.server.level.ServerLevel;
import net.minecraft.core.particles.ParticleTypes;
import net.minecraft.core.BlockPos;

import java.util.ArrayList;

public class AnikaChairOnEntityTickUpdateProcedure {
	public static void execute(LevelAccessor world, double x, double y, double z, Entity entity) {
		if (entity == null)
			return;
		if (entity.isVehicle()) {
			world.addParticle(ParticleTypes.FIREWORK, x, y, z, 1, 1, 1);
			world.addParticle(ParticleTypes.FIREWORK, x, y, z, (-1), 1, (-1));
			world.addParticle(ParticleTypes.FIREWORK, x, y, z, 0, 1, 0);
			world.addParticle(ParticleTypes.FIREWORK, x, y, z, 0, 1, 0);
			if (Mth.nextInt(RandomSource.create(), 1, 100) > 99) {
				for (Entity entityiterator : new ArrayList<>(entity.getPassengers())) {
					entityiterator.stopRiding();
					entityiterator.setDeltaMovement(new Vec3(0, 10, 0));
				}
			}
			if (Mth.nextInt(RandomSource.create(), 1, 100) > 99) {
				if (world instanceof ServerLevel _level) {
					Entity entityToSpawn = EntityType.ALLAY.spawn(_level, BlockPos.containing(x, y, z), MobSpawnType.MOB_SUMMONED);
					if (entityToSpawn != null) {
						entityToSpawn.setDeltaMovement(0, 0, 0);
					}
				}
			}
		}
	}
}
