package de.saschat.minebal.client.render.fabric;

import net.fabricmc.fabric.api.client.rendering.v1.BuiltinItemRendererRegistry;
import net.minecraft.client.render.item.BuiltinModelItemRenderer;
import net.minecraft.item.Item;

public class RenderRegistryImpl {
    public static void register(Item item, BuiltinModelItemRenderer renderer) {
        BuiltinItemRendererRegistry.INSTANCE.register(item, (BuiltinItemRendererRegistry.DynamicItemRenderer) renderer::render);
    }
}
