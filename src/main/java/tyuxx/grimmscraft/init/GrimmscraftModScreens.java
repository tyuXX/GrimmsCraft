
/*
 *	MCreator note: This file will be REGENERATED on each build.
 */
package tyuxx.grimmscraft.init;

import tyuxx.grimmscraft.client.gui.StatsToggleGuiScreen;
import tyuxx.grimmscraft.client.gui.StatsGuiScreen;
import tyuxx.grimmscraft.client.gui.PrinterGuiScreen;
import tyuxx.grimmscraft.client.gui.PakagerGUIScreen;
import tyuxx.grimmscraft.client.gui.LBagGuiScreen;
import tyuxx.grimmscraft.client.gui.EFurnaceT1GuiScreen;

import net.minecraftforge.fml.event.lifecycle.FMLClientSetupEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.api.distmarker.Dist;

import net.minecraft.client.gui.screens.MenuScreens;

@Mod.EventBusSubscriber(bus = Mod.EventBusSubscriber.Bus.MOD, value = Dist.CLIENT)
public class GrimmscraftModScreens {
	@SubscribeEvent
	public static void clientLoad(FMLClientSetupEvent event) {
		event.enqueueWork(() -> {
			MenuScreens.register(GrimmscraftModMenus.PRINTER_GUI.get(), PrinterGuiScreen::new);
			MenuScreens.register(GrimmscraftModMenus.L_BAG_GUI.get(), LBagGuiScreen::new);
			MenuScreens.register(GrimmscraftModMenus.E_FURNACE_T_1_GUI.get(), EFurnaceT1GuiScreen::new);
			MenuScreens.register(GrimmscraftModMenus.STATS_GUI.get(), StatsGuiScreen::new);
			MenuScreens.register(GrimmscraftModMenus.STATS_TOGGLE_GUI.get(), StatsToggleGuiScreen::new);
			MenuScreens.register(GrimmscraftModMenus.PAKAGER_GUI.get(), PakagerGUIScreen::new);
		});
	}
}
