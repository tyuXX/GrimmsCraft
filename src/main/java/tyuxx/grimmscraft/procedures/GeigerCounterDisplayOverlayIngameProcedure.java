package tyuxx.grimmscraft.procedures;

import tyuxx.grimmscraft.init.GrimmscraftModItems;

import net.minecraft.world.item.ItemStack;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.entity.Entity;

public class GeigerCounterDisplayOverlayIngameProcedure {
	public static boolean execute(Entity entity) {
		if (entity == null)
			return false;
		return entity instanceof Player _playerHasItem ? _playerHasItem.getInventory().contains(new ItemStack(GrimmscraftModItems.GEIGER_COUNTER.get())) : false;
	}
}
