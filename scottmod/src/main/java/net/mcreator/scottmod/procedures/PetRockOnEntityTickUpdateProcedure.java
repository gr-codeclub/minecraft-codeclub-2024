package net.mcreator.scottmod.procedures;

import net.minecraft.world.level.LevelAccessor;
import net.minecraft.world.entity.Entity;
import net.minecraft.world.InteractionResult;
import net.minecraft.server.level.ServerLevel;
import net.minecraft.core.particles.ParticleTypes;

import net.mcreator.scottmod.entity.PetRockEntity;

public class PetRockOnEntityTickUpdateProcedure {
	public static InteractionResult execute(LevelAccessor world, double x, double y, double z, Entity entity) {
		if (entity == null)
			return InteractionResult.PASS;
		double tickTimerLocal = 0;
		double moodValLocal = 0;
		tickTimerLocal = entity instanceof PetRockEntity _datEntI ? _datEntI.getEntityData().get(PetRockEntity.DATA_tickTimer) : 0;
		if (tickTimerLocal > 0) {
			if (entity instanceof PetRockEntity _datEntSetI)
				_datEntSetI.getEntityData().set(PetRockEntity.DATA_tickTimer, (int) (tickTimerLocal - 1));
			return InteractionResult.SUCCESS;
		}
		moodValLocal = entity instanceof PetRockEntity _datEntI ? _datEntI.getEntityData().get(PetRockEntity.DATA_moodVal) : 0;
		if (moodValLocal > 0) {
			moodValLocal = moodValLocal - 1;
			if (entity instanceof PetRockEntity _datEntSetI)
				_datEntSetI.getEntityData().set(PetRockEntity.DATA_moodVal, (int) moodValLocal);
		}
		if (moodValLocal < 20) {
			if (entity instanceof PetRockEntity _datEntSetI)
				_datEntSetI.getEntityData().set(PetRockEntity.DATA_mood, 2);
		}
		if ((entity instanceof PetRockEntity _datEntI ? _datEntI.getEntityData().get(PetRockEntity.DATA_mood) : 0) == 1) {
			if (world instanceof ServerLevel _level)
				_level.sendParticles(ParticleTypes.HEART, x, y, z, 5, 1, 1, 1, 1);
		}
		if ((entity instanceof PetRockEntity _datEntI ? _datEntI.getEntityData().get(PetRockEntity.DATA_mood) : 0) == 2) {
			if (world instanceof ServerLevel _level)
				_level.sendParticles(ParticleTypes.CLOUD, x, y, z, 5, 1, 1, 1, 1);
		}
		if (entity instanceof PetRockEntity _datEntSetI)
			_datEntSetI.getEntityData().set(PetRockEntity.DATA_tickTimer, 200);
		return InteractionResult.SUCCESS;
	}
}
