package de.saschat.minebal.item;

import de.saschat.minebal.client.render.GunRenderer;
import dev.architectury.injectables.annotations.ExpectPlatform;
import net.minecraft.client.render.item.BuiltinModelItemRenderer;
import net.minecraft.item.Item;

public class GunItem extends Item {
    protected GunItem(Settings settings) {
        super(settings);
    }

    public BuiltinModelItemRenderer getRenderer() {
        return new GunRenderer();
    }

    @ExpectPlatform
    public static GunItem newInstance(Settings settings) {
        throw new AssertionError("");
    }
}
