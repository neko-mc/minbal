package de.saschat.minebal.packs.minebal.data;

import com.google.gson.annotations.Expose;

public class BulletJSON {
    @Expose
    public String name;

    @Expose
    public double baseDamage;
    @Expose
    public double baseVelocity;
    @Expose
    public double baseSpread;
    @Expose
    public double baseDrag;

    @Expose
    public String model;
    @Expose
    public String entity;
}
