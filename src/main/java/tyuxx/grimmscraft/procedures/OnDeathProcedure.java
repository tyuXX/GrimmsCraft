package tyuxx.grimmscraft.procedures;

import tyuxx.grimmscraft.network.GrimmscraftModVariables;
import tyuxx.grimmscraft.init.GrimmscraftModItems;

import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.eventbus.api.Event;
import net.minecraftforge.event.entity.living.LivingDeathEvent;

import net.minecraft.world.level.LevelAccessor;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.entity.item.ItemEntity;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.entity.Entity;
import net.minecraft.server.level.ServerLevel;
import net.minecraft.client.Minecraft;

import javax.annotation.Nullable;

@Mod.EventBusSubscriber
public class OnDeathProcedure {
	@SubscribeEvent
	public static void onEntityDeath(LivingDeathEvent event) {
		if (event != null && event.getEntity() != null) {
			execute(event, event.getEntity().level, event.getEntity().getX(), event.getEntity().getY(), event.getEntity().getZ(), event.getEntity(), event.getSource().getEntity());
		}
	}

	public static void execute(LevelAccessor world, double x, double y, double z, Entity entity, Entity sourceentity) {
		execute(null, world, x, y, z, entity, sourceentity);
	}

	private static void execute(@Nullable Event event, LevelAccessor world, double x, double y, double z, Entity entity, Entity sourceentity) {
		if (entity == null || sourceentity == null)
			return;
		GrimmscraftModVariables.MapVariables.get(world).tdeaths = GrimmscraftModVariables.MapVariables.get(world).tdeaths + 1;
		GrimmscraftModVariables.MapVariables.get(world).syncData(world);
		if (world instanceof ServerLevel _level) {
			ItemEntity entityToSpawn = new ItemEntity(_level, x, y, z, new ItemStack(GrimmscraftModItems.SOUL.get()));
			entityToSpawn.setPickUpDelay(0);
			_level.addFreshEntity(entityToSpawn);
		}
		if ((sourceentity instanceof LivingEntity _livEnt ? _livEnt.getMainHandItem() : ItemStack.EMPTY).getItem() == GrimmscraftModItems.CLOCKWORK_SCYTHE_T_1.get()) {
			(sourceentity instanceof LivingEntity _livEnt ? _livEnt.getMainHandItem() : ItemStack.EMPTY).getOrCreateTag().putDouble("kills",
					((sourceentity instanceof LivingEntity _livEnt ? _livEnt.getMainHandItem() : ItemStack.EMPTY).getOrCreateTag().getDouble("kills") + 1));
			(sourceentity instanceof LivingEntity _livEnt ? _livEnt.getMainHandItem() : ItemStack.EMPTY).getOrCreateTag().putDouble("xp",
					((sourceentity instanceof LivingEntity _livEnt ? _livEnt.getMainHandItem() : ItemStack.EMPTY).getOrCreateTag().getDouble("xp")
							+ (sourceentity instanceof LivingEntity _livEnt ? _livEnt.getMainHandItem() : ItemStack.EMPTY).getOrCreateTag().getDouble("xppk")));
		}
		if (entity instanceof Player _playerHasItem ? _playerHasItem.getInventory().contains(new ItemStack(GrimmscraftModItems.CLOCKWORK_SCYTHE_T_1.get())) : false) {
			for (int index0 = 0; index0 < (int) (Math.random() * 10); index0++) {
				if (world instanceof ServerLevel _level) {
					ItemEntity entityToSpawn = new ItemEntity(_level, x, y, z, new ItemStack(GrimmscraftModItems.SOUL.get()));
					entityToSpawn.setPickUpDelay(0);
					_level.addFreshEntity(entityToSpawn);
				}
			}
		}
		if ((entity instanceof LivingEntity _livEnt ? _livEnt.getMainHandItem() : ItemStack.EMPTY).getItem() == GrimmscraftModItems.CLOCKWORK_SCYTHE_T_1.get()) {
			if ((sourceentity instanceof LivingEntity _livEnt ? _livEnt.getMainHandItem() : ItemStack.EMPTY).getOrCreateTag().getDouble("revives") > 0) {
				(sourceentity instanceof LivingEntity _livEnt ? _livEnt.getMainHandItem() : ItemStack.EMPTY).getOrCreateTag().putDouble("revives",
						((sourceentity instanceof LivingEntity _livEnt ? _livEnt.getMainHandItem() : ItemStack.EMPTY).getOrCreateTag().getDouble("revives") - 1));
				if (entity instanceof LivingEntity _entity)
					_entity.setHealth(entity instanceof LivingEntity _livEnt ? _livEnt.getMaxHealth() : -1);
				if (world.isClientSide())
					Minecraft.getInstance().gameRenderer.displayItemActivation((sourceentity instanceof LivingEntity _livEnt ? _livEnt.getMainHandItem() : ItemStack.EMPTY));
				if (event != null && event.isCancelable()) {
					event.setCanceled(true);
				}
			}
		}
	}
}