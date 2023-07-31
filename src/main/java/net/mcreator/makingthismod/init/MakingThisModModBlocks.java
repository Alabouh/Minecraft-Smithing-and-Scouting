
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.makingthismod.init;

import net.minecraftforge.registries.RegistryObject;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.DeferredRegister;

import net.minecraft.world.level.block.Block;

import net.mcreator.makingthismod.block.CrusherBlock;
import net.mcreator.makingthismod.MakingThisModMod;

public class MakingThisModModBlocks {
	public static final DeferredRegister<Block> REGISTRY = DeferredRegister.create(ForgeRegistries.BLOCKS, MakingThisModMod.MODID);
	public static final RegistryObject<Block> CRUSHER = REGISTRY.register("crusher", () -> new CrusherBlock());
}
