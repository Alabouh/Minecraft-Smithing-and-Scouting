
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.makingthismod.init;

import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.event.CreativeModeTabEvent;

import net.minecraft.world.item.CreativeModeTabs;

@Mod.EventBusSubscriber(bus = Mod.EventBusSubscriber.Bus.MOD)
public class MakingThisModModTabs {
	@SubscribeEvent
	public static void buildTabContentsVanilla(CreativeModeTabEvent.BuildContents tabData) {

		if (tabData.getTab() == CreativeModeTabs.FUNCTIONAL_BLOCKS) {
			tabData.accept(MakingThisModModBlocks.CRUSHER.get().asItem());
			tabData.accept(MakingThisModModBlocks.CASTER.get().asItem());
		}

		if (tabData.getTab() == CreativeModeTabs.COMBAT) {
			tabData.accept(MakingThisModModItems.WOODENBLADE.get());
			tabData.accept(MakingThisModModItems.WOODENHILT.get());
			tabData.accept(MakingThisModModItems.STONEHILT.get());
			tabData.accept(MakingThisModModItems.STONEBLADE.get());
			tabData.accept(MakingThisModModItems.IRONHILT.get());
			tabData.accept(MakingThisModModItems.IRONBLADE.get());
			tabData.accept(MakingThisModModItems.COPPENHILT.get());
			tabData.accept(MakingThisModModItems.COPPERBLADE.get());
			tabData.accept(MakingThisModModItems.COPPERSWORD.get());
			tabData.accept(MakingThisModModItems.GOLDENHILT.get());
			tabData.accept(MakingThisModModItems.GOLDENBLADE.get());
			tabData.accept(MakingThisModModItems.DIAMONDHILT.get());
			tabData.accept(MakingThisModModItems.DIAMONDBLADE.get());
			tabData.accept(MakingThisModModItems.NETHERITEHILT.get());
			tabData.accept(MakingThisModModItems.NETHERITEBLADE.get());
			tabData.accept(MakingThisModModItems.SCULKHILT.get());
			tabData.accept(MakingThisModModItems.SCULKBLADE.get());
		}

		if (tabData.getTab() == CreativeModeTabs.INGREDIENTS) {
			tabData.accept(MakingThisModModItems.DIAMONDSHARD.get());
			tabData.accept(MakingThisModModItems.MOLTEN_METAL_INGOT.get());
		}
	}
}
