package tyuxx.grimmscraft.procedures;

import tyuxx.grimmscraft.network.GrimmscraftModVariables;

import net.minecraft.world.entity.Entity;

public class CheckForLevelUpProcedure {
	public static void execute(Entity entity) {
		if (entity == null)
			return;
		while ((entity.getCapability(GrimmscraftModVariables.PLAYER_VARIABLES_CAPABILITY, null)
				.orElse(new GrimmscraftModVariables.PlayerVariables())).lxp >= (entity.getCapability(GrimmscraftModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new GrimmscraftModVariables.PlayerVariables())).level * 25) {
			{
				double _setval = (entity.getCapability(GrimmscraftModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new GrimmscraftModVariables.PlayerVariables())).lxp
						- (entity.getCapability(GrimmscraftModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new GrimmscraftModVariables.PlayerVariables())).level * 10;
				entity.getCapability(GrimmscraftModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
					capability.lxp = _setval;
					capability.syncPlayerVariables(entity);
				});
			}
			{
				double _setval = (entity.getCapability(GrimmscraftModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new GrimmscraftModVariables.PlayerVariables())).statps
						+ (entity.getCapability(GrimmscraftModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new GrimmscraftModVariables.PlayerVariables())).lvlupstp;
				entity.getCapability(GrimmscraftModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
					capability.statps = _setval;
					capability.syncPlayerVariables(entity);
				});
			}
			{
				double _setval = (entity.getCapability(GrimmscraftModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new GrimmscraftModVariables.PlayerVariables())).level + 1;
				entity.getCapability(GrimmscraftModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
					capability.level = _setval;
					capability.syncPlayerVariables(entity);
				});
			}
		}
	}
}
