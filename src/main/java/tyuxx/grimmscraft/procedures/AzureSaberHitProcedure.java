package tyuxx.grimmscraft.procedures;

import tyuxx.grimmscraft.init.GrimmscraftModEnchantments;

import net.minecraft.world.item.ItemStack;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.entity.Entity;
import net.minecraft.world.damagesource.DamageTypes;
import net.minecraft.world.damagesource.DamageSource;
import net.minecraft.network.chat.Component;
import net.minecraft.core.registries.Registries;

public class AzureSaberHitProcedure {
	public static void execute(Entity entity, ItemStack itemstack) {
		if (entity == null)
			return;
		itemstack.getOrCreateTag().putDouble("xp", (itemstack.getOrCreateTag().getDouble("xp") + itemstack.getOrCreateTag().getDouble("xpph") * (itemstack.getEnchantmentLevel(GrimmscraftModEnchantments.MORE_XP_T_1.get()) + 1)
				* (itemstack.getEnchantmentLevel(GrimmscraftModEnchantments.MORE_XP_T_2.get()) + 1) * 2 * (itemstack.getEnchantmentLevel(GrimmscraftModEnchantments.MORE_XP_T_3.get()) + 1) * 3));
		itemstack.getOrCreateTag().putDouble("combotime", 40);
		itemstack.getOrCreateTag().putDouble("combo", (itemstack.getOrCreateTag().getDouble("combo") + 1));
		while (itemstack.getOrCreateTag().getDouble("xp") >= itemstack.getOrCreateTag().getDouble("xpn")) {
			itemstack.getOrCreateTag().putDouble("xp", (itemstack.getOrCreateTag().getDouble("xp") - itemstack.getOrCreateTag().getDouble("xpn")));
			itemstack.getOrCreateTag().putDouble("xpn", (itemstack.getOrCreateTag().getDouble("xpn") * itemstack.getOrCreateTag().getDouble("xpnd")));
			itemstack.getOrCreateTag().putDouble("lvl", (itemstack.getOrCreateTag().getDouble("lvl") + 1));
		}
		while (itemstack.getOrCreateTag().getDouble("lvl") >= itemstack.getOrCreateTag().getDouble("rlvln")) {
			itemstack.getOrCreateTag().putDouble("lvl", (itemstack.getOrCreateTag().getDouble("lvl") - itemstack.getOrCreateTag().getDouble("rlvln")));
			itemstack.getOrCreateTag().putDouble("rlvln", (itemstack.getOrCreateTag().getDouble("rlvln") * itemstack.getOrCreateTag().getDouble("rlvlnd")));
			itemstack.getOrCreateTag().putDouble("rank", (itemstack.getOrCreateTag().getDouble("rank") + 1));
			itemstack.getOrCreateTag().putDouble("revives", (itemstack.getOrCreateTag().getDouble("revives") + 1));
			itemstack.getOrCreateTag().putDouble("xpn", 25);
		}
		if (entity instanceof LivingEntity _entity)
			_entity.hurt(new DamageSource(_entity.level.registryAccess().registryOrThrow(Registries.DAMAGE_TYPE).getHolderOrThrow(DamageTypes.GENERIC)) {
				@Override
				public Component getLocalizedDeathMessage(LivingEntity _msgEntity) {
					return Component.translatable("death.attack." + "clockwork");
				}
			}, (float) (itemstack.getOrCreateTag().getDouble("lvl") * itemstack.getOrCreateTag().getDouble("rank") * itemstack.getOrCreateTag().getDouble("lvld") * itemstack.getOrCreateTag().getDouble("combo")));
		itemstack.setHoverName(Component.literal((("\u00A76\"" + "" + itemstack.getOrCreateTag().getString("name") + "\"") + "/\u00A74LvL" + new java.text.DecimalFormat("##").format(itemstack.getOrCreateTag().getDouble("lvl")) + "\u00A76/\u00A74Rank"
				+ new java.text.DecimalFormat("##").format(itemstack.getOrCreateTag().getDouble("rank")) + "\u00A7r")));
		if (entity instanceof Player _player && !_player.level.isClientSide())
			_player.displayClientMessage(Component.literal(("\u00A72Combo:\u00A76\u00A7l" + new java.text.DecimalFormat("##").format(itemstack.getOrCreateTag().getDouble("combo")))), true);
	}
}
