
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.oogaboogablockgen.init;

import net.neoforged.neoforge.registries.DeferredRegister;
import net.neoforged.neoforge.registries.DeferredHolder;

import net.minecraft.sounds.SoundEvent;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.core.registries.Registries;

import net.mcreator.oogaboogablockgen.OogaboogablockgenMod;

public class OogaboogablockgenModSounds {
	public static final DeferredRegister<SoundEvent> REGISTRY = DeferredRegister.create(Registries.SOUND_EVENT, OogaboogablockgenMod.MODID);
	public static final DeferredHolder<SoundEvent, SoundEvent> WINNINGGRENADE = REGISTRY.register("winninggrenade", () -> SoundEvent.createVariableRangeEvent(ResourceLocation.fromNamespaceAndPath("oogaboogablockgen", "winninggrenade")));
}
