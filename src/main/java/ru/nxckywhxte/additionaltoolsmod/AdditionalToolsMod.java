package ru.nxckywhxte.additionaltoolsmod;

import com.mojang.logging.LogUtils;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.CreativeModeTabs;
import net.minecraftforge.api.distmarker.Dist;
import net.minecraftforge.common.MinecraftForge;
import net.minecraftforge.event.BuildCreativeModeTabContentsEvent;
import net.minecraftforge.event.server.ServerStartingEvent;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.ModLoadingContext;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.config.ModConfig;
import net.minecraftforge.fml.event.lifecycle.FMLClientSetupEvent;
import net.minecraftforge.fml.event.lifecycle.FMLCommonSetupEvent;
import net.minecraftforge.fml.javafmlmod.FMLJavaModLoadingContext;
import org.slf4j.Logger;
import ru.nxckywhxte.additionaltoolsmod.common.ATMCreativeTab;
import ru.nxckywhxte.additionaltoolsmod.common.items.ATMItems;

@Mod(AdditionalToolsMod.MOD_ID)
public class AdditionalToolsMod {
    public static final String MOD_ID = "additionaltoolsmod";
    private static final Logger LOGGER = LogUtils.getLogger();
    public AdditionalToolsMod() {
        IEventBus modEventBus = FMLJavaModLoadingContext.get().getModEventBus();
        ATMItems.register(modEventBus);
        ATMCreativeTab.register(modEventBus);
        modEventBus.addListener(this::commonSetup);
        MinecraftForge.EVENT_BUS.register(this);
        modEventBus.addListener(this::addCreative);
        ModLoadingContext.get().registerConfig(ModConfig.Type.COMMON, Config.SPEC);
    }
    private void commonSetup(final FMLCommonSetupEvent event) {}
    private void addCreative(BuildCreativeModeTabContentsEvent event){

    }
    @SubscribeEvent
    public void onServerStarting(ServerStartingEvent event) {}
    @Mod.EventBusSubscriber(
            modid = MOD_ID,
            bus = Mod.EventBusSubscriber.Bus.MOD,
            value = Dist.CLIENT)
    public static class ClientModEvents {
        @SubscribeEvent
        public static void onClientSetup(FMLClientSetupEvent event){}
    }
}
