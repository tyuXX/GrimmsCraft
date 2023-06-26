package tyuxx.grimmscraft.procedures;

import net.minecraft.world.item.ItemStack;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.entity.Entity;

public class GetItemRevivesTextProcedure {
	public static String execute(Entity entity) {
		if (entity == null)
			return "";
		return "Revives" + (new java.text.DecimalFormat("##").format((entity instanceof LivingEntity _livEnt ? _livEnt.getMainHandItem() : ItemStack.EMPTY).getOrCreateTag().getDouble("revives")));
	}
}
