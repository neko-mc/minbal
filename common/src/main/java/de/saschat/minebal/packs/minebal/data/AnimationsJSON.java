package de.saschat.minebal.packs.minebal.data;

import com.google.gson.annotations.Expose;

import java.util.HashMap;

public class AnimationsJSON {
    @Expose
    public String name;
    @Expose
    public HashMap<String, AnimationPart[]> data;

    public static class AnimationPart {
        @Expose
        public double time;
        @Expose
        public String part;
        @Expose
        public double[] translation;
        @Expose
        public double[] rotation;
        @Expose
        public double[] scale;
        @Expose
        public double opacity;
        @Expose
        public String smoothing;
    }
}
