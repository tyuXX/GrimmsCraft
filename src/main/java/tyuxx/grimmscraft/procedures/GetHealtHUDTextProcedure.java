package tyuxx.grimmscraft.procedures;

import tyuxx.grimmscraft.network.GrimmscraftModVariables;

import net.minecraft.world.entity.Entity;

public class GetHealtHUDTextProcedure {
	public static String execute(Entity entity) {
		if (entity == null)
			return "";
		return "\u00A7l\u00A75Healt:\u00A7r\u00A74" + new java.text.DecimalFormat("##").format((entity.getCapability(GrimmscraftModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new GrimmscraftModVariables.PlayerVariables())).healt)
				+ "\u00A7l\u00A75/\u00A7r\u00A74" + new java.text.DecimalFormat("##").format((entity.getCapability(GrimmscraftModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new GrimmscraftModVariables.PlayerVariables())).maxhealt);
	}
}
