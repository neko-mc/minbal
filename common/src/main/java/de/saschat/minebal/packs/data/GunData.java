package de.saschat.minebal.packs.data;

import net.minecraft.util.Identifier;

import java.util.Set;

public class GunData {
    public Identifier name;

    public Set<Identifier> calibers;
    public Identifier caliber;

    public int rpm;

    public Set<String> firingModes;
    public String firingMode;

    public Set<String> attachments;
    public SoundData sounds;

    public Class<?> clazz; // @TODO: Add `extends`
}
