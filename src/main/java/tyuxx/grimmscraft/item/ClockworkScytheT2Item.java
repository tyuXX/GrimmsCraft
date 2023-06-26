
package tyuxx.grimmscraft.item;

import tyuxx.grimmscraft.procedures.ClockworkScytheT1ToolInInventoryTickProcedure;
import tyuxx.grimmscraft.procedures.ClockworkScytheT1LivingEntityIsHitWithToolProcedure;
import tyuxx.grimmscraft.procedures.ClockworkScyteT2CraftedSmeltedProcedure;

import net.minecraft.world.level.Level;
import net.minecraft.world.item.crafting.Ingredient;
import net.minecraft.world.item.Tier;
import net.minecraft.world.item.SwordItem;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.Item;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.entity.Entity;

public class ClockworkScytheT2Item extends SwordItem {
	public ClockworkScytheT2Item() {
		super(new Tier() {
			public int getUses() {
				return 97000;
			}

			public float getSpeed() {
				return 4f;
			}

			public float getAttackDamageBonus() {
				return 33f;
			}

			public int getLevel() {
				return 1;
			}

			public int getEnchantmentValue() {
				return 2;
			}

			public Ingredient getRepairIngredient() {
				return Ingredient.of();
			}
		}, 3, -2.3f, new Item.Properties());
	}

	@Override
	public boolean hurtEnemy(ItemStack itemstack, LivingEntity entity, LivingEntity sourceentity) {
		boolean retval = super.hurtEnemy(itemstack, entity, sourceentity);
		ClockworkScytheT1LivingEntityIsHitWithToolProcedure.execute(entity, itemstack);
		return retval;
	}

	@Override
	public void onCraftedBy(ItemStack itemstack, Level world, Player entity) {
		super.onCraftedBy(itemstack, world, entity);
		ClockworkScyteT2CraftedSmeltedProcedure.execute(itemstack);
	}

	@Override
	public void inventoryTick(ItemStack itemstack, Level world, Entity entity, int slot, boolean selected) {
		super.inventoryTick(itemstack, world, entity, slot, selected);
		ClockworkScytheT1ToolInInventoryTickProcedure.execute(itemstack);
	}
}
