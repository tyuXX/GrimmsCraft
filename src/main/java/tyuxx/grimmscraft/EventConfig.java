/**
package tyuxx.grimmscraft;

import net.minecraftforge.fml.event.lifecycle.FMLCommonSetupEvent;
import net.minecraftforge.fml.event.lifecycle.FMLClientSetupEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.event.server.ServerStartingEvent;
import net.minecraftforge.api.distmarker.OnlyIn;
import net.minecraftforge.api.distmarker.Dist;
import net.minecraftforge.registries.RegisterEvent;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.registries.ForgeRegistries.Keys;
import net.minecraftforge.registries.ObjectHolder;
import net.minecraft.world.item.Item;

import java.util.ArrayList;
import java.util.List;


class GenItem extends Item {
    public GenItem(String name) {
        super(new Item.Properties());
        
    }
}

@Mod.EventBusSubscriber(bus = Mod.EventBusSubscriber.Bus.MOD)
public class EventConfig {
	private static final List<String> GenItems = new ArrayList<>();
	static {
		GenItems.add("a");
		GenItems.add("b");
	}
	public EventConfig() {
	
	}
	@SubscribeEvent
	public void register(RegisterEvent event) {
 	 event.register(ForgeRegistries.Keys.,
 	   helper -> {
 	     for (int i = 0; i < GenItems.length; i++) {
 	     	String str = GenItems.get(i);
 	     	helper.register();
 	     }
 	   }
 	 );
	}

	@SubscribeEvent
	public static void init(FMLCommonSetupEvent event) {
		new EventConfig();
	}

	@Mod.EventBusSubscriber
	private static class ForgeBusEvents {
		@SubscribeEvent
		public static void serverLoad(ServerStartingEvent event) {
		
		}

		@OnlyIn(Dist.CLIENT)
		@SubscribeEvent
		public static void clientLoad(FMLClientSetupEvent event) {
		
		}
	}
}
*/