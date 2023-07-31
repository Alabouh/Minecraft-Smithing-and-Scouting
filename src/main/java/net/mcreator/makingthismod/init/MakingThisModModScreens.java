
/*
 *	MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.makingthismod.init;

import net.minecraftforge.fml.event.lifecycle.FMLClientSetupEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.api.distmarker.Dist;

import net.minecraft.client.gui.screens.MenuScreens;

import net.mcreator.makingthismod.client.gui.CrusherGuiScreen;
import net.mcreator.makingthismod.client.gui.CasterGuiScreen;

@Mod.EventBusSubscriber(bus = Mod.EventBusSubscriber.Bus.MOD, value = Dist.CLIENT)
public class MakingThisModModScreens {
	@SubscribeEvent
	public static void clientLoad(FMLClientSetupEvent event) {
		event.enqueueWork(() -> {
			MenuScreens.register(MakingThisModModMenus.CRUSHER_GUI.get(), CrusherGuiScreen::new);
			MenuScreens.register(MakingThisModModMenus.CASTER_GUI.get(), CasterGuiScreen::new);
		});
	}
}
