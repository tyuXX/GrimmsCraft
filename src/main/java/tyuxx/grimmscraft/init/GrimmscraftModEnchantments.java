
/*
 *	MCreator note: This file will be REGENERATED on each build.
 */
package tyuxx.grimmscraft.init;

import tyuxx.grimmscraft.enchantment.MoreXpT3Enchantment;
import tyuxx.grimmscraft.enchantment.MoreXpT2Enchantment;
import tyuxx.grimmscraft.enchantment.MoreXpT1Enchantment;
import tyuxx.grimmscraft.GrimmscraftMod;

import net.minecraftforge.registries.RegistryObject;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.DeferredRegister;

import net.minecraft.world.item.enchantment.Enchantment;

public class GrimmscraftModEnchantments {
	public static final DeferredRegister<Enchantment> REGISTRY = DeferredRegister.create(ForgeRegistries.ENCHANTMENTS, GrimmscraftMod.MODID);
	public static final RegistryObject<Enchantment> MORE_XP_T_1 = REGISTRY.register("more_xp_t_1", () -> new MoreXpT1Enchantment());
	public static final RegistryObject<Enchantment> MORE_XP_T_2 = REGISTRY.register("more_xp_t_2", () -> new MoreXpT2Enchantment());
	public static final RegistryObject<Enchantment> MORE_XP_T_3 = REGISTRY.register("more_xp_t_3", () -> new MoreXpT3Enchantment());
}
