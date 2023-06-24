package tyuxx.grimmscraft.procedures;

import tyuxx.grimmscraft.network.GrimmscraftModVariables;

import net.minecraft.world.level.LevelAccessor;
import net.minecraft.world.entity.Entity;

public class GeigerCounterHudValueProcedure {
	public static String execute(LevelAccessor world, Entity entity) {
		if (entity == null)
			return "";
		return "Radiation:" + new java.text.DecimalFormat("##.##").format((entity.getCapability(GrimmscraftModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new GrimmscraftModVariables.PlayerVariables())).radiation) + "/"
				+ new java.text.DecimalFormat("##").format(GrimmscraftModVariables.MapVariables.get(world).maxradiation);
	}
}
