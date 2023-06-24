
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package tyuxx.grimmscraft.init;

import tyuxx.grimmscraft.block.entity.SolarPanelT1BlockEntity;
import tyuxx.grimmscraft.block.entity.PrinterBlockEntity;
import tyuxx.grimmscraft.block.entity.ElectricFurnaceT1BlockEntity;
import tyuxx.grimmscraft.GrimmscraftMod;

import net.minecraftforge.registries.RegistryObject;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.DeferredRegister;

import net.minecraft.world.level.block.entity.BlockEntityType;
import net.minecraft.world.level.block.Block;

public class GrimmscraftModBlockEntities {
	public static final DeferredRegister<BlockEntityType<?>> REGISTRY = DeferredRegister.create(ForgeRegistries.BLOCK_ENTITY_TYPES, GrimmscraftMod.MODID);
	public static final RegistryObject<BlockEntityType<?>> PRINTER = register("printer", GrimmscraftModBlocks.PRINTER, PrinterBlockEntity::new);
	public static final RegistryObject<BlockEntityType<?>> SOLAR_PANEL_T_1 = register("solar_panel_t_1", GrimmscraftModBlocks.SOLAR_PANEL_T_1, SolarPanelT1BlockEntity::new);
	public static final RegistryObject<BlockEntityType<?>> ELECTRIC_FURNACE_T_1 = register("electric_furnace_t_1", GrimmscraftModBlocks.ELECTRIC_FURNACE_T_1, ElectricFurnaceT1BlockEntity::new);

	private static RegistryObject<BlockEntityType<?>> register(String registryname, RegistryObject<Block> block, BlockEntityType.BlockEntitySupplier<?> supplier) {
		return REGISTRY.register(registryname, () -> BlockEntityType.Builder.of(supplier, block.get()).build(null));
	}
}
