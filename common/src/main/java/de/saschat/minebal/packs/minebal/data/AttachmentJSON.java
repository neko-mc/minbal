package de.saschat.minebal.packs.minebal.data;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class AttachmentJSON {
    @Expose
    public String name;
    @Expose
    public String group;
    @Expose
    public String type;
    @Expose
    @SerializedName("class")
    public String clazz;
}
