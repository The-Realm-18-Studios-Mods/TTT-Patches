package com.therealm18studios.tttpatches;

import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.javafmlmod.FMLJavaModLoadingContext;

@Mod(TTTPatches.MODID)
public class TTTPatches
{
    public static final String MODID = "tttpatches";

    public TTTPatches()
    {
        IEventBus modEventBus = FMLJavaModLoadingContext.get().getModEventBus();
    }
}
