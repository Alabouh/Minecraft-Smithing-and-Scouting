
/*
 *	MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.makingthismod.init;

import net.minecraftforge.registries.RegistryObject;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.common.extensions.IForgeMenuType;

import net.minecraft.world.inventory.MenuType;

import net.mcreator.makingthismod.world.inventory.CrusherGuiMenu;
import net.mcreator.makingthismod.MakingThisModMod;

public class MakingThisModModMenus {
	public static final DeferredRegister<MenuType<?>> REGISTRY = DeferredRegister.create(ForgeRegistries.MENU_TYPES, MakingThisModMod.MODID);
	public static final RegistryObject<MenuType<CrusherGuiMenu>> CRUSHER_GUI = REGISTRY.register("crusher_gui", () -> IForgeMenuType.create(CrusherGuiMenu::new));
}
