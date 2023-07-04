
package tyuxx.grimmscraft.client.screens;

import tyuxx.grimmscraft.procedures.ShowHealtHUDProcedure;
import tyuxx.grimmscraft.procedures.PlayerModelTransformerProcedure;
import tyuxx.grimmscraft.procedures.GetShowPlayerProcedure;
import tyuxx.grimmscraft.procedures.GetShowCoordsProcedure;
import tyuxx.grimmscraft.procedures.GetHealtHUDTextProcedure;
import tyuxx.grimmscraft.procedures.GetCoordsHUDTextProcedure;

import org.checkerframework.checker.units.qual.h;

import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.eventbus.api.EventPriority;
import net.minecraftforge.client.event.RenderGuiEvent;
import net.minecraftforge.api.distmarker.Dist;

import net.minecraft.world.level.Level;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.client.gui.screens.inventory.InventoryScreen;
import net.minecraft.client.Minecraft;

@Mod.EventBusSubscriber({Dist.CLIENT})
public class PlayerHUDOverlay {
	@SubscribeEvent(priority = EventPriority.HIGHEST)
	public static void eventHandler(RenderGuiEvent.Pre event) {
		int w = event.getWindow().getGuiScaledWidth();
		int h = event.getWindow().getGuiScaledHeight();
		int posX = w / 2;
		int posY = h / 2;
		Level world = null;
		double x = 0;
		double y = 0;
		double z = 0;
		Player entity = Minecraft.getInstance().player;
		if (entity != null) {
			world = entity.level;
			x = entity.getX();
			y = entity.getY();
			z = entity.getZ();
		}
		if (true) {
			if (ShowHealtHUDProcedure.execute(entity))
				Minecraft.getInstance().font.draw(event.getPoseStack(),

						GetHealtHUDTextProcedure.execute(entity), posX + -213, posY + -120, -1);
			if (GetShowCoordsProcedure.execute(entity))
				Minecraft.getInstance().font.draw(event.getPoseStack(),

						GetCoordsHUDTextProcedure.execute(x, y, z), posX + -63, posY + -121, -16737844);
			if (PlayerModelTransformerProcedure.execute(entity) instanceof LivingEntity livingEntity) {
				if (GetShowPlayerProcedure.execute(entity))
					InventoryScreen.renderEntityInInventoryFollowsAngle(event.getPoseStack(), posX + -178, posY + 106, 30, 0f, 0, livingEntity);
			}
		}
	}
}
