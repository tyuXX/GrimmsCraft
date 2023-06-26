
package tyuxx.grimmscraft.item;

import tyuxx.grimmscraft.procedures.LighterT3ClosedRightClickedProcedure;

import net.minecraft.world.level.Level;
import net.minecraft.world.item.Rarity;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.Item;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.InteractionResultHolder;
import net.minecraft.world.InteractionHand;

public class LighterT3ClosedItem extends Item {
	public LighterT3ClosedItem() {
		super(new Item.Properties().durability(512).rarity(Rarity.COMMON));
	}

	@Override
	public InteractionResultHolder<ItemStack> use(Level world, Player entity, InteractionHand hand) {
		InteractionResultHolder<ItemStack> ar = super.use(world, entity, hand);
		ItemStack itemstack = ar.getObject();
		double x = entity.getX();
		double y = entity.getY();
		double z = entity.getZ();
		LighterT3ClosedRightClickedProcedure.execute(entity, itemstack);
		return ar;
	}
}
