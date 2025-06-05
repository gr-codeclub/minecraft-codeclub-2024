package net.mcreator.erikmod.procedures;

import net.minecraft.world.entity.Entity;

public class ErikblueRightClickedOnEntityProcedure {
	public static void execute(Entity entity) {
		if (entity == null)
			return;
		entity.setInvisible(true);
		entity.igniteForSeconds(1900000000);
		entity.startRiding(entity);
	}
}
