package net.caballerosupreme.empyrean_ores;

import com.mojang.logging.LogUtils;
import net.caballerosupreme.empyrean_ores.block.ModBlocks;
import net.caballerosupreme.empyrean_ores.item.ModItems;
import net.caballerosupreme.empyrean_ores.world.feature.ModConfiguredFeatures;
import net.caballerosupreme.empyrean_ores.world.feature.ModPlacedFeatures;
import net.minecraftforge.api.distmarker.Dist;
import net.minecraftforge.common.MinecraftForge;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.event.lifecycle.FMLClientSetupEvent;
import net.minecraftforge.fml.event.lifecycle.FMLCommonSetupEvent;
import net.minecraftforge.fml.javafmlmod.FMLJavaModLoadingContext;
import org.slf4j.Logger;

// The value here should match an entry in the META-INF/mods.toml file
@Mod(EmpyreanOres.MOD_ID)
public class EmpyreanOres
{
    public static final String MOD_ID = "empyrean_ores";
    private static final Logger LOGGER = LogUtils.getLogger();

    public EmpyreanOres()
    {
        //Test world seed: 5646122760683543065
        IEventBus modEventBus = FMLJavaModLoadingContext.get().getModEventBus();

        ModItems.register(modEventBus); //Call the items register in the main class

        ModBlocks.register(modEventBus); //Call the modded blocks register in the main class (main program)

        ModConfiguredFeatures.register(modEventBus); //Call the world ore generation class in the main program (here)
        ModPlacedFeatures.register(modEventBus); //Call the ore placement helper class

        modEventBus.addListener(this::commonSetup);

        MinecraftForge.EVENT_BUS.register(this);
    }

    private void commonSetup(final FMLCommonSetupEvent event)
    {

    }

    // You can use EventBusSubscriber to automatically register all static methods in the class annotated with @SubscribeEvent
    @Mod.EventBusSubscriber(modid = MOD_ID, bus = Mod.EventBusSubscriber.Bus.MOD, value = Dist.CLIENT)
    public static class ClientModEvents
    {
        @SubscribeEvent
        public static void onClientSetup(FMLClientSetupEvent event)
        {

        }
    }
}
