package de.saschat.minebal.forge;

import dev.architectury.platform.forge.EventBuses;
import de.saschat.minebal.MinecraftBallistics;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.javafmlmod.FMLJavaModLoadingContext;

@Mod(MinecraftBallistics.MOD_ID)
public class MinecraftBallisticsForge {
    public MinecraftBallisticsForge() {
        // Submit our event bus to let architectury register our content on the right time
        EventBuses.registerModEventBus(MinecraftBallistics.MOD_ID, FMLJavaModLoadingContext.get().getModEventBus());
        MinecraftBallistics.init();
    }
}
