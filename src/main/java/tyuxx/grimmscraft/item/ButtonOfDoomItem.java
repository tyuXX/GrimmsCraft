
package tyuxx.grimmscraft.item;

import tyuxx.grimmscraft.procedures.ButtonOfDoomRightclickedProcedure;

import net.minecraft.world.level.Level;
import net.minecraft.world.item.Rarity;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.Item;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.InteractionResultHolder;
import net.minecraft.world.InteractionHand;

public class ButtonOfDoomItem extends Item {
	public ButtonOfDoomItem() {
		super(new Item.Properties().durability(3).rarity(Rarity.EPIC));
	}

	@Override
	public InteractionResultHolder<ItemStack> use(Level world, Player entity, InteractionHand hand) {
		InteractionResultHolder<ItemStack> ar = super.use(world, entity, hand);
		ItemStack itemstack = ar.getObject();
		double x = entity.getX();
		double y = entity.getY();
		double z = entity.getZ();
		ButtonOfDoomRightclickedProcedure.execute(world, x, y, z, itemstack);
		return ar;
	}
}
