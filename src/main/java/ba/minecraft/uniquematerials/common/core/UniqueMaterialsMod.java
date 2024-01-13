package ba.minecraft.uniquematerials.common.core;

import com.mojang.logging.LogUtils;

import ba.minecraft.uniquematerials.common.item.OreItems;
import net.minecraftforge.common.MinecraftForge;
import net.minecraftforge.event.server.ServerStartedEvent;
import net.minecraftforge.event.server.ServerStartingEvent;
import net.minecraftforge.event.server.ServerStoppedEvent;
import net.minecraftforge.event.server.ServerStoppingEvent;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.ModLoadingContext;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.config.ModConfig;
import net.minecraftforge.fml.event.lifecycle.FMLCommonSetupEvent;
import net.minecraftforge.fml.javafmlmod.FMLJavaModLoadingContext;
import org.slf4j.Logger;

// The value here should match an entry in the META-INF/mods.toml file
@Mod(UniqueMaterialsMod.MODID)
public class UniqueMaterialsMod
{
    public static final String MODID = "uniquematerials";
    
    // Directly reference a slf4j logger
    private static final Logger LOGGER = LogUtils.getLogger();
    
    public UniqueMaterialsMod()
    {
        IEventBus modEventBus = FMLJavaModLoadingContext.get().getModEventBus();

        // Registration of mod provided items.
        OreItems.REGISTRY.register(modEventBus);

        // Register the commonSetup method for modloading
        modEventBus.addListener(this::commonSetup);

        // Register ourselves for server and other game events we are interested in
        MinecraftForge.EVENT_BUS.register(this);

        ModLoadingContext.get().registerConfig(ModConfig.Type.SERVER, UniqueMaterialsModConfig.SPEC, MODID + "-server.toml");
    }

    private void commonSetup(final FMLCommonSetupEvent event)
    {
    }

    @SubscribeEvent
    public void onServerStarting(ServerStartingEvent event)
    {
        LOGGER.info("Unique Materials loading...");
    }

    @SubscribeEvent
    public void onServerStarted(ServerStartedEvent event)
    {
        LOGGER.info("Unique Materials loaded!");
    }
    
    @SubscribeEvent
    public void onServerStopping(ServerStoppingEvent event)
    {
        LOGGER.info("Unique Materials unloading...");
    }

    @SubscribeEvent
    public void onServerStopped(ServerStoppedEvent event)
    {
        LOGGER.info("Unique Materials unloaded!");
    }
}
