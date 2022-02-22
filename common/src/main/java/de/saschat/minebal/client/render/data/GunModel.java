package de.saschat.minebal.client.render.data;

import net.minecraft.client.model.ModelPart;
import net.minecraft.client.model.ModelPartBuilder;
import net.minecraft.client.render.VertexConsumer;
import net.minecraft.client.render.entity.model.SlimeEntityModel;
import net.minecraft.client.util.math.MatrixStack;
import net.minecraft.util.math.Vec3d;

import java.util.HashMap;
import java.util.Map;

public class GunModel {
    //void render(MatrixStack stack, VertexConsumer consumer, int light, int overlay); // Add more
    public Map<String, ModelPart> partsList = new HashMap<>();
    public Map<String, Vec3d> defaultPartsPositions = new HashMap<>();

    public void a() {
        ModelPart b = new ModelPart();

        ModelPartBuilder.create().
    }
}
