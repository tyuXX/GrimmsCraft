package tyuxx.grimmscraft.procedures;

import net.minecraft.util.RandomSource;
import net.minecraft.util.Mth;

public class GetRandomNameProcedure {
	public static String execute() {
		double rng = 0;
		rng = Mth.nextInt(RandomSource.create(), 1, 15);
		if (rng == 1) {
			return "a";
		}
		return "";
	}
}
