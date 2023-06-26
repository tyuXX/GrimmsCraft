package tyuxx.grimmscraft.procedures;

import tyuxx.grimmscraft.init.GrimmscraftModBlocks;

import net.minecraft.world.level.LevelAccessor;
import net.minecraft.world.item.ItemStack;
import net.minecraft.core.BlockPos;

public class AzureSaberRightclickedOnBlockProcedure {
	public static void execute(LevelAccessor world, double x, double y, double z, ItemStack itemstack) {
		if (itemstack.getOrCreateTag().getBoolean("lightermode") && !world.getBlockState(BlockPos.containing(x, y + 1, z)).canOcclude()) {
			world.setBlock(BlockPos.containing(x, y + 1, z), GrimmscraftModBlocks.MAGICAL_FIRE.get().defaultBlockState(), 3);
		}
	}
}
