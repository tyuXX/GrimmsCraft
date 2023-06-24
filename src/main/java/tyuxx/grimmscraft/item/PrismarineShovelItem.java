
package tyuxx.grimmscraft.item;

import net.minecraft.world.item.crafting.Ingredient;
import net.minecraft.world.item.Tier;
import net.minecraft.world.item.ShovelItem;
import net.minecraft.world.item.Items;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.Item;

public class PrismarineShovelItem extends ShovelItem {
	public PrismarineShovelItem() {
		super(new Tier() {
			public int getUses() {
				return 2182;
			}

			public float getSpeed() {
				return 15f;
			}

			public float getAttackDamageBonus() {
				return 7f;
			}

			public int getLevel() {
				return 9;
			}

			public int getEnchantmentValue() {
				return 66;
			}

			public Ingredient getRepairIngredient() {
				return Ingredient.of(new ItemStack(Items.PRISMARINE_SHARD));
			}
		}, 1, -3f, new Item.Properties());
	}
}
