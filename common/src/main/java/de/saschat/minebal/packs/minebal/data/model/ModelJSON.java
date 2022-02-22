package de.saschat.minebal.packs.minebal.data.model;

import com.google.gson.annotations.Expose;
import com.google.gson.typeadapters.RuntimeTypeAdapterFactory;

public class ModelJSON {
    @Expose
    public String name;
    @Expose
    public String texture;
    @Expose
    public String type;
    @Expose
    public String animations;

    public static RuntimeTypeAdapterFactory getAdapter() {
        return RuntimeTypeAdapterFactory.of(
            ModelJSON.class,
            "type"
        ).registerSubtype(JSONModel.class, "JSON");
    }
}
