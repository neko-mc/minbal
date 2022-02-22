package de.saschat.minebal.item.forge;

import de.saschat.minebal.item.GunItem;
import net.minecraft.client.render.item.BuiltinModelItemRenderer;
import net.minecraftforge.client.IItemRenderProperties;

import java.util.function.Consumer;

public class GunItemForge extends GunItem {
    public GunItemForge(Settings a) {
        super(a);
    }

    @Override
    public void initializeClient(Consumer<IItemRenderProperties> consumer) {
        super.initializeClient(consumer);
        consumer.accept(new IItemRenderProperties() {

            @Override
            public BuiltinModelItemRenderer getItemStackRenderer() {
                return getRenderer();
            }
        });
    }

}
