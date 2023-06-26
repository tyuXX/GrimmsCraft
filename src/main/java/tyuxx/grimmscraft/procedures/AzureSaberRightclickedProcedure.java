package tyuxx.grimmscraft.procedures;

import net.minecraft.world.item.ItemStack;
import net.minecraft.world.entity.Entity;

public class AzureSaberRightclickedProcedure {
	public static void execute(Entity entity, ItemStack itemstack) {
		if (entity == null)
			return;
		if (entity.isShiftKeyDown()) {
			if (itemstack.getOrCreateTag().getBoolean("lightermode")) {
				itemstack.getOrCreateTag().putBoolean("lightermode", false);
			} else {
				itemstack.getOrCreateTag().putBoolean("lightermode", true);
			}
		}
	}
}
