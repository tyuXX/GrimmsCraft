package tyuxx.grimmscraft.procedures;

import net.minecraft.world.item.ItemStack;

public class AzureSaberInitProcedure {
	public static void execute(ItemStack itemstack) {
		itemstack.getOrCreateTag().putDouble("kills", 0);
		itemstack.getOrCreateTag().putDouble("xp", 0);
		itemstack.getOrCreateTag().putDouble("xpn", 25);
		itemstack.getOrCreateTag().putDouble("xpnd", 1.05);
		itemstack.getOrCreateTag().putDouble("lvl", 1);
		itemstack.getOrCreateTag().putDouble("rank", 1);
		itemstack.getOrCreateTag().putDouble("rlvln", 10);
		itemstack.getOrCreateTag().putDouble("rlvlnd", 1.15);
		itemstack.getOrCreateTag().putDouble("lifetimetick", 1);
		itemstack.getOrCreateTag().putDouble("lifetimesec", 0);
		itemstack.getOrCreateTag().putDouble("lifetimemin", 0);
		itemstack.getOrCreateTag().putDouble("lifetimehour", 0);
		itemstack.getOrCreateTag().putDouble("lifetimeday", 0);
		itemstack.getOrCreateTag().putDouble("xpph", 4);
		itemstack.getOrCreateTag().putDouble("xppk", 15);
		itemstack.getOrCreateTag().putDouble("lvld", 1);
		itemstack.getOrCreateTag().putDouble("revives", 0);
		itemstack.getOrCreateTag().putDouble("combo", 1);
		itemstack.getOrCreateTag().putDouble("combotime", 0);
		itemstack.getOrCreateTag().putBoolean("lightermode", false);
		itemstack.getOrCreateTag().putString("name", "");
	}
}
