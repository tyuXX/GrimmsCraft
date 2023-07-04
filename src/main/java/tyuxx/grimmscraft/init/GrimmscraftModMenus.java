
/*
 *	MCreator note: This file will be REGENERATED on each build.
 */
package tyuxx.grimmscraft.init;

import tyuxx.grimmscraft.world.inventory.StatsToggleGuiMenu;
import tyuxx.grimmscraft.world.inventory.StatsGuiMenu;
import tyuxx.grimmscraft.world.inventory.SettingsGUIMenu;
import tyuxx.grimmscraft.world.inventory.PrinterGuiMenu;
import tyuxx.grimmscraft.world.inventory.PakagerGUIMenu;
import tyuxx.grimmscraft.world.inventory.LBagGuiMenu;
import tyuxx.grimmscraft.world.inventory.EFurnaceT1GuiMenu;
import tyuxx.grimmscraft.GrimmscraftMod;

import net.minecraftforge.registries.RegistryObject;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.common.extensions.IForgeMenuType;

import net.minecraft.world.inventory.MenuType;

public class GrimmscraftModMenus {
	public static final DeferredRegister<MenuType<?>> REGISTRY = DeferredRegister.create(ForgeRegistries.MENU_TYPES, GrimmscraftMod.MODID);
	public static final RegistryObject<MenuType<PrinterGuiMenu>> PRINTER_GUI = REGISTRY.register("printer_gui", () -> IForgeMenuType.create(PrinterGuiMenu::new));
	public static final RegistryObject<MenuType<LBagGuiMenu>> L_BAG_GUI = REGISTRY.register("l_bag_gui", () -> IForgeMenuType.create(LBagGuiMenu::new));
	public static final RegistryObject<MenuType<EFurnaceT1GuiMenu>> E_FURNACE_T_1_GUI = REGISTRY.register("e_furnace_t_1_gui", () -> IForgeMenuType.create(EFurnaceT1GuiMenu::new));
	public static final RegistryObject<MenuType<StatsGuiMenu>> STATS_GUI = REGISTRY.register("stats_gui", () -> IForgeMenuType.create(StatsGuiMenu::new));
	public static final RegistryObject<MenuType<StatsToggleGuiMenu>> STATS_TOGGLE_GUI = REGISTRY.register("stats_toggle_gui", () -> IForgeMenuType.create(StatsToggleGuiMenu::new));
	public static final RegistryObject<MenuType<PakagerGUIMenu>> PAKAGER_GUI = REGISTRY.register("pakager_gui", () -> IForgeMenuType.create(PakagerGUIMenu::new));
	public static final RegistryObject<MenuType<SettingsGUIMenu>> SETTINGS_GUI = REGISTRY.register("settings_gui", () -> IForgeMenuType.create(SettingsGUIMenu::new));
}
