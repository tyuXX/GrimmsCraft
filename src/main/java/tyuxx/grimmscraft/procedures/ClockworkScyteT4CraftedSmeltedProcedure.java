package tyuxx.grimmscraft.procedures;

import net.minecraft.world.item.ItemStack;

public class ClockworkScyteT4CraftedSmeltedProcedure {
	public static void execute(ItemStack itemstack) {
		itemstack.getOrCreateTag().putDouble("kills", 0);
		itemstack.getOrCreateTag().putDouble("xp", 0);
		itemstack.getOrCreateTag().putDouble("xpn", 25);
		itemstack.getOrCreateTag().putDouble("xpnd", 1.1);
		itemstack.getOrCreateTag().putDouble("lvl", 1);
		itemstack.getOrCreateTag().putDouble("rank", 1);
		itemstack.getOrCreateTag().putDouble("rlvln", 10);
		itemstack.getOrCreateTag().putDouble("rlvlnd", 1.3);
		itemstack.getOrCreateTag().putDouble("lifetimetick", 1);
		itemstack.getOrCreateTag().putDouble("lifetimesec", 0);
		itemstack.getOrCreateTag().putDouble("lifetimemin", 0);
		itemstack.getOrCreateTag().putDouble("lifetimehour", 0);
		itemstack.getOrCreateTag().putDouble("lifetimeday", 0);
		itemstack.getOrCreateTag().putDouble("xpph", 2.5);
		itemstack.getOrCreateTag().putDouble("xppk", 10);
		itemstack.getOrCreateTag().putDouble("lvld", 0.6);
		itemstack.getOrCreateTag().putDouble("revives", 0);
		itemstack.getOrCreateTag().putString("name", "");
	}
}
