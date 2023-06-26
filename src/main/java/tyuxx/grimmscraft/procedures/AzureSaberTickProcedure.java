package tyuxx.grimmscraft.procedures;

import net.minecraft.world.item.ItemStack;

public class AzureSaberTickProcedure {
	public static void execute(ItemStack itemstack) {
		itemstack.getOrCreateTag().putDouble("lifetimetick", (itemstack.getOrCreateTag().getDouble("lifetimetick") + 1));
		if (itemstack.getOrCreateTag().getDouble("combotime") > 0) {
			itemstack.getOrCreateTag().putDouble("combotime", (itemstack.getOrCreateTag().getDouble("combotime") - 1));
		} else {
			itemstack.getOrCreateTag().putDouble("combo", 1);
		}
		if (itemstack.getOrCreateTag().getDouble("lifetimetick") >= 20) {
			itemstack.getOrCreateTag().putDouble("lifetimetick", (itemstack.getOrCreateTag().getDouble("lifetimetick") - 20));
			itemstack.getOrCreateTag().putDouble("lifetimesec", (itemstack.getOrCreateTag().getDouble("lifetimesec") + 1));
		}
		if (itemstack.getOrCreateTag().getDouble("lifetimesec") >= 60) {
			itemstack.getOrCreateTag().putDouble("lifetimesec", (itemstack.getOrCreateTag().getDouble("lifetimesec") - 60));
			itemstack.getOrCreateTag().putDouble("lifetimemin", (itemstack.getOrCreateTag().getDouble("lifetimemin") + 1));
		}
		if (itemstack.getOrCreateTag().getDouble("lifetimemin") >= 60) {
			itemstack.getOrCreateTag().putDouble("lifetimemin", (itemstack.getOrCreateTag().getDouble("lifetimemin") - 60));
			itemstack.getOrCreateTag().putDouble("lifetimehour", (itemstack.getOrCreateTag().getDouble("lifetimehour") + 1));
		}
		if (itemstack.getOrCreateTag().getDouble("lifetimehour") >= 24) {
			itemstack.getOrCreateTag().putDouble("lifetimehour", (itemstack.getOrCreateTag().getDouble("lifetimehour") - 24));
			itemstack.getOrCreateTag().putDouble("lifetimeday", (itemstack.getOrCreateTag().getDouble("lifetimeday") + 1));
		}
	}
}
