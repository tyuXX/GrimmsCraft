package tyuxx.grimmscraft.procedures;

import tyuxx.grimmscraft.network.GrimmscraftModVariables;

import net.minecraft.world.entity.Entity;

public class GetShowPlayerTextProcedure {
	public static String execute(Entity entity) {
		if (entity == null)
			return "";
		return "Showing Player:" + (entity.getCapability(GrimmscraftModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new GrimmscraftModVariables.PlayerVariables())).showplayer;
	}
}
