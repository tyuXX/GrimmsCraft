package tyuxx.grimmscraft.procedures;

import tyuxx.grimmscraft.network.GrimmscraftModVariables;

import net.minecraft.world.entity.Entity;

public class PermHealtUpgradeProcedure {
	public static void execute(Entity entity) {
		if (entity == null)
			return;
		if ((entity.getCapability(GrimmscraftModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new GrimmscraftModVariables.PlayerVariables())).statps >= 15) {
			{
				double _setval = (entity.getCapability(GrimmscraftModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new GrimmscraftModVariables.PlayerVariables())).statps - 15;
				entity.getCapability(GrimmscraftModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
					capability.statps = _setval;
					capability.syncPlayerVariables(entity);
				});
			}
			{
				double _setval = (entity.getCapability(GrimmscraftModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new GrimmscraftModVariables.PlayerVariables())).maxhealt + 1;
				entity.getCapability(GrimmscraftModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
					capability.maxhealt = _setval;
					capability.syncPlayerVariables(entity);
				});
			}
		}
		if (!(entity.getCapability(GrimmscraftModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new GrimmscraftModVariables.PlayerVariables())).cht) {
			{
				boolean _setval = true;
				entity.getCapability(GrimmscraftModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
					capability.cht = _setval;
					capability.syncPlayerVariables(entity);
				});
			}
		}
	}
}
