
package tyuxx.grimmscraft.item;

import net.minecraft.world.item.crafting.Ingredient;
import net.minecraft.world.item.Tier;
import net.minecraft.world.item.PickaxeItem;
import net.minecraft.world.item.Items;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.Item;

public class LapisPickaxeItem extends PickaxeItem {
	public LapisPickaxeItem() {
		super(new Tier() {
			public int getUses() {
				return 3143;
			}

			public float getSpeed() {
				return 18f;
			}

			public float getAttackDamageBonus() {
				return 10f;
			}

			public int getLevel() {
				return 12;
			}

			public int getEnchantmentValue() {
				return 85;
			}

			public Ingredient getRepairIngredient() {
				return Ingredient.of(new ItemStack(Items.LAPIS_LAZULI));
			}
		}, 1, -3f, new Item.Properties());
	}
}