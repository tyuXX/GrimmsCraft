
package tyuxx.grimmscraft.item;

import net.minecraft.world.item.crafting.Ingredient;
import net.minecraft.world.item.Tier;
import net.minecraft.world.item.SwordItem;
import net.minecraft.world.item.Items;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.Item;

public class CoalSwordItem extends SwordItem {
	public CoalSwordItem() {
		super(new Tier() {
			public int getUses() {
				return 1110;
			}

			public float getSpeed() {
				return 11f;
			}

			public float getAttackDamageBonus() {
				return 4f;
			}

			public int getLevel() {
				return 6;
			}

			public int getEnchantmentValue() {
				return 41;
			}

			public Ingredient getRepairIngredient() {
				return Ingredient.of(new ItemStack(Items.COAL));
			}
		}, 3, -3f, new Item.Properties());
	}
}
