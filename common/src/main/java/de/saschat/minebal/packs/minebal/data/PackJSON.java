package de.saschat.minebal.packs.minebal.data;

import com.google.gson.annotations.Expose;

import java.util.List;

public class PackJSON {
    @Expose
    public String name;
    @Expose
    public List<String> author;
    @Expose
    public boolean mod;
}
