
/*
 *	MCreator note: This file will be REGENERATED on each build.
 */
package tyuxx.grimmscraft.init;

import tyuxx.grimmscraft.network.OpenStatusWindowKeyMessage;
import tyuxx.grimmscraft.network.OpenStatusToggleWindowKeyMessage;
import tyuxx.grimmscraft.GrimmscraftMod;

import org.lwjgl.glfw.GLFW;

import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.event.TickEvent;
import net.minecraftforge.client.event.RegisterKeyMappingsEvent;
import net.minecraftforge.api.distmarker.Dist;

import net.minecraft.client.Minecraft;
import net.minecraft.client.KeyMapping;

@Mod.EventBusSubscriber(bus = Mod.EventBusSubscriber.Bus.MOD, value = {Dist.CLIENT})
public class GrimmscraftModKeyMappings {
	public static final KeyMapping OPEN_STATUS_WINDOW_KEY = new KeyMapping("key.grimmscraft.open_status_window_key", GLFW.GLFW_KEY_M, "key.categories.gmc") {
		private boolean isDownOld = false;

		@Override
		public void setDown(boolean isDown) {
			super.setDown(isDown);
			if (isDownOld != isDown && isDown) {
				GrimmscraftMod.PACKET_HANDLER.sendToServer(new OpenStatusWindowKeyMessage(0, 0));
				OpenStatusWindowKeyMessage.pressAction(Minecraft.getInstance().player, 0, 0);
			}
			isDownOld = isDown;
		}
	};
	public static final KeyMapping OPEN_STATUS_TOGGLE_WINDOW_KEY = new KeyMapping("key.grimmscraft.open_status_toggle_window_key", GLFW.GLFW_KEY_N, "key.categories.gmc") {
		private boolean isDownOld = false;

		@Override
		public void setDown(boolean isDown) {
			super.setDown(isDown);
			if (isDownOld != isDown && isDown) {
				GrimmscraftMod.PACKET_HANDLER.sendToServer(new OpenStatusToggleWindowKeyMessage(0, 0));
				OpenStatusToggleWindowKeyMessage.pressAction(Minecraft.getInstance().player, 0, 0);
			}
			isDownOld = isDown;
		}
	};

	@SubscribeEvent
	public static void registerKeyMappings(RegisterKeyMappingsEvent event) {
		event.register(OPEN_STATUS_WINDOW_KEY);
		event.register(OPEN_STATUS_TOGGLE_WINDOW_KEY);
	}

	@Mod.EventBusSubscriber({Dist.CLIENT})
	public static class KeyEventListener {
		@SubscribeEvent
		public static void onClientTick(TickEvent.ClientTickEvent event) {
			if (Minecraft.getInstance().screen == null) {
				OPEN_STATUS_WINDOW_KEY.consumeClick();
				OPEN_STATUS_TOGGLE_WINDOW_KEY.consumeClick();
			}
		}
	}
}
