
package tyuxx.grimmscraft.client.screens;

import tyuxx.grimmscraft.procedures.GetItemXpTextProcedure;
import tyuxx.grimmscraft.procedures.GetItemRankTextProcedure;
import tyuxx.grimmscraft.procedures.GetItemNameTextProcedure;
import tyuxx.grimmscraft.procedures.GetItemLvLTextProcedure;
import tyuxx.grimmscraft.procedures.GetItemKillsTextProcedure;
import tyuxx.grimmscraft.procedures.GetItemComboTextProcedure;
import tyuxx.grimmscraft.procedures.AzureSaberHUDDisplayOverlayIngameProcedure;

import org.checkerframework.checker.units.qual.h;

import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.eventbus.api.EventPriority;
import net.minecraftforge.client.event.RenderGuiEvent;
import net.minecraftforge.api.distmarker.Dist;

import net.minecraft.world.level.Level;
import net.minecraft.world.entity.player.Player;
import net.minecraft.client.Minecraft;

@Mod.EventBusSubscriber({Dist.CLIENT})
public class AzureSaberHUDOverlay {
	@SubscribeEvent(priority = EventPriority.NORMAL)
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
		if (AzureSaberHUDDisplayOverlayIngameProcedure.execute(entity)) {
			Minecraft.getInstance().font.draw(event.getPoseStack(),

					GetItemNameTextProcedure.execute(entity), posX + -213, posY + -120, -1);
			Minecraft.getInstance().font.draw(event.getPoseStack(),

					GetItemKillsTextProcedure.execute(entity), posX + -213, posY + -109, -1);
			Minecraft.getInstance().font.draw(event.getPoseStack(),

					GetItemXpTextProcedure.execute(entity), posX + -213, posY + -99, -1);
			Minecraft.getInstance().font.draw(event.getPoseStack(),

					GetItemLvLTextProcedure.execute(entity), posX + -213, posY + -89, -1);
			Minecraft.getInstance().font.draw(event.getPoseStack(),

					GetItemRankTextProcedure.execute(entity), posX + -213, posY + -79, -1);
			Minecraft.getInstance().font.draw(event.getPoseStack(),

					GetItemComboTextProcedure.execute(entity), posX + -213, posY + -69, -1);
		}
	}
}
