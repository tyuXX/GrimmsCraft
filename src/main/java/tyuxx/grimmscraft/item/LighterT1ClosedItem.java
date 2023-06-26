
package tyuxx.grimmscraft.item;

import tyuxx.grimmscraft.procedures.LighterT1ClosedRightclickedProcedure;

import net.minecraft.world.level.Level;
import net.minecraft.world.item.Rarity;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.Item;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.InteractionResultHolder;
import net.minecraft.world.InteractionHand;

public class LighterT1ClosedItem extends Item {
	public LighterT1ClosedItem() {
		super(new Item.Properties().durability(128).rarity(Rarity.COMMON));
	}

	@Override
	public InteractionResultHolder<ItemStack> use(Level world, Player entity, InteractionHand hand) {
		InteractionResultHolder<ItemStack> ar = super.use(world, entity, hand);
		ItemStack itemstack = ar.getObject();
		double x = entity.getX();
		double y = entity.getY();
		double z = entity.getZ();
		LighterT1ClosedRightclickedProcedure.execute(entity, itemstack);
		return ar;
	}
}
