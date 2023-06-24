
package tyuxx.grimmscraft.item;

import tyuxx.grimmscraft.init.GrimmscraftModItems;

import net.minecraft.world.item.crafting.Ingredient;
import net.minecraft.world.item.Tier;
import net.minecraft.world.item.SwordItem;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.Item;

public class TatatatataniumSwordItem extends SwordItem {
	public TatatatataniumSwordItem() {
		super(new Tier() {
			public int getUses() {
				return 4595;
			}

			public float getSpeed() {
				return 21f;
			}

			public float getAttackDamageBonus() {
				return 46f;
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
		}, 3, -3f, new Item.Properties());
	}
}
