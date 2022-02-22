package de.saschat.minebal.packs.data;

import net.minecraft.util.Identifier;
import net.minecraft.util.math.Vec2f;
import net.minecraft.util.math.Vec3d;

import java.util.List;

// @TODO: Infrastructure for complete model/rendering system replacements.
public class ModelData {
    public Identifier name;
    public Identifier animations;
    public static class PartData {
        public String name;
        public List<TriangleData> triangles;
    }
    public static class TriangleData {
        public Vec3d a;
        public Vec3d b;
        public Vec3d c;

        public Vec2f uv; // ?
    }
}
