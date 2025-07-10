package net.mcreator.wingsoffire.procedures;

import net.minecraft.world.item.ItemStack;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.entity.Entity;
import net.minecraft.network.chat.Component;

import net.mcreator.wingsoffire.init.WingsoffireModBlocks;
import net.mcreator.wingsoffire.entity.SCOTTTHESCOOTEREntity;

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
			if (entity instanceof SCOTTTHESCOOTEREntity _datEntSetI)
				_datEntSetI.getEntityData().set(SCOTTTHESCOOTEREntity.DATA_mood, 1);
			if (sourceentity instanceof Player _player && !_player.level().isClientSide())
				_player.displayClientMessage(Component.literal(("pet rock ate the yummy food with a sigma smile on his face" + new ItemStack(WingsoffireModBlocks.ANIKA.get()).getDisplayName().getString())), true);
			if ((entity instanceof SCOTTTHESCOOTEREntity _datEntI ? _datEntI.getEntityData().get(SCOTTTHESCOOTEREntity.DATA_moodVal) : 0) + 30 <= 100) {
				if (entity instanceof SCOTTTHESCOOTEREntity _datEntSetI)
					_datEntSetI.getEntityData().set(SCOTTTHESCOOTEREntity.DATA_moodVal, (int) ((entity instanceof SCOTTTHESCOOTEREntity _datEntI ? _datEntI.getEntityData().get(SCOTTTHESCOOTEREntity.DATA_moodVal) : 0) + 30));
			} else {
				if (entity instanceof SCOTTTHESCOOTEREntity _datEntSetI)
					_datEntSetI.getEntityData().set(SCOTTTHESCOOTEREntity.DATA_moodVal, 100);
			}
		}
	}
}
