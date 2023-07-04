package tyuxx.grimmscraft.procedures;

import tyuxx.grimmscraft.network.GrimmscraftModVariables;

import net.minecraft.world.entity.Entity;

public class GetShowCoordsProcedure {
	public static boolean execute(Entity entity) {
		if (entity == null)
			return false;
		return (entity.getCapability(GrimmscraftModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new GrimmscraftModVariables.PlayerVariables())).showcoords;
	}
}
