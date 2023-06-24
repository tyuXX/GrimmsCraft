package tyuxx.grimmscraft.procedures;

import tyuxx.grimmscraft.network.GrimmscraftModVariables;

import net.minecraft.world.level.LevelAccessor;
import net.minecraft.world.item.ItemStack;
import net.minecraft.network.chat.Component;

public class KatanaT4ItemIsCraftedsmeltedProcedure {
	public static void execute(LevelAccessor world, ItemStack itemstack) {
		itemstack.getOrCreateTag().putDouble("xpn", (GrimmscraftModVariables.MapVariables.get(world).katanadefxpn / 4));
		itemstack.setHoverName(Component.literal("Katana LvL - 0"));
	}
}
