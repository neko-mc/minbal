package de.saschat.minebal.packs.minebal.data.model;

import com.google.gson.annotations.Expose;
import com.google.gson.typeadapters.RuntimeTypeAdapterFactory;

public class JSONModel extends ModelJSON {
    @Expose
    public JSONModelData[] data;

    public static class JSONModelData {
        @Expose
        public String name;
        @Expose
        public String type;

        public static RuntimeTypeAdapterFactory getAdapter() {
            return RuntimeTypeAdapterFactory.of(
                    JSONModelData.class,
                    "type"
                )
                .registerSubtype(BoxData.class, "BOX")
                .registerSubtype(VertexData.class, "TRIANGLES");
        }

        public static class BoxData extends JSONModelData {
            @Expose
            public int[][] data;
        }

        public static class VertexData extends JSONModelData {
            @Expose
            public int[][] data;
        }
    }
}
