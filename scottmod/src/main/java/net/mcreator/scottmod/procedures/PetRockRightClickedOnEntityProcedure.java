package net.mcreator.scottmod.procedures;

import net.minecraft.world.level.block.Blocks;
import net.minecraft.world.level.LevelAccessor;
import net.minecraft.world.level.Level;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.entity.Entity;
import net.minecraft.world.InteractionResult;
import net.minecraft.sounds.SoundSource;
import net.minecraft.server.level.ServerLevel;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.network.chat.Component;
import net.minecraft.core.registries.BuiltInRegistries;
import net.minecraft.core.particles.ParticleTypes;
import net.minecraft.core.BlockPos;

import net.mcreator.scottmod.entity.PetRockEntity;
import net.mcreator.scottmod.ScottmodMod;

public class PetRockRightClickedOnEntityProcedure {
	public static InteractionResult execute(LevelAccessor world, double x, double y, double z, Entity entity, Entity sourceentity) {
		if (entity == null || sourceentity == null)
			return InteractionResult.PASS;
		String moodStr = "";
		double mood = 0;
		if ((sourceentity instanceof LivingEntity _livEnt ? _livEnt.getMainHandItem() : ItemStack.EMPTY).getItem() == Blocks.COBBLESTONE.asItem()) {
			if (sourceentity instanceof Player _player) {
				ItemStack _stktoremove = new ItemStack(Blocks.COBBLESTONE);
				_player.getInventory().clearOrCountMatchingItems(p -> _stktoremove.getItem() == p.getItem(), 1, _player.inventoryMenu.getCraftSlots());
			}
			if (entity instanceof PetRockEntity _datEntSetI)
				_datEntSetI.getEntityData().set(PetRockEntity.DATA_mood, 1);
			if (sourceentity instanceof Player _player && !_player.level().isClientSide())
				_player.displayClientMessage(Component.literal(("Pet Rock happily ate the " + new ItemStack(Blocks.COBBLESTONE).getDisplayName().getString())), true);
			if ((entity instanceof PetRockEntity _datEntI ? _datEntI.getEntityData().get(PetRockEntity.DATA_moodVal) : 0) + 30 <= 100) {
				if (entity instanceof PetRockEntity _datEntSetI)
					_datEntSetI.getEntityData().set(PetRockEntity.DATA_moodVal, (int) ((entity instanceof PetRockEntity _datEntI ? _datEntI.getEntityData().get(PetRockEntity.DATA_moodVal) : 0) + 30));
			} else {
				if (entity instanceof PetRockEntity _datEntSetI)
					_datEntSetI.getEntityData().set(PetRockEntity.DATA_moodVal, 100);
			}
			return InteractionResult.CONSUME;
		}
		if ((sourceentity instanceof LivingEntity _livEnt ? _livEnt.getMainHandItem() : ItemStack.EMPTY).getItem() == Blocks.REDSTONE_BLOCK.asItem()) {
			if (sourceentity instanceof Player _player) {
				ItemStack _stktoremove = new ItemStack(Blocks.REDSTONE_BLOCK);
				_player.getInventory().clearOrCountMatchingItems(p -> _stktoremove.getItem() == p.getItem(), 1, _player.inventoryMenu.getCraftSlots());
			}
			if (sourceentity instanceof Player _player && !_player.level().isClientSide())
				_player.displayClientMessage(Component.literal("Oh no..."), true);
			if (world instanceof Level _level) {
				if (!_level.isClientSide()) {
					_level.playSound(null, BlockPos.containing(x, y, z), BuiltInRegistries.SOUND_EVENT.get(ResourceLocation.parse("entity.creeper.primed")), SoundSource.NEUTRAL, 1, 1);
				} else {
					_level.playLocalSound(x, y, z, BuiltInRegistries.SOUND_EVENT.get(ResourceLocation.parse("entity.creeper.primed")), SoundSource.NEUTRAL, 1, 1, false);
				}
			}
			if (world instanceof ServerLevel _level)
				_level.sendParticles(ParticleTypes.LARGE_SMOKE, x, y, z, 10, 1, 1, 1, 1);
			ScottmodMod.queueServerWork(20, () -> {
				if (world instanceof ServerLevel _level)
					_level.sendParticles(ParticleTypes.LARGE_SMOKE, x, y, z, 10, 1, 1, 1, 1);
				ScottmodMod.queueServerWork(20, () -> {
					if (world instanceof ServerLevel _level)
						_level.sendParticles(ParticleTypes.LARGE_SMOKE, x, y, z, 10, 1, 1, 1, 1);
					if (world instanceof Level _level && !_level.isClientSide())
						_level.explode(null, x, y, z, 10, Level.ExplosionInteraction.MOB);
					if (sourceentity instanceof Player _player && !_player.level().isClientSide())
						_player.displayClientMessage(Component.literal("Pet Rock sneezed"), true);
				});
			});
			return InteractionResult.CONSUME;
		}
		if ((sourceentity instanceof LivingEntity _livEnt ? _livEnt.getMainHandItem() : ItemStack.EMPTY).getItem() == Blocks.AIR.asItem()) {
			mood = entity instanceof PetRockEntity _datEntI ? _datEntI.getEntityData().get(PetRockEntity.DATA_mood) : 0;
			if (mood == 0) {
				moodStr = "neutral";
			}
			if (mood == 1) {
				moodStr = "happy";
			}
			if (mood == 2) {
				moodStr = "sad";
			}
			if (mood == 3) {
				moodStr = "grumpy";
			}
			if (sourceentity instanceof Player _player && !_player.level().isClientSide())
				_player.displayClientMessage(Component.literal(("Pet Rock is feeling " + moodStr)), true);
			return InteractionResult.SUCCESS;
		} else {
			if (sourceentity instanceof Player _player && !_player.level().isClientSide())
				_player.displayClientMessage(Component.literal(("Pet Rock seems uninterested in the " + ((sourceentity instanceof LivingEntity _livEnt ? _livEnt.getMainHandItem() : ItemStack.EMPTY).getDisplayName().getString()))), true);
		}
		return InteractionResult.PASS;
	}
}
