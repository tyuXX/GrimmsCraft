package tyuxx.grimmscraft.procedures;

import net.minecraft.world.item.enchantment.Enchantments;
import net.minecraft.world.item.ItemStack;

public class DefaultGloveItemIsCraftedsmeltedProcedure {
	public static void execute(ItemStack itemstack) {
		itemstack.enchant(Enchantments.KNOCKBACK, 1);
	}
}