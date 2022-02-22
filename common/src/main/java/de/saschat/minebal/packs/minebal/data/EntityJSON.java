package de.saschat.minebal.packs.minebal.data;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class EntityJSON {
    @Expose
    public String name;
    @Expose
    @SerializedName("class")
    public String clazzName;
}
