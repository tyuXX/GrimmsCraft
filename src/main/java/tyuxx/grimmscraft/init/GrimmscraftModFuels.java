
/*
 *	MCreator note: This file will be REGENERATED on each build.
 */
package tyuxx.grimmscraft.init;

import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.event.furnace.FurnaceFuelBurnTimeEvent;

import net.minecraft.world.item.ItemStack;

@Mod.EventBusSubscriber
public class GrimmscraftModFuels {
	@SubscribeEvent
	public static void furnaceFuelBurnTimeEvent(FurnaceFuelBurnTimeEvent event) {
		ItemStack itemstack = event.getItemStack();
		if (itemstack.getItem() == GrimmscraftModItems.TIER_1_COAL.get())
			event.setBurnTime(3200);
		else if (itemstack.getItem() == GrimmscraftModItems.TIER_2_COAL.get())
			event.setBurnTime(6400);
		else if (itemstack.getItem() == GrimmscraftModItems.TIER_3_COAL.get())
			event.setBurnTime(12800);
	}
}
