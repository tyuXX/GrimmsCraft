
package tyuxx.grimmscraft.item;

import tyuxx.grimmscraft.procedures.LighterT3OpenRightClickedProcedure;

import net.minecraft.world.level.Level;
import net.minecraft.world.item.Rarity;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.Item;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.InteractionResultHolder;
import net.minecraft.world.InteractionHand;

public class LighterT3OpenItem extends Item {
	public LighterT3OpenItem() {
		super(new Item.Properties().durability(512).rarity(Rarity.COMMON));
	}

	@Override
	public InteractionResultHolder<ItemStack> use(Level world, Player entity, InteractionHand hand) {
		InteractionResultHolder<ItemStack> ar = super.use(world, entity, hand);
		ItemStack itemstack = ar.getObject();
		double x = entity.getX();
		double y = entity.getY();
		double z = entity.getZ();
		LighterT3OpenRightClickedProcedure.execute(entity, itemstack);
		return ar;
	}
}
