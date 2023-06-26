package tyuxx.grimmscraft.procedures;

import net.minecraft.world.item.ItemStack;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.entity.Entity;

public class GetItemNameTextProcedure {
	public static String execute(Entity entity) {
		if (entity == null)
			return "";
		return "Item:" + ((entity instanceof LivingEntity _livEnt ? _livEnt.getMainHandItem() : ItemStack.EMPTY).getDisplayName().getString());
	}
}
