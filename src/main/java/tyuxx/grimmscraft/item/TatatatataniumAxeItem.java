
package tyuxx.grimmscraft.item;

import tyuxx.grimmscraft.init.GrimmscraftModItems;

import net.minecraft.world.item.crafting.Ingredient;
import net.minecraft.world.item.Tier;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.AxeItem;

public class TatatatataniumAxeItem extends AxeItem {
	public TatatatataniumAxeItem() {
		super(new Tier() {
			public int getUses() {
				return 4595;
			}

			public float getSpeed() {
				return 21f;
			}

			public float getAttackDamageBonus() {
				return 70f;
			}

			public int getLevel() {
				return 16;
			}

			public int getEnchantmentValue() {
				return 112;
			}

			public Ingredient getRepairIngredient() {
				return Ingredient.of(new ItemStack(GrimmscraftModItems.TATATATATANIUM_INGOT.get()));
			}
		}, 1, -3f, new Item.Properties());
	}
}
