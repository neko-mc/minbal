package de.saschat.minebal.packs.data;

import net.minecraft.util.Identifier;

/*
    BulletData has a ManyToOne relationship with Entity and/or Model.
    A BulletData corresponds to one type of bullet,
        identified by its behaviour, its caliber, and its ballistic parameters.
 */
public class BulletData {
    public Identifier name;
    public Identifier caliber;

    public double damage;
    public double velocity;
    public double spread;
    public double drag;

    public Identifier model;
    public Identifier entity;
}
