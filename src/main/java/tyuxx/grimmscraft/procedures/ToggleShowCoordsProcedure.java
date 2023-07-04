package tyuxx.grimmscraft.procedures;

import tyuxx.grimmscraft.network.GrimmscraftModVariables;

import net.minecraft.world.entity.Entity;

public class ToggleShowCoordsProcedure {
	public static void execute(Entity entity) {
		if (entity == null)
			return;
		{
			boolean _setval = !(entity.getCapability(GrimmscraftModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new GrimmscraftModVariables.PlayerVariables())).showcoords;
			entity.getCapability(GrimmscraftModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
				capability.showcoords = _setval;
				capability.syncPlayerVariables(entity);
			});
		}
	}
}
