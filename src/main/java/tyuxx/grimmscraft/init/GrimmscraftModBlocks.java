
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package tyuxx.grimmscraft.init;

import tyuxx.grimmscraft.block.WhiteWoodBlock;
import tyuxx.grimmscraft.block.WhiteStairsBlock;
import tyuxx.grimmscraft.block.WhiteSlabBlock;
import tyuxx.grimmscraft.block.WhitePressurePlateBlock;
import tyuxx.grimmscraft.block.WhitePlanksBlock;
import tyuxx.grimmscraft.block.WhiteLogBlock;
import tyuxx.grimmscraft.block.WhiteLeavesBlock;
import tyuxx.grimmscraft.block.WhiteGlichBlockBlock;
import tyuxx.grimmscraft.block.WhiteFenceGateBlock;
import tyuxx.grimmscraft.block.WhiteFenceBlock;
import tyuxx.grimmscraft.block.WhiteButtonBlock;
import tyuxx.grimmscraft.block.UraniumOreBlock;
import tyuxx.grimmscraft.block.UraniumBlockBlock;
import tyuxx.grimmscraft.block.ThoriumOreBlock;
import tyuxx.grimmscraft.block.ThoriumBlockBlock;
import tyuxx.grimmscraft.block.TatatatataniumOreBlock;
import tyuxx.grimmscraft.block.TatatatataniumBlockBlock;
import tyuxx.grimmscraft.block.TatatataniumOreBlock;
import tyuxx.grimmscraft.block.TatatataniumBlockBlock;
import tyuxx.grimmscraft.block.TatataniumOreBlock;
import tyuxx.grimmscraft.block.TatataniumBlockBlock;
import tyuxx.grimmscraft.block.TataniumOreBlock;
import tyuxx.grimmscraft.block.TataniumBlockBlock;
import tyuxx.grimmscraft.block.TaniumOreBlock;
import tyuxx.grimmscraft.block.TaniumBlockBlock;
import tyuxx.grimmscraft.block.SolarPanelT1Block;
import tyuxx.grimmscraft.block.PrinterBlock;
import tyuxx.grimmscraft.block.ElectricFurnaceT1Block;
import tyuxx.grimmscraft.block.DiamondTreeWoodBlock;
import tyuxx.grimmscraft.block.DiamondTreeStairsBlock;
import tyuxx.grimmscraft.block.DiamondTreeSlabBlock;
import tyuxx.grimmscraft.block.DiamondTreePressurePlateBlock;
import tyuxx.grimmscraft.block.DiamondTreePlanksBlock;
import tyuxx.grimmscraft.block.DiamondTreeLogBlock;
import tyuxx.grimmscraft.block.DiamondTreeLeavesBlock;
import tyuxx.grimmscraft.block.DiamondTreeFenceGateBlock;
import tyuxx.grimmscraft.block.DiamondTreeFenceBlock;
import tyuxx.grimmscraft.block.DiamondTreeButtonBlock;
import tyuxx.grimmscraft.block.BlackWoodBlock;
import tyuxx.grimmscraft.block.BlackStairsBlock;
import tyuxx.grimmscraft.block.BlackSlabBlock;
import tyuxx.grimmscraft.block.BlackPressurePlateBlock;
import tyuxx.grimmscraft.block.BlackPlanksBlock;
import tyuxx.grimmscraft.block.BlackLogBlock;
import tyuxx.grimmscraft.block.BlackLeavesBlock;
import tyuxx.grimmscraft.block.BlackFenceGateBlock;
import tyuxx.grimmscraft.block.BlackFenceBlock;
import tyuxx.grimmscraft.block.BlackButtonBlock;
import tyuxx.grimmscraft.GrimmscraftMod;

import net.minecraftforge.registries.RegistryObject;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.DeferredRegister;

import net.minecraft.world.level.block.Block;

public class GrimmscraftModBlocks {
	public static final DeferredRegister<Block> REGISTRY = DeferredRegister.create(ForgeRegistries.BLOCKS, GrimmscraftMod.MODID);
	public static final RegistryObject<Block> WHITE_WOOD = REGISTRY.register("white_wood", () -> new WhiteWoodBlock());
	public static final RegistryObject<Block> WHITE_LOG = REGISTRY.register("white_log", () -> new WhiteLogBlock());
	public static final RegistryObject<Block> WHITE_PLANKS = REGISTRY.register("white_planks", () -> new WhitePlanksBlock());
	public static final RegistryObject<Block> WHITE_LEAVES = REGISTRY.register("white_leaves", () -> new WhiteLeavesBlock());
	public static final RegistryObject<Block> WHITE_STAIRS = REGISTRY.register("white_stairs", () -> new WhiteStairsBlock());
	public static final RegistryObject<Block> WHITE_SLAB = REGISTRY.register("white_slab", () -> new WhiteSlabBlock());
	public static final RegistryObject<Block> WHITE_FENCE = REGISTRY.register("white_fence", () -> new WhiteFenceBlock());
	public static final RegistryObject<Block> WHITE_FENCE_GATE = REGISTRY.register("white_fence_gate", () -> new WhiteFenceGateBlock());
	public static final RegistryObject<Block> WHITE_PRESSURE_PLATE = REGISTRY.register("white_pressure_plate", () -> new WhitePressurePlateBlock());
	public static final RegistryObject<Block> WHITE_BUTTON = REGISTRY.register("white_button", () -> new WhiteButtonBlock());
	public static final RegistryObject<Block> BLACK_WOOD = REGISTRY.register("black_wood", () -> new BlackWoodBlock());
	public static final RegistryObject<Block> BLACK_LOG = REGISTRY.register("black_log", () -> new BlackLogBlock());
	public static final RegistryObject<Block> BLACK_PLANKS = REGISTRY.register("black_planks", () -> new BlackPlanksBlock());
	public static final RegistryObject<Block> BLACK_LEAVES = REGISTRY.register("black_leaves", () -> new BlackLeavesBlock());
	public static final RegistryObject<Block> BLACK_STAIRS = REGISTRY.register("black_stairs", () -> new BlackStairsBlock());
	public static final RegistryObject<Block> BLACK_SLAB = REGISTRY.register("black_slab", () -> new BlackSlabBlock());
	public static final RegistryObject<Block> BLACK_FENCE = REGISTRY.register("black_fence", () -> new BlackFenceBlock());
	public static final RegistryObject<Block> BLACK_FENCE_GATE = REGISTRY.register("black_fence_gate", () -> new BlackFenceGateBlock());
	public static final RegistryObject<Block> BLACK_PRESSURE_PLATE = REGISTRY.register("black_pressure_plate", () -> new BlackPressurePlateBlock());
	public static final RegistryObject<Block> BLACK_BUTTON = REGISTRY.register("black_button", () -> new BlackButtonBlock());
	public static final RegistryObject<Block> TANIUM_ORE = REGISTRY.register("tanium_ore", () -> new TaniumOreBlock());
	public static final RegistryObject<Block> TANIUM_BLOCK = REGISTRY.register("tanium_block", () -> new TaniumBlockBlock());
	public static final RegistryObject<Block> TATANIUM_ORE = REGISTRY.register("tatanium_ore", () -> new TataniumOreBlock());
	public static final RegistryObject<Block> TATANIUM_BLOCK = REGISTRY.register("tatanium_block", () -> new TataniumBlockBlock());
	public static final RegistryObject<Block> TATATANIUM_ORE = REGISTRY.register("tatatanium_ore", () -> new TatataniumOreBlock());
	public static final RegistryObject<Block> TATATANIUM_BLOCK = REGISTRY.register("tatatanium_block", () -> new TatataniumBlockBlock());
	public static final RegistryObject<Block> TATATATANIUM_ORE = REGISTRY.register("tatatatanium_ore", () -> new TatatataniumOreBlock());
	public static final RegistryObject<Block> TATATATANIUM_BLOCK = REGISTRY.register("tatatatanium_block", () -> new TatatataniumBlockBlock());
	public static final RegistryObject<Block> TATATATATANIUM_ORE = REGISTRY.register("tatatatatanium_ore", () -> new TatatatataniumOreBlock());
	public static final RegistryObject<Block> TATATATATANIUM_BLOCK = REGISTRY.register("tatatatatanium_block", () -> new TatatatataniumBlockBlock());
	public static final RegistryObject<Block> DIAMOND_TREE_WOOD = REGISTRY.register("diamond_tree_wood", () -> new DiamondTreeWoodBlock());
	public static final RegistryObject<Block> DIAMOND_TREE_LOG = REGISTRY.register("diamond_tree_log", () -> new DiamondTreeLogBlock());
	public static final RegistryObject<Block> DIAMOND_TREE_PLANKS = REGISTRY.register("diamond_tree_planks", () -> new DiamondTreePlanksBlock());
	public static final RegistryObject<Block> DIAMOND_TREE_LEAVES = REGISTRY.register("diamond_tree_leaves", () -> new DiamondTreeLeavesBlock());
	public static final RegistryObject<Block> DIAMOND_TREE_STAIRS = REGISTRY.register("diamond_tree_stairs", () -> new DiamondTreeStairsBlock());
	public static final RegistryObject<Block> DIAMOND_TREE_SLAB = REGISTRY.register("diamond_tree_slab", () -> new DiamondTreeSlabBlock());
	public static final RegistryObject<Block> DIAMOND_TREE_FENCE = REGISTRY.register("diamond_tree_fence", () -> new DiamondTreeFenceBlock());
	public static final RegistryObject<Block> DIAMOND_TREE_FENCE_GATE = REGISTRY.register("diamond_tree_fence_gate",
			() -> new DiamondTreeFenceGateBlock());
	public static final RegistryObject<Block> DIAMOND_TREE_PRESSURE_PLATE = REGISTRY.register("diamond_tree_pressure_plate",
			() -> new DiamondTreePressurePlateBlock());
	public static final RegistryObject<Block> DIAMOND_TREE_BUTTON = REGISTRY.register("diamond_tree_button", () -> new DiamondTreeButtonBlock());
	public static final RegistryObject<Block> PRINTER = REGISTRY.register("printer", () -> new PrinterBlock());
	public static final RegistryObject<Block> URANIUM_ORE = REGISTRY.register("uranium_ore", () -> new UraniumOreBlock());
	public static final RegistryObject<Block> URANIUM_BLOCK = REGISTRY.register("uranium_block", () -> new UraniumBlockBlock());
	public static final RegistryObject<Block> THORIUM_ORE = REGISTRY.register("thorium_ore", () -> new ThoriumOreBlock());
	public static final RegistryObject<Block> THORIUM_BLOCK = REGISTRY.register("thorium_block", () -> new ThoriumBlockBlock());
	public static final RegistryObject<Block> SOLAR_PANEL_T_1 = REGISTRY.register("solar_panel_t_1", () -> new SolarPanelT1Block());
	public static final RegistryObject<Block> ELECTRIC_FURNACE_T_1 = REGISTRY.register("electric_furnace_t_1", () -> new ElectricFurnaceT1Block());
	public static final RegistryObject<Block> WHITE_GLICH_BLOCK = REGISTRY.register("white_glich_block", () -> new WhiteGlichBlockBlock());
}
