
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.makingthismod.init;

import net.minecraftforge.registries.RegistryObject;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.DeferredRegister;

import net.minecraft.world.level.block.Block;

import net.mcreator.makingthismod.block.SnowyPackedIceBlock;
import net.mcreator.makingthismod.block.IceSpikesBlock;
import net.mcreator.makingthismod.block.CrusherBlock;
import net.mcreator.makingthismod.block.CasterBlock;
import net.mcreator.makingthismod.MakingThisModMod;

public class MakingThisModModBlocks {
	public static final DeferredRegister<Block> REGISTRY = DeferredRegister.create(ForgeRegistries.BLOCKS, MakingThisModMod.MODID);
	public static final RegistryObject<Block> CRUSHER = REGISTRY.register("crusher", () -> new CrusherBlock());
	public static final RegistryObject<Block> CASTER = REGISTRY.register("caster", () -> new CasterBlock());
	public static final RegistryObject<Block> SNOWY_PACKED_ICE = REGISTRY.register("snowy_packed_ice", () -> new SnowyPackedIceBlock());
	public static final RegistryObject<Block> ICE_SPIKES = REGISTRY.register("ice_spikes", () -> new IceSpikesBlock());
}
