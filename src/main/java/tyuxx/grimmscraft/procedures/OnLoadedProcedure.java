package tyuxx.grimmscraft.procedures;

import tyuxx.grimmscraft.network.GrimmscraftModVariables;
import tyuxx.grimmscraft.GrimmscraftMod;

import net.minecraftforge.fml.event.lifecycle.FMLCommonSetupEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.ModList;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.eventbus.api.Event;

import javax.annotation.Nullable;

@Mod.EventBusSubscriber(bus = Mod.EventBusSubscriber.Bus.MOD)
public class OnLoadedProcedure {
	@SubscribeEvent
	public static void init(FMLCommonSetupEvent event) {
		execute();
	}

	public static void execute() {
		execute(null);
	}

	private static void execute(@Nullable Event event) {
		GrimmscraftMod.LOGGER.info("G.M.C. Loaded.");
		if (ModList.get().isLoaded("asdlab")) {
			GrimmscraftModVariables.addonsloaded = GrimmscraftModVariables.addonsloaded + "ASDLab/";
			GrimmscraftMod.LOGGER.info("G.M.C. Addon \"ASDLab\" Loaded.");
		}
	}
}
