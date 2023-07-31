
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.makingthismod.init;

import net.minecraftforge.registries.RegistryObject;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.DeferredRegister;

import net.minecraft.world.item.Item;

import net.mcreator.makingthismod.item.WoodenhiltItem;
import net.mcreator.makingthismod.item.WoodenbladeItem;
import net.mcreator.makingthismod.item.StonehiltItem;
import net.mcreator.makingthismod.item.StonebladeItem;
import net.mcreator.makingthismod.item.SculkhiltItem;
import net.mcreator.makingthismod.item.SculkbladeItem;
import net.mcreator.makingthismod.item.NetheritehiltItem;
import net.mcreator.makingthismod.item.NetheritebladeItem;
import net.mcreator.makingthismod.item.IronhiltItem;
import net.mcreator.makingthismod.item.IronbladeItem;
import net.mcreator.makingthismod.item.GoldenhiltItem;
import net.mcreator.makingthismod.item.GoldenbladeItem;
import net.mcreator.makingthismod.item.DiamondhiltItem;
import net.mcreator.makingthismod.item.DiamondbladeItem;
import net.mcreator.makingthismod.item.CopperswordItem;
import net.mcreator.makingthismod.item.CopperbladeItem;
import net.mcreator.makingthismod.item.CoppenhiltItem;
import net.mcreator.makingthismod.MakingThisModMod;

public class MakingThisModModItems {
	public static final DeferredRegister<Item> REGISTRY = DeferredRegister.create(ForgeRegistries.ITEMS, MakingThisModMod.MODID);
	public static final RegistryObject<Item> WOODENBLADE = REGISTRY.register("woodenblade", () -> new WoodenbladeItem());
	public static final RegistryObject<Item> WOODENHILT = REGISTRY.register("woodenhilt", () -> new WoodenhiltItem());
	public static final RegistryObject<Item> STONEHILT = REGISTRY.register("stonehilt", () -> new StonehiltItem());
	public static final RegistryObject<Item> STONEBLADE = REGISTRY.register("stoneblade", () -> new StonebladeItem());
	public static final RegistryObject<Item> IRONHILT = REGISTRY.register("ironhilt", () -> new IronhiltItem());
	public static final RegistryObject<Item> IRONBLADE = REGISTRY.register("ironblade", () -> new IronbladeItem());
	public static final RegistryObject<Item> COPPENHILT = REGISTRY.register("coppenhilt", () -> new CoppenhiltItem());
	public static final RegistryObject<Item> COPPERBLADE = REGISTRY.register("copperblade", () -> new CopperbladeItem());
	public static final RegistryObject<Item> COPPERSWORD = REGISTRY.register("coppersword", () -> new CopperswordItem());
	public static final RegistryObject<Item> GOLDENHILT = REGISTRY.register("goldenhilt", () -> new GoldenhiltItem());
	public static final RegistryObject<Item> GOLDENBLADE = REGISTRY.register("goldenblade", () -> new GoldenbladeItem());
	public static final RegistryObject<Item> DIAMONDHILT = REGISTRY.register("diamondhilt", () -> new DiamondhiltItem());
	public static final RegistryObject<Item> DIAMONDBLADE = REGISTRY.register("diamondblade", () -> new DiamondbladeItem());
	public static final RegistryObject<Item> NETHERITEHILT = REGISTRY.register("netheritehilt", () -> new NetheritehiltItem());
	public static final RegistryObject<Item> NETHERITEBLADE = REGISTRY.register("netheriteblade", () -> new NetheritebladeItem());
	public static final RegistryObject<Item> SCULKHILT = REGISTRY.register("sculkhilt", () -> new SculkhiltItem());
	public static final RegistryObject<Item> SCULKBLADE = REGISTRY.register("sculkblade", () -> new SculkbladeItem());
}
