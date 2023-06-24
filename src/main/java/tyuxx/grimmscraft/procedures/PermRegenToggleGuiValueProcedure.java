package tyuxx.grimmscraft.procedures;

import tyuxx.grimmscraft.network.GrimmscraftModVariables;

import net.minecraft.world.entity.Entity;

public class PermRegenToggleGuiValueProcedure {
	public static String execute(Entity entity) {
		if (entity == null)
			return "";
		return "Permanent Regen ON:" + (entity.getCapability(GrimmscraftModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new GrimmscraftModVariables.PlayerVariables())).permregentoggle;
	}
}
