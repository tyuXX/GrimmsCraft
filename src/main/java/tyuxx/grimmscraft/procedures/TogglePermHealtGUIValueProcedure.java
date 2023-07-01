package tyuxx.grimmscraft.procedures;

import tyuxx.grimmscraft.network.GrimmscraftModVariables;

import net.minecraft.world.entity.Entity;

public class TogglePermHealtGUIValueProcedure {
	public static String execute(Entity entity) {
		if (entity == null)
			return "";
		return "Permanent Healt ON:" + (entity.getCapability(GrimmscraftModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new GrimmscraftModVariables.PlayerVariables())).chtt;
	}
}
