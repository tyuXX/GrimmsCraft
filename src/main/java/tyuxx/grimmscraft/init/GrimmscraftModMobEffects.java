
/*
 *	MCreator note: This file will be REGENERATED on each build.
 */
package tyuxx.grimmscraft.init;

import tyuxx.grimmscraft.potion.SleepingMobEffect;
import tyuxx.grimmscraft.potion.InvulnerableMobEffect;
import tyuxx.grimmscraft.GrimmscraftMod;

import net.minecraftforge.registries.RegistryObject;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.DeferredRegister;

import net.minecraft.world.effect.MobEffect;

public class GrimmscraftModMobEffects {
	public static final DeferredRegister<MobEffect> REGISTRY = DeferredRegister.create(ForgeRegistries.MOB_EFFECTS, GrimmscraftMod.MODID);
	public static final RegistryObject<MobEffect> INVULNERABLE = REGISTRY.register("invulnerable", () -> new InvulnerableMobEffect());
	public static final RegistryObject<MobEffect> SLEEPING = REGISTRY.register("sleeping", () -> new SleepingMobEffect());
}
