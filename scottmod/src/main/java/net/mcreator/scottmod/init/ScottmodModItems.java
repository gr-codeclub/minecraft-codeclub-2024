
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.scottmod.init;

import net.neoforged.neoforge.registries.DeferredRegister;
import net.neoforged.neoforge.registries.DeferredItem;
import net.neoforged.neoforge.common.DeferredSpawnEggItem;

import net.minecraft.world.item.Item;

import net.mcreator.scottmod.ScottmodMod;

public class ScottmodModItems {
	public static final DeferredRegister.Items REGISTRY = DeferredRegister.createItems(ScottmodMod.MODID);
	public static final DeferredItem<Item> PET_ROCK_SPAWN_EGG = REGISTRY.register("pet_rock_spawn_egg", () -> new DeferredSpawnEggItem(ScottmodModEntities.PET_ROCK, -1, -1, new Item.Properties()));
	// Start of user code block custom items
	// End of user code block custom items
}
