package tyuxx.grimmscraft.procedures;

import tyuxx.grimmscraft.init.GrimmscraftModItems;

import net.minecraft.world.item.ItemStack;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.entity.Entity;

public class AzureSaberHUDDisplayOverlayIngameProcedure {
	public static boolean execute(Entity entity) {
		if (entity == null)
			return false;
		if ((entity instanceof LivingEntity _livEnt ? _livEnt.getMainHandItem() : ItemStack.EMPTY).getItem() == GrimmscraftModItems.AZURE_SABER.get()) {
			return true;
		}
		return false;
	}
}
