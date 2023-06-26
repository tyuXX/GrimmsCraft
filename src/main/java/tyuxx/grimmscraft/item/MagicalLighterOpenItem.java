
package tyuxx.grimmscraft.item;

import tyuxx.grimmscraft.procedures.MagicalLighterOpenRightClickedProcedure;

import net.minecraft.world.level.Level;
import net.minecraft.world.item.Rarity;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.Item;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.InteractionResultHolder;
import net.minecraft.world.InteractionHand;

public class MagicalLighterOpenItem extends Item {
	public MagicalLighterOpenItem() {
		super(new Item.Properties().durability(2048).rarity(Rarity.COMMON));
	}

	@Override
	public InteractionResultHolder<ItemStack> use(Level world, Player entity, InteractionHand hand) {
		InteractionResultHolder<ItemStack> ar = super.use(world, entity, hand);
		ItemStack itemstack = ar.getObject();
		double x = entity.getX();
		double y = entity.getY();
		double z = entity.getZ();
		MagicalLighterOpenRightClickedProcedure.execute(entity, itemstack);
		return ar;
	}
}
