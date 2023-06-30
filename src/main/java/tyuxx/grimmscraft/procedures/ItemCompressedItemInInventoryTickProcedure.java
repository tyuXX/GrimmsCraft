package tyuxx.grimmscraft.procedures;

import net.minecraftforge.registries.ForgeRegistries;

import net.minecraft.world.item.ItemStack;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.entity.Entity;
import net.minecraft.resources.ResourceLocation;

public class ItemCompressedItemInInventoryTickProcedure {
	public static void execute(Entity entity, ItemStack itemstack) {
		if (entity == null)
			return;
		if (itemstack.getOrCreateTag().getBoolean("autocompress") && (entity instanceof Player _playerHasItem
				? _playerHasItem.getInventory().contains(new ItemStack(ForgeRegistries.ITEMS.getValue(new ResourceLocation(((itemstack.getOrCreateTag().getString("citem"))).toLowerCase(java.util.Locale.ENGLISH)))))
				: false)) {
			if (entity instanceof Player _player) {
				ItemStack _stktoremove = new ItemStack(ForgeRegistries.ITEMS.getValue(new ResourceLocation(((itemstack.getOrCreateTag().getString("citem"))).toLowerCase(java.util.Locale.ENGLISH))));
				_player.getInventory().clearOrCountMatchingItems(p -> _stktoremove.getItem() == p.getItem(), 1, _player.inventoryMenu.getCraftSlots());
			}
			itemstack.getOrCreateTag().putDouble("citemc", (itemstack.getOrCreateTag().getDouble("citemc") + 1));
		}
	}
}
