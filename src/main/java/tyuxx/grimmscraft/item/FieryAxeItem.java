
package tyuxx.grimmscraft.item;

import net.minecraft.world.item.crafting.Ingredient;
import net.minecraft.world.item.Tier;
import net.minecraft.world.item.Items;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.AxeItem;

public class FieryAxeItem extends AxeItem {
	public FieryAxeItem() {
		super(new Tier() {
			public int getUses() {
				return 4120;
			}

			public float getSpeed() {
				return 20f;
			}

			public float getAttackDamageBonus() {
				return 13f;
			}

			public int getLevel() {
				return 15;
			}

			public int getEnchantmentValue() {
				return 104;
			}

			public Ingredient getRepairIngredient() {
				return Ingredient.of(new ItemStack(Items.BLAZE_ROD));
			}
		}, 1, -3f, new Item.Properties());
	}
}
