package de.saschat.minebal.packs.data;

import net.minecraft.util.Identifier;

public class AttachmentData {
    public Identifier name;
    public Identifier group;
    public AttachmentType type;
    public Class<?> clazz; // @TODO: Add `extends`

    public enum AttachmentType {
        SCOPE,
        UNDER_BARREL,
        BARREL,
        SIDE_BARREL,
        STOCK
    }
}
