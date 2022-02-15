package de.saschat.minebal.fabric;

import de.saschat.minebal.MinecraftBallistics;
import net.fabricmc.api.ModInitializer;

public class MinecraftBallisticsFabric implements ModInitializer {
    @Override
    public void onInitialize() {
        MinecraftBallistics.init();
    }
}
