
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package tyuxx.grimmscraft.init;

import tyuxx.grimmscraft.world.features.ores.UraniumOreFeature;
import tyuxx.grimmscraft.world.features.ores.ThoriumOreFeature;
import tyuxx.grimmscraft.world.features.ores.TatatatataniumOreFeature;
import tyuxx.grimmscraft.world.features.ores.TatatataniumOreFeature;
import tyuxx.grimmscraft.world.features.ores.TatataniumOreFeature;
import tyuxx.grimmscraft.world.features.ores.TataniumOreFeature;
import tyuxx.grimmscraft.world.features.ores.TaniumOreFeature;
import tyuxx.grimmscraft.GrimmscraftMod;

import net.minecraftforge.registries.RegistryObject;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.fml.common.Mod;

import net.minecraft.world.level.levelgen.feature.Feature;

@Mod.EventBusSubscriber
public class GrimmscraftModFeatures {
	public static final DeferredRegister<Feature<?>> REGISTRY = DeferredRegister.create(ForgeRegistries.FEATURES, GrimmscraftMod.MODID);
	public static final RegistryObject<Feature<?>> TANIUM_ORE = REGISTRY.register("tanium_ore", TaniumOreFeature::new);
	public static final RegistryObject<Feature<?>> TATANIUM_ORE = REGISTRY.register("tatanium_ore", TataniumOreFeature::new);
	public static final RegistryObject<Feature<?>> TATATANIUM_ORE = REGISTRY.register("tatatanium_ore", TatataniumOreFeature::new);
	public static final RegistryObject<Feature<?>> TATATATANIUM_ORE = REGISTRY.register("tatatatanium_ore", TatatataniumOreFeature::new);
	public static final RegistryObject<Feature<?>> TATATATATANIUM_ORE = REGISTRY.register("tatatatatanium_ore", TatatatataniumOreFeature::new);
	public static final RegistryObject<Feature<?>> URANIUM_ORE = REGISTRY.register("uranium_ore", UraniumOreFeature::new);
	public static final RegistryObject<Feature<?>> THORIUM_ORE = REGISTRY.register("thorium_ore", ThoriumOreFeature::new);
}
