package de.saschat.minebal.packs;

import de.saschat.minebal.packs.data.*;
import net.minecraft.client.model.ModelData;

import java.util.Set;

public interface ContentPack {
    Set<AnimationData> animations();
    Set<BulletData> bullets();
    Set<EntityData> entities();
    Set<GunData> guns();
    Set<ModelData> models();
    Set<AttachmentData> attachments();
}
