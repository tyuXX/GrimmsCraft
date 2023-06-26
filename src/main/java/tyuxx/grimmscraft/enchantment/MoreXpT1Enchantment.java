
package tyuxx.grimmscraft.enchantment;

import net.minecraft.world.item.enchantment.EnchantmentCategory;
import net.minecraft.world.item.enchantment.Enchantment;
import net.minecraft.world.entity.EquipmentSlot;

public class MoreXpT1Enchantment extends Enchantment {
	public MoreXpT1Enchantment(EquipmentSlot... slots) {
		super(Enchantment.Rarity.RARE, EnchantmentCategory.WEAPON, slots);
	}

	@Override
	public int getMaxLevel() {
		return 10;
	}

	@Override
	public boolean isTreasureOnly() {
		return true;
	}
}
