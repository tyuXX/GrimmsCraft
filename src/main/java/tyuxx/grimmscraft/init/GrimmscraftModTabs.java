
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package tyuxx.grimmscraft.init;

import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.event.CreativeModeTabEvent;

import net.minecraft.world.item.CreativeModeTabs;

@Mod.EventBusSubscriber(bus = Mod.EventBusSubscriber.Bus.MOD)
public class GrimmscraftModTabs {
	@SubscribeEvent
	public static void buildTabContentsVanilla(CreativeModeTabEvent.BuildContents tabData) {

		if (tabData.getTab() == CreativeModeTabs.BUILDING_BLOCKS) {
			tabData.accept(GrimmscraftModBlocks.WHITE_WOOD.get().asItem());
			tabData.accept(GrimmscraftModBlocks.WHITE_LOG.get().asItem());
			tabData.accept(GrimmscraftModBlocks.WHITE_PLANKS.get().asItem());
			tabData.accept(GrimmscraftModBlocks.WHITE_STAIRS.get().asItem());
			tabData.accept(GrimmscraftModBlocks.WHITE_SLAB.get().asItem());
			tabData.accept(GrimmscraftModBlocks.WHITE_BUTTON.get().asItem());
			tabData.accept(GrimmscraftModBlocks.BLACK_WOOD.get().asItem());
			tabData.accept(GrimmscraftModBlocks.BLACK_LOG.get().asItem());
			tabData.accept(GrimmscraftModBlocks.BLACK_PLANKS.get().asItem());
			tabData.accept(GrimmscraftModBlocks.BLACK_STAIRS.get().asItem());
			tabData.accept(GrimmscraftModBlocks.BLACK_SLAB.get().asItem());
			tabData.accept(GrimmscraftModBlocks.BLACK_BUTTON.get().asItem());
			tabData.accept(GrimmscraftModBlocks.TANIUM_ORE.get().asItem());
			tabData.accept(GrimmscraftModBlocks.TANIUM_BLOCK.get().asItem());
			tabData.accept(GrimmscraftModBlocks.TATANIUM_ORE.get().asItem());
			tabData.accept(GrimmscraftModBlocks.TATANIUM_BLOCK.get().asItem());
			tabData.accept(GrimmscraftModBlocks.TATATANIUM_ORE.get().asItem());
			tabData.accept(GrimmscraftModBlocks.TATATANIUM_BLOCK.get().asItem());
			tabData.accept(GrimmscraftModBlocks.TATATATANIUM_ORE.get().asItem());
			tabData.accept(GrimmscraftModBlocks.TATATATANIUM_BLOCK.get().asItem());
			tabData.accept(GrimmscraftModBlocks.TATATATATANIUM_ORE.get().asItem());
			tabData.accept(GrimmscraftModBlocks.TATATATATANIUM_BLOCK.get().asItem());
			tabData.accept(GrimmscraftModBlocks.DIAMOND_TREE_WOOD.get().asItem());
			tabData.accept(GrimmscraftModBlocks.DIAMOND_TREE_LOG.get().asItem());
			tabData.accept(GrimmscraftModBlocks.DIAMOND_TREE_PLANKS.get().asItem());
			tabData.accept(GrimmscraftModBlocks.DIAMOND_TREE_STAIRS.get().asItem());
			tabData.accept(GrimmscraftModBlocks.DIAMOND_TREE_SLAB.get().asItem());
			tabData.accept(GrimmscraftModBlocks.DIAMOND_TREE_BUTTON.get().asItem());
			tabData.accept(GrimmscraftModBlocks.URANIUM_ORE.get().asItem());
			tabData.accept(GrimmscraftModBlocks.URANIUM_BLOCK.get().asItem());
			tabData.accept(GrimmscraftModBlocks.THORIUM_ORE.get().asItem());
			tabData.accept(GrimmscraftModBlocks.THORIUM_BLOCK.get().asItem());
			tabData.accept(GrimmscraftModBlocks.SOLAR_PANEL_T_1.get().asItem());
			tabData.accept(GrimmscraftModBlocks.ELECTRIC_FURNACE_T_1.get().asItem());
			tabData.accept(GrimmscraftModBlocks.WHITE_GLICH_BLOCK.get().asItem());
		}

		if (tabData.getTab() == CreativeModeTabs.REDSTONE_BLOCKS) {
			tabData.accept(GrimmscraftModBlocks.WHITE_FENCE_GATE.get().asItem());
			tabData.accept(GrimmscraftModBlocks.WHITE_PRESSURE_PLATE.get().asItem());
			tabData.accept(GrimmscraftModBlocks.BLACK_FENCE_GATE.get().asItem());
			tabData.accept(GrimmscraftModBlocks.BLACK_PRESSURE_PLATE.get().asItem());
			tabData.accept(GrimmscraftModBlocks.DIAMOND_TREE_FENCE_GATE.get().asItem());
			tabData.accept(GrimmscraftModBlocks.DIAMOND_TREE_PRESSURE_PLATE.get().asItem());
			tabData.accept(GrimmscraftModBlocks.TNT_X_9.get().asItem());
			tabData.accept(GrimmscraftModBlocks.TNT_X_81.get().asItem());
		}

		if (tabData.getTab() == CreativeModeTabs.COMBAT) {
			tabData.accept(GrimmscraftModItems.TANIUM_SWORD.get());
			tabData.accept(GrimmscraftModItems.TANIUM_ARMOR_HELMET.get());
			tabData.accept(GrimmscraftModItems.TANIUM_ARMOR_CHESTPLATE.get());
			tabData.accept(GrimmscraftModItems.TANIUM_ARMOR_LEGGINGS.get());
			tabData.accept(GrimmscraftModItems.TANIUM_ARMOR_BOOTS.get());
			tabData.accept(GrimmscraftModItems.TATANIUM_SWORD.get());
			tabData.accept(GrimmscraftModItems.TATANIUM_ARMOR_HELMET.get());
			tabData.accept(GrimmscraftModItems.TATANIUM_ARMOR_CHESTPLATE.get());
			tabData.accept(GrimmscraftModItems.TATANIUM_ARMOR_LEGGINGS.get());
			tabData.accept(GrimmscraftModItems.TATANIUM_ARMOR_BOOTS.get());
			tabData.accept(GrimmscraftModItems.TATATANIUM_SWORD.get());
			tabData.accept(GrimmscraftModItems.TATATANIUM_ARMOR_HELMET.get());
			tabData.accept(GrimmscraftModItems.TATATANIUM_ARMOR_CHESTPLATE.get());
			tabData.accept(GrimmscraftModItems.TATATANIUM_ARMOR_LEGGINGS.get());
			tabData.accept(GrimmscraftModItems.TATATANIUM_ARMOR_BOOTS.get());
			tabData.accept(GrimmscraftModItems.TATATATANIUM_SWORD.get());
			tabData.accept(GrimmscraftModItems.TATATATANIUM_ARMOR_HELMET.get());
			tabData.accept(GrimmscraftModItems.TATATATANIUM_ARMOR_CHESTPLATE.get());
			tabData.accept(GrimmscraftModItems.TATATATANIUM_ARMOR_LEGGINGS.get());
			tabData.accept(GrimmscraftModItems.TATATATANIUM_ARMOR_BOOTS.get());
			tabData.accept(GrimmscraftModItems.TATATATATANIUM_SWORD.get());
			tabData.accept(GrimmscraftModItems.TATATATATANIUM_ARMOR_HELMET.get());
			tabData.accept(GrimmscraftModItems.TATATATATANIUM_ARMOR_CHESTPLATE.get());
			tabData.accept(GrimmscraftModItems.TATATATATANIUM_ARMOR_LEGGINGS.get());
			tabData.accept(GrimmscraftModItems.TATATATATANIUM_ARMOR_BOOTS.get());
			tabData.accept(GrimmscraftModItems.WHITE_GLICH_ARMOR_HELMET.get());
			tabData.accept(GrimmscraftModItems.WHITE_GLICH_ARMOR_CHESTPLATE.get());
			tabData.accept(GrimmscraftModItems.WHITE_GLICH_ARMOR_LEGGINGS.get());
			tabData.accept(GrimmscraftModItems.WHITE_GLICH_ARMOR_BOOTS.get());
			tabData.accept(GrimmscraftModItems.GLOWSTONE_SWORD.get());
			tabData.accept(GrimmscraftModItems.SLIME_SWORD.get());
			tabData.accept(GrimmscraftModItems.PRISMARINE_SWORD.get());
			tabData.accept(GrimmscraftModItems.LAPIS_SWORD.get());
			tabData.accept(GrimmscraftModItems.FIERY_SWORD.get());
			tabData.accept(GrimmscraftModItems.ENDER_SWORD.get());
			tabData.accept(GrimmscraftModItems.COAL_SWORD.get());
			tabData.accept(GrimmscraftModItems.BONE_SWORD.get());
			tabData.accept(GrimmscraftModItems.OBSIDIAN_SWORD.get());
			tabData.accept(GrimmscraftModItems.NETHERRACK_SWORD.get());
			tabData.accept(GrimmscraftModItems.PAPER_SWORD.get());
			tabData.accept(GrimmscraftModItems.REDSTONE_SWORD.get());
			tabData.accept(GrimmscraftModItems.QUARTZ_SWORD.get());
		}

		if (tabData.getTab() == CreativeModeTabs.SPAWN_EGGS) {
			tabData.accept(GrimmscraftModItems.TANIUM_INGOT.get());
			tabData.accept(GrimmscraftModItems.TATANIUM_INGOT.get());
			tabData.accept(GrimmscraftModItems.TATATANIUM_INGOT.get());
			tabData.accept(GrimmscraftModItems.TATATATANIUM_INGOT.get());
			tabData.accept(GrimmscraftModItems.TATATATATANIUM_INGOT.get());
			tabData.accept(GrimmscraftModItems.CATALYST_BASE.get());
			tabData.accept(GrimmscraftModItems.BOTTLE_1.get());
			tabData.accept(GrimmscraftModItems.VODKA_1.get());
			tabData.accept(GrimmscraftModItems.TIER_1_COAL.get());
			tabData.accept(GrimmscraftModItems.TIER_2_COAL.get());
			tabData.accept(GrimmscraftModItems.TIER_3_COAL.get());
			tabData.accept(GrimmscraftModItems.DYE_STACK.get());
			tabData.accept(GrimmscraftModItems.PRINTER_CARTRIDGE.get());
			tabData.accept(GrimmscraftModItems.PRINTED_PAPER.get());
			tabData.accept(GrimmscraftModItems.CARTON.get());
			tabData.accept(GrimmscraftModItems.L_BAG_T_1.get());
			tabData.accept(GrimmscraftModItems.DUSTY_IRON.get());
			tabData.accept(GrimmscraftModItems.STEEL.get());
			tabData.accept(GrimmscraftModItems.HOT_STEEL.get());
			tabData.accept(GrimmscraftModItems.FORGED_STEEL_T_1.get());
			tabData.accept(GrimmscraftModItems.FORGED_HOT_STEEL_T_1.get());
			tabData.accept(GrimmscraftModItems.FORGED_STEEL_T_2.get());
			tabData.accept(GrimmscraftModItems.FORGED_HOT_STEEL_T_2.get());
			tabData.accept(GrimmscraftModItems.FORGED_STEEL_T_3.get());
			tabData.accept(GrimmscraftModItems.FORGED_HOT_STEEL_T_3.get());
			tabData.accept(GrimmscraftModItems.FORGED_STEEL_T_4.get());
			tabData.accept(GrimmscraftModItems.FORGED_HOT_STEEL_T_4.get());
			tabData.accept(GrimmscraftModItems.FORGED_STEEL_T_5.get());
			tabData.accept(GrimmscraftModItems.FORGED_HOT_STEEL_T_5.get());
			tabData.accept(GrimmscraftModItems.FORGED_STEEL_T_6.get());
			tabData.accept(GrimmscraftModItems.FORGED_HOT_STEEL_T_6.get());
			tabData.accept(GrimmscraftModItems.FORGED_STEEL_T_7.get());
			tabData.accept(GrimmscraftModItems.FORGED_HOT_STEEL_T_7.get());
			tabData.accept(GrimmscraftModItems.FORGED_STEEL_T_8.get());
			tabData.accept(GrimmscraftModItems.FORGED_HOT_STEEL_T_8.get());
			tabData.accept(GrimmscraftModItems.IRON_HAMMER.get());
			tabData.accept(GrimmscraftModItems.DIAMOND_HAMMER.get());
			tabData.accept(GrimmscraftModItems.GEIGER_COUNTER.get());
			tabData.accept(GrimmscraftModItems.IRON_WIRE.get());
			tabData.accept(GrimmscraftModItems.GOLD_WIRE.get());
			tabData.accept(GrimmscraftModItems.REDSTONE_WIRE.get());
			tabData.accept(GrimmscraftModItems.URANIUM_INGOT.get());
			tabData.accept(GrimmscraftModItems.THORIUM_INGOT.get());
			tabData.accept(GrimmscraftModItems.FE_METER.get());
			tabData.accept(GrimmscraftModItems.WHITE_GLICH.get());
			tabData.accept(GrimmscraftModItems.BOTTLE_2.get());
			tabData.accept(GrimmscraftModItems.VODKA_2.get());
			tabData.accept(GrimmscraftModItems.VODKA_3.get());
			tabData.accept(GrimmscraftModItems.BOTTLE_3.get());
			tabData.accept(GrimmscraftModItems.PERMANENT_SATURATION_APPLE.get());
			tabData.accept(GrimmscraftModItems.TEST_DUMMY_SPAWN_EGG.get());
			tabData.accept(GrimmscraftModItems.RUSSIAN_ROULETTE.get());
			tabData.accept(GrimmscraftModItems.FORGED_STEEL_T_9.get());
			tabData.accept(GrimmscraftModItems.FORGED_HOT_STEEL_T_9.get());
		}

		if (tabData.getTab() == CreativeModeTabs.INGREDIENTS) {
			tabData.accept(GrimmscraftModItems.OBSIDIAN_SHARD.get());
		}

		if (tabData.getTab() == CreativeModeTabs.NATURAL_BLOCKS) {
			tabData.accept(GrimmscraftModBlocks.WHITE_LEAVES.get().asItem());
			tabData.accept(GrimmscraftModBlocks.WHITE_FENCE.get().asItem());
			tabData.accept(GrimmscraftModBlocks.BLACK_LEAVES.get().asItem());
			tabData.accept(GrimmscraftModBlocks.BLACK_FENCE.get().asItem());
			tabData.accept(GrimmscraftModBlocks.DIAMOND_TREE_LEAVES.get().asItem());
			tabData.accept(GrimmscraftModBlocks.DIAMOND_TREE_FENCE.get().asItem());
			tabData.accept(GrimmscraftModBlocks.PRINTER.get().asItem());
		}

		if (tabData.getTab() == CreativeModeTabs.TOOLS_AND_UTILITIES) {
			tabData.accept(GrimmscraftModItems.TANIUM_PICKAXE.get());
			tabData.accept(GrimmscraftModItems.TANIUM_AXE.get());
			tabData.accept(GrimmscraftModItems.TANIUM_SHOVEL.get());
			tabData.accept(GrimmscraftModItems.TANIUM_HOE.get());
			tabData.accept(GrimmscraftModItems.TATANIUM_PICKAXE.get());
			tabData.accept(GrimmscraftModItems.TATANIUM_AXE.get());
			tabData.accept(GrimmscraftModItems.TATANIUM_SHOVEL.get());
			tabData.accept(GrimmscraftModItems.TATANIUM_HOE.get());
			tabData.accept(GrimmscraftModItems.TATATANIUM_PICKAXE.get());
			tabData.accept(GrimmscraftModItems.TATATANIUM_AXE.get());
			tabData.accept(GrimmscraftModItems.TATATANIUM_SHOVEL.get());
			tabData.accept(GrimmscraftModItems.TATATANIUM_HOE.get());
			tabData.accept(GrimmscraftModItems.TATATATANIUM_PICKAXE.get());
			tabData.accept(GrimmscraftModItems.TATATATANIUM_AXE.get());
			tabData.accept(GrimmscraftModItems.TATATATANIUM_SHOVEL.get());
			tabData.accept(GrimmscraftModItems.TATATATANIUM_HOE.get());
			tabData.accept(GrimmscraftModItems.TATATATATANIUM_PICKAXE.get());
			tabData.accept(GrimmscraftModItems.TATATATATANIUM_AXE.get());
			tabData.accept(GrimmscraftModItems.TATATATATANIUM_SHOVEL.get());
			tabData.accept(GrimmscraftModItems.TATATATATANIUM_HOE.get());
			tabData.accept(GrimmscraftModItems.KATANA_T_1.get());
			tabData.accept(GrimmscraftModItems.KATANA_T_2.get());
			tabData.accept(GrimmscraftModItems.KATANA_T_3.get());
			tabData.accept(GrimmscraftModItems.KATANA_T_4.get());
			tabData.accept(GrimmscraftModItems.GLOWSTONE_PICKAXE.get());
			tabData.accept(GrimmscraftModItems.GLOWSTONE_AXE.get());
			tabData.accept(GrimmscraftModItems.GLOWSTONE_SHOVEL.get());
			tabData.accept(GrimmscraftModItems.GLOWSTONE_HOE.get());
			tabData.accept(GrimmscraftModItems.SLIME_PICKAXE.get());
			tabData.accept(GrimmscraftModItems.SLIME_AXE.get());
			tabData.accept(GrimmscraftModItems.SLIME_SHOVEL.get());
			tabData.accept(GrimmscraftModItems.SLIME_HOE.get());
			tabData.accept(GrimmscraftModItems.PRISMARINE_PICKAXE.get());
			tabData.accept(GrimmscraftModItems.PRISMARINE_AXE.get());
			tabData.accept(GrimmscraftModItems.PRISMARINE_SHOVEL.get());
			tabData.accept(GrimmscraftModItems.PRISMARINE_HOE.get());
			tabData.accept(GrimmscraftModItems.LAPIS_PICKAXE.get());
			tabData.accept(GrimmscraftModItems.LAPIS_AXE.get());
			tabData.accept(GrimmscraftModItems.LAPIS_SHOVEL.get());
			tabData.accept(GrimmscraftModItems.LAPIS_HOE.get());
			tabData.accept(GrimmscraftModItems.FIERY_PICKAXE.get());
			tabData.accept(GrimmscraftModItems.FIERY_AXE.get());
			tabData.accept(GrimmscraftModItems.FIERY_SHOVEL.get());
			tabData.accept(GrimmscraftModItems.FIERY_HOE.get());
			tabData.accept(GrimmscraftModItems.ENDER_PICKAXE.get());
			tabData.accept(GrimmscraftModItems.ENDER_AXE.get());
			tabData.accept(GrimmscraftModItems.ENDER_SHOVEL.get());
			tabData.accept(GrimmscraftModItems.ENDER_HOE.get());
			tabData.accept(GrimmscraftModItems.COAL_PICKAXE.get());
			tabData.accept(GrimmscraftModItems.COAL_AXE.get());
			tabData.accept(GrimmscraftModItems.COAL_SHOVEL.get());
			tabData.accept(GrimmscraftModItems.COAL_HOE.get());
			tabData.accept(GrimmscraftModItems.BONE_PICKAXE.get());
			tabData.accept(GrimmscraftModItems.BONE_AXE.get());
			tabData.accept(GrimmscraftModItems.BONE_SHOVEL.get());
			tabData.accept(GrimmscraftModItems.BONE_HOE.get());
			tabData.accept(GrimmscraftModItems.OBSIDIAN_PICKAXE.get());
			tabData.accept(GrimmscraftModItems.OBSIDIAN_AXE.get());
			tabData.accept(GrimmscraftModItems.OBSIDIAN_SHOVEL.get());
			tabData.accept(GrimmscraftModItems.OBSIDIAN_HOE.get());
			tabData.accept(GrimmscraftModItems.NETHERRACK_PICKAXE.get());
			tabData.accept(GrimmscraftModItems.NETHERRACK_AXE.get());
			tabData.accept(GrimmscraftModItems.NETHERRACK_SHOVEL.get());
			tabData.accept(GrimmscraftModItems.NETHERRACK_HOE.get());
			tabData.accept(GrimmscraftModItems.PAPER_PICKAXE.get());
			tabData.accept(GrimmscraftModItems.PAPER_AXE.get());
			tabData.accept(GrimmscraftModItems.PAPER_SHOVEL.get());
			tabData.accept(GrimmscraftModItems.PAPER_HOE.get());
			tabData.accept(GrimmscraftModItems.REDSTONE_PICKAXE.get());
			tabData.accept(GrimmscraftModItems.REDSTONE_AXE.get());
			tabData.accept(GrimmscraftModItems.REDSTONE_SHOVEL.get());
			tabData.accept(GrimmscraftModItems.REDSTONE_HOE.get());
			tabData.accept(GrimmscraftModItems.QUARTZ_PICKAXE.get());
			tabData.accept(GrimmscraftModItems.QUARTZ_AXE.get());
			tabData.accept(GrimmscraftModItems.QUARTZ_SHOVEL.get());
			tabData.accept(GrimmscraftModItems.QUARTZ_HOE.get());
			tabData.accept(GrimmscraftModItems.KATANA_R_1.get());
			tabData.accept(GrimmscraftModItems.CLOCKWORK_SCYTHE_T_0.get());
			tabData.accept(GrimmscraftModItems.SOUL.get());
			tabData.accept(GrimmscraftModItems.CLOCKWORK_SCYTHE_T_1.get());
		}
	}
}
