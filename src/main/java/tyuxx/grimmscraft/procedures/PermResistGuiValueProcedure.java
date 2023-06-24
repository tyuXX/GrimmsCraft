package tyuxx.grimmscraft.procedures;

import tyuxx.grimmscraft.network.GrimmscraftModVariables;

import net.minecraft.world.entity.Entity;

public class PermResistGuiValueProcedure {
	public static String execute(Entity entity) {
		if (entity == null)
			return "";
		return "Perm Resistance LvL:" + new java.text.DecimalFormat("##").format((entity.getCapability(GrimmscraftModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new GrimmscraftModVariables.PlayerVariables())).permreistance);
	}
}
