
package net.mcreator.cavarli.item;

import net.minecraft.world.level.Level;
import net.minecraft.world.item.Rarity;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.Item;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.InteractionResultHolder;
import net.minecraft.world.InteractionHand;

import net.mcreator.cavarli.procedures.Amungus1Procedure;

public class CAVARLInoob1234567890Item extends Item {
	public CAVARLInoob1234567890Item() {
		super(new Item.Properties().stacksTo(64).rarity(Rarity.COMMON));
	}

	@Override
	public InteractionResultHolder<ItemStack> use(Level world, Player entity, InteractionHand hand) {
		InteractionResultHolder<ItemStack> ar = super.use(world, entity, hand);
		Amungus1Procedure.execute(world, entity.getX(), entity.getY(), entity.getZ());
		return ar;
	}
}
