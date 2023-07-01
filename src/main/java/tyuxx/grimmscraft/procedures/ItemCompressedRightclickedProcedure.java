package tyuxx.grimmscraft.procedures;

import net.minecraftforge.registries.ForgeRegistries;

import net.minecraft.world.level.LevelAccessor;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.entity.item.ItemEntity;
import net.minecraft.world.entity.Entity;
import net.minecraft.server.level.ServerLevel;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.network.chat.Component;

public class ItemCompressedRightclickedProcedure {
	public static void execute(LevelAccessor world, double x, double y, double z, Entity entity, ItemStack itemstack) {
		if (entity == null)
			return;
		if (itemstack.getOrCreateTag().getDouble("citemc") > 0) {
			if (entity.isShiftKeyDown()) {
				for (int index0 = 0; index0 < (int) Math.floor(itemstack.getOrCreateTag().getDouble("citemc") / 5); index0++) {
					if (world instanceof ServerLevel _level) {
						ItemEntity entityToSpawn = new ItemEntity(_level, x, y, z, new ItemStack(ForgeRegistries.ITEMS.getValue(new ResourceLocation(((itemstack.getOrCreateTag().getString("citem"))).toLowerCase(java.util.Locale.ENGLISH)))));
						entityToSpawn.setPickUpDelay(0);
						_level.addFreshEntity(entityToSpawn);
					}
				}
				itemstack.getOrCreateTag().putDouble("citemc", (itemstack.getOrCreateTag().getDouble("citemc") - Math.floor(itemstack.getOrCreateTag().getDouble("citemc") / 5)));
			} else {
				if (world instanceof ServerLevel _level) {
					ItemEntity entityToSpawn = new ItemEntity(_level, x, y, z, new ItemStack(ForgeRegistries.ITEMS.getValue(new ResourceLocation(((itemstack.getOrCreateTag().getString("citem"))).toLowerCase(java.util.Locale.ENGLISH)))));
					entityToSpawn.setPickUpDelay(0);
					_level.addFreshEntity(entityToSpawn);
				}
				itemstack.getOrCreateTag().putDouble("citemc", (itemstack.getOrCreateTag().getDouble("citemc") - 1));
			}
		}
		itemstack.setHoverName(Component.literal(("Item:" + itemstack.getOrCreateTag().getString("citem") + "Count:" + new java.text.DecimalFormat("##.##").format(itemstack.getOrCreateTag().getDouble("citemc")))));
	}
}
