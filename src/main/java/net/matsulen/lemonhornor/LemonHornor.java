package net.matsulen.lemonhornor;

import com.mojang.logging.LogUtils;
import net.matsulen.lemonhornor.block.ModBlocks;
import net.matsulen.lemonhornor.block.entity.ModBlockEntities;
import net.matsulen.lemonhornor.event.ModEvents;
import net.matsulen.lemonhornor.item.ModCreativeModTabs;
import net.matsulen.lemonhornor.item.ModItems;
import net.matsulen.lemonhornor.loot.ModLootModifiers;
import net.matsulen.lemonhornor.recipe.ModRecipe;
import net.matsulen.lemonhornor.screen.EvolveAnvilScreen;
import net.matsulen.lemonhornor.screen.ModMenuTypes;
import net.matsulen.lemonhornor.world.ModWorld;
import net.minecraft.client.gui.screens.MenuScreens;
import net.minecraft.world.item.CreativeModeTabs;
import net.minecraftforge.api.distmarker.Dist;
import net.minecraftforge.common.MinecraftForge;
import net.minecraftforge.event.BuildCreativeModeTabContentsEvent;
import net.minecraftforge.event.server.ServerStartingEvent;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.event.lifecycle.FMLClientSetupEvent;
import net.minecraftforge.fml.event.lifecycle.FMLCommonSetupEvent;
import net.minecraftforge.fml.javafmlmod.FMLJavaModLoadingContext;
import org.slf4j.Logger;

// The value here should match an entry in the META-INF/mods.toml file
@Mod(LemonHornor.MOD_ID)
public class LemonHornor {
    public static final String MOD_ID = "lemonhornor";
    public static final Logger LOGGER = LogUtils.getLogger();

    public LemonHornor() {


        IEventBus modEventBus = FMLJavaModLoadingContext.get().getModEventBus();

        ModCreativeModTabs.register(modEventBus);

        ModLootModifiers.register(modEventBus);

        ModItems.register(modEventBus);

        ModBlocks.register(modEventBus);

        ModBlockEntities.register(modEventBus);

        ModMenuTypes.register(modEventBus);

        ModRecipe.register(modEventBus);

        ModEvents modEvents = new ModEvents();
        MinecraftForge.EVENT_BUS.register(modEvents);

        modEventBus.addListener(this::commonSetup);

        // For registration and init stuff.
        ModWorld.DEFERRED_REGISTRY_STRUCTURE.register(modEventBus);

        MinecraftForge.EVENT_BUS.register(this);
    }

    private void commonSetup(final FMLCommonSetupEvent event) {

    }

    // You can use SubscribeEvent and let the Event Bus discover methods to call
    @SubscribeEvent
    public void onServerStarting(ServerStartingEvent event) {

    }

    // You can use EventBusSubscriber to automatically register all static methods in the class annotated with @SubscribeEvent
    @Mod.EventBusSubscriber(modid = MOD_ID, bus = Mod.EventBusSubscriber.Bus.MOD, value = Dist.CLIENT)
    public static class ClientModEvents {
        @SubscribeEvent
        public static void onClientSetup(FMLClientSetupEvent event) {
            event.enqueueWork(() -> {
                MenuScreens.register(ModMenuTypes.EVOLVE_ANVIL_MENU.get(), EvolveAnvilScreen::new);

            });
        }
    }
}
