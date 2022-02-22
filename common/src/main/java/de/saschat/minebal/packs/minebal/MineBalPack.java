package de.saschat.minebal.packs.minebal;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import de.saschat.minebal.packs.ContentPack;
import de.saschat.minebal.packs.abstr.FileAccessAbstraction;
import de.saschat.minebal.packs.data.*;
import de.saschat.minebal.packs.minebal.data.PackJSON;
import de.saschat.minebal.packs.minebal.data.model.ModelJSON;
import net.fabricmc.fabric.api.event.lifecycle.v1.ServerTickEvents;
import net.minecraft.client.model.ModelData;

import java.io.File;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashSet;
import java.util.Set;
import java.util.zip.ZipFile;

public class MineBalPack implements ContentPack {
    public static Gson MINEBAL_GSON = new GsonBuilder().excludeFieldsWithoutExposeAnnotation()
        .registerTypeAdapterFactory(ModelJSON.getAdapter())
        .create();

    public FileAccessAbstraction file;
    public MineBalPack(FileAccessAbstraction file) throws IOException {
        this.file = file;
    }

    public Set<AnimationData>  animations  = new HashSet<>();
    public Set<BulletData>     bullets     = new HashSet<>();
    public Set<EntityData>     entities    = new HashSet<>();
    public Set<GunData>        guns        = new HashSet<>();
    public Set<ModelData>      models      = new HashSet<>();
    public Set<AttachmentData> attachments = new HashSet<>();

    public static boolean validPack(FileAccessAbstraction file) {
        try {
            PackJSON json = MINEBAL_GSON.fromJson(new InputStreamReader(file.getFile("/pack.json")), PackJSON.class);
            return true; // Valid JSON == Good :D
        } catch (Exception ex) {
            ex.printStackTrace();
            return false;
        }
    }

    @Override
    public Set<AnimationData> animations() {
        return null;
    }

    @Override
    public Set<BulletData> bullets() {
        return null;
    }

    @Override
    public Set<EntityData> entities() {
        return null;
    }

    @Override
    public Set<GunData> guns() {
        return null;
    }

    @Override
    public Set<ModelData> models() {
        return null;
    }

    @Override
    public Set<AttachmentData> attachments() {
        return null;
    }
}
