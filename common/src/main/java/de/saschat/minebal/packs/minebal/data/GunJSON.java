package de.saschat.minebal.packs.minebal.data;

import com.google.gson.annotations.Expose;

public class GunJSON {
    @Expose
    public String name;
    @Expose
    public String[] caliber;
    @Expose
    public String defaultCaliber;
    @Expose
    public int rpm;
    @Expose
    public String[] firingModes;
    @Expose
    public String firingMode;
    @Expose
    public String[] attachments;
    @Expose
    public SoundsJOBJ sounds;
    @Expose
    public String rawClass;
}

