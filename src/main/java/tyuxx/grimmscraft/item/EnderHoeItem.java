
package tyuxx.grimmscraft.item;

import net.minecraft.world.item.crafting.Ingredient;
import net.minecraft.world.item.Tier;
import net.minecraft.world.item.Items;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.HoeItem;

public class EnderHoeItem extends HoeItem {
	public EnderHoeItem() {
		super(new Tier() {
			public int getUses() {
				return 4838;
			}

			public float getSpeed() {
				return 21f;
			}

			public float getAttackDamageBonus() {
				return 15f;
			}

			public int getLevel() {
				return 17;
			}

			public int getEnchantmentValue() {
				return 116;
			}

			public Ingredient getRepairIngredient() {
				return Ingredient.of(new ItemStack(Items.ENDER_EYE));
			}
		}, 0, -3f, new Item.Properties());
	}
}
