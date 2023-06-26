package tyuxx.grimmscraft.procedures;

import net.minecraft.world.item.ItemStack;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.entity.Entity;

public class GetItemLvLTextProcedure {
	public static String execute(Entity entity) {
		if (entity == null)
			return "";
		return "LvL:" + (new java.text.DecimalFormat("##").format((entity instanceof LivingEntity _livEnt ? _livEnt.getMainHandItem() : ItemStack.EMPTY).getOrCreateTag().getDouble("lvl"))) + "/"
				+ (new java.text.DecimalFormat("##").format((entity instanceof LivingEntity _livEnt ? _livEnt.getMainHandItem() : ItemStack.EMPTY).getOrCreateTag().getDouble("rlvln")));
	}
}
