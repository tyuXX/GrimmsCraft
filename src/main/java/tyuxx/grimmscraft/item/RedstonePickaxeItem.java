
package tyuxx.grimmscraft.item;

import net.minecraft.world.level.block.Blocks;
import net.minecraft.world.item.crafting.Ingredient;
import net.minecraft.world.item.Tier;
import net.minecraft.world.item.PickaxeItem;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.Item;

public class RedstonePickaxeItem extends PickaxeItem {
	public RedstonePickaxeItem() {
		super(new Tier() {
			public int getUses() {
				return 1990;
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
				return 62;
			}

			public Ingredient getRepairIngredient() {
				return Ingredient.of(new ItemStack(Blocks.AIR));
			}
		}, 1, -3f, new Item.Properties());
	}
}
