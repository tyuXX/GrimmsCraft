
package tyuxx.grimmscraft.item;

import tyuxx.grimmscraft.procedures.KatanaT2LivingEntityIsHitWithToolProcedure;
import tyuxx.grimmscraft.procedures.KatanaT2ItemIsCraftedsmeltedProcedure;

import net.minecraft.world.level.Level;
import net.minecraft.world.item.crafting.Ingredient;
import net.minecraft.world.item.Tier;
import net.minecraft.world.item.SwordItem;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.Item;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.entity.LivingEntity;

public class KatanaT2Item extends SwordItem {
	public KatanaT2Item() {
		super(new Tier() {
			public int getUses() {
				return 20000;
			}

			public float getSpeed() {
				return 4f;
			}

			public float getAttackDamageBonus() {
				return 5f;
			}

			public int getLevel() {
				return 1;
			}

			public int getEnchantmentValue() {
				return 15;
			}

			public Ingredient getRepairIngredient() {
				return Ingredient.of();
			}
		}, 3, -1.7f, new Item.Properties());
	}

	@Override
	public boolean hurtEnemy(ItemStack itemstack, LivingEntity entity, LivingEntity sourceentity) {
		boolean retval = super.hurtEnemy(itemstack, entity, sourceentity);
		KatanaT2LivingEntityIsHitWithToolProcedure.execute(entity.level, entity, itemstack);
		return retval;
	}

	@Override
	public void onCraftedBy(ItemStack itemstack, Level world, Player entity) {
		super.onCraftedBy(itemstack, world, entity);
		KatanaT2ItemIsCraftedsmeltedProcedure.execute(world, itemstack);
	}
}