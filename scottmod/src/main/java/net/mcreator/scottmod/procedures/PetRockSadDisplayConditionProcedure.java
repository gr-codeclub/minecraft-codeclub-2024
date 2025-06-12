package net.mcreator.scottmod.procedures;

import net.minecraft.world.entity.Entity;

import net.mcreator.scottmod.entity.PetRockEntity;

public class PetRockSadDisplayConditionProcedure {
	public static boolean execute(Entity entity) {
		if (entity == null)
			return false;
		if ((entity instanceof PetRockEntity _datEntI ? _datEntI.getEntityData().get(PetRockEntity.DATA_mood) : 0) == 2) {
			return true;
		}
		return false;
	}
}
