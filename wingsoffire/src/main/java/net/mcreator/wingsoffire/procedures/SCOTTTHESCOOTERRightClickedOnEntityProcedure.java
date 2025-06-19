package net.mcreator.wingsoffire.procedures;

import net.minecraft.world.item.ItemStack;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.entity.Entity;

import net.mcreator.wingsoffire.init.WingsoffireModBlocks;

public class SCOTTTHESCOOTERRightClickedOnEntityProcedure {
	public static void execute(Entity entity, Entity sourceentity) {
		if (entity == null || sourceentity == null)
			return;
		double mood = 0;
		if ((sourceentity instanceof LivingEntity _livEnt ? _livEnt.getMainHandItem() : ItemStack.EMPTY).getItem() == WingsoffireModBlocks.ANIKA.get().asItem()) {
			if (entity instanceof Player _player) {
				ItemStack _stktoremove = new ItemStack(WingsoffireModBlocks.ANIKA.get());
				_player.getInventory().clearOrCountMatchingItems(p -> _stktoremove.getItem() == p.getItem(), 1, _player.inventoryMenu.getCraftSlots());
			}
		}
	}
}
