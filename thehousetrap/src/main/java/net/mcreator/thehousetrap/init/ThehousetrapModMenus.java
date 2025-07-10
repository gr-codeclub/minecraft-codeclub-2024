
/*
 *	MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.thehousetrap.init;

import net.neoforged.neoforge.registries.DeferredRegister;
import net.neoforged.neoforge.registries.DeferredHolder;
import net.neoforged.neoforge.common.extensions.IMenuTypeExtension;

import net.minecraft.world.inventory.MenuType;
import net.minecraft.core.registries.Registries;

import net.mcreator.thehousetrap.ThehousetrapMod;

public class ThehousetrapModMenus {
	public static final DeferredRegister<MenuType<?>> REGISTRY = DeferredRegister.create(Registries.MENU, ThehousetrapMod.MODID);
	public static final DeferredHolder<MenuType<?>, MenuType<CIREISSOSIGMAMenu>> CIREISSOSIGMA = REGISTRY.register("cireissosigma", () -> IMenuTypeExtension.create(CIREISSOSIGMAMenu::new));
}
