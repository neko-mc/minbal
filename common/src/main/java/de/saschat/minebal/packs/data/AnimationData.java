package de.saschat.minebal.packs.data;

import net.minecraft.util.Identifier;
import net.minecraft.util.math.Vec3d;

import java.util.HashMap;

public class AnimationData {
    public Identifier name;
    public HashMap<String, TransitionKey> data;

    public static class TransitionKey {
        public double time;
        public String name;

        public Vec3d translation;
        public Vec3d rotation;
        public Vec3d scale;

        public double opacity;
        public SmootheningData smooth;
    }

    public enum SmootheningData {
        LINEAR,
        EASE_IN,
        EASE_OUT,
        EASE_BOTH
    }
}
