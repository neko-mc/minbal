package de.saschat.minebal.item.forge;

import de.saschat.minebal.item.GunItem;
import net.minecraft.item.Item;

public class GunItemImpl {
    public static GunItem newInstance(Item.Settings settings) {
        return new GunItemForge(settings);
    }
}
