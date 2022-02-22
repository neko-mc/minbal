package de.saschat.minebal.client.render;

import dev.architectury.injectables.annotations.ExpectPlatform;
import net.fabricmc.api.EnvType;
import net.fabricmc.api.Environment;
import net.minecraft.client.render.VertexConsumerProvider;
import net.minecraft.client.render.item.BuiltinModelItemRenderer;
import net.minecraft.client.render.model.json.ModelTransformation;
import net.minecraft.client.util.math.MatrixStack;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;


public class RenderRegistry {
    @Environment(EnvType.CLIENT) // Stolen from Fabric API
    public interface IItemRenderer {
        /**
         * Renders an item stack.
         *
         * @param stack           the rendered item stack
         * @param mode            the model transformation mode
         * @param matrices        the matrix stack
         * @param vertexConsumers the vertex consumer provider
         * @param light           packed lightmap coordinates
         * @param overlay         the overlay UV passed to {@link net.minecraft.client.render.VertexConsumer#overlay(int)}
         */
        void render(ItemStack stack, ModelTransformation.Mode mode, MatrixStack matrices, VertexConsumerProvider vertexConsumers, int light, int overlay);
    }

    @ExpectPlatform
    public static void register(Item item, BuiltinModelItemRenderer renderer) {
        throw new AssertionError();
    }
}
