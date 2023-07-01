package tyuxx.grimmscraft.procedures;

import tyuxx.grimmscraft.network.GrimmscraftModVariables;

import net.minecraft.world.entity.Entity;

public class PermHealtGUIVAlueProcedure {
	public static String execute(Entity entity) {
		if (entity == null)
			return "";
		return "Perm Healt:" + new java.text.DecimalFormat("##").format((entity.getCapability(GrimmscraftModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new GrimmscraftModVariables.PlayerVariables())).maxhealt);
	}
}
