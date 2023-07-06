
package tyuxx.grimmscraft.network;

import tyuxx.grimmscraft.world.inventory.StatsGuiMenu;
import tyuxx.grimmscraft.procedures.PermStrengthUpgradeProcedure;
import tyuxx.grimmscraft.procedures.PermResistUpgradeProcedure;
import tyuxx.grimmscraft.procedures.PermRegenUpgradeProcedure;
import tyuxx.grimmscraft.procedures.PermHealtUpgradeProcedure;
import tyuxx.grimmscraft.procedures.LvLUpBoostUpgradeProcedure;
import tyuxx.grimmscraft.GrimmscraftMod;

import net.minecraftforge.network.NetworkEvent;
import net.minecraftforge.fml.event.lifecycle.FMLCommonSetupEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.eventbus.api.SubscribeEvent;

import net.minecraft.world.level.Level;
import net.minecraft.world.entity.player.Player;
import net.minecraft.network.FriendlyByteBuf;
import net.minecraft.core.BlockPos;

import java.util.function.Supplier;
import java.util.HashMap;

@Mod.EventBusSubscriber(bus = Mod.EventBusSubscriber.Bus.MOD)
public class StatsGuiButtonMessage {
	private final int buttonID, x, y, z;

	public StatsGuiButtonMessage(FriendlyByteBuf buffer) {
		this.buttonID = buffer.readInt();
		this.x = buffer.readInt();
		this.y = buffer.readInt();
		this.z = buffer.readInt();
	}

	public StatsGuiButtonMessage(int buttonID, int x, int y, int z) {
		this.buttonID = buttonID;
		this.x = x;
		this.y = y;
		this.z = z;
	}

	public static void buffer(StatsGuiButtonMessage message, FriendlyByteBuf buffer) {
		buffer.writeInt(message.buttonID);
		buffer.writeInt(message.x);
		buffer.writeInt(message.y);
		buffer.writeInt(message.z);
	}

	public static void handler(StatsGuiButtonMessage message, Supplier<NetworkEvent.Context> contextSupplier) {
		NetworkEvent.Context context = contextSupplier.get();
		context.enqueueWork(() -> {
			Player entity = context.getSender();
			int buttonID = message.buttonID;
			int x = message.x;
			int y = message.y;
			int z = message.z;
			handleButtonAction(entity, buttonID, x, y, z);
		});
		context.setPacketHandled(true);
	}

	public static void handleButtonAction(Player entity, int buttonID, int x, int y, int z) {
		Level world = entity.level;
		HashMap guistate = StatsGuiMenu.guistate;
		// security measure to prevent arbitrary chunk generation
		if (!world.hasChunkAt(new BlockPos(x, y, z)))
			return;
		if (buttonID == 0) {

			PermRegenUpgradeProcedure.execute(entity);
		}
		if (buttonID == 1) {

			PermResistUpgradeProcedure.execute(entity);
		}
		if (buttonID == 2) {

			PermStrengthUpgradeProcedure.execute(entity);
		}
		if (buttonID == 3) {

			PermHealtUpgradeProcedure.execute(entity);
		}
		if (buttonID == 4) {

			LvLUpBoostUpgradeProcedure.execute(entity);
		}
	}

	@SubscribeEvent
	public static void registerMessage(FMLCommonSetupEvent event) {
		GrimmscraftMod.addNetworkMessage(StatsGuiButtonMessage.class, StatsGuiButtonMessage::buffer, StatsGuiButtonMessage::new, StatsGuiButtonMessage::handler);
	}
}
