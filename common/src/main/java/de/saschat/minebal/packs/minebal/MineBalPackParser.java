package de.saschat.minebal.packs.minebal;

import de.saschat.minebal.packs.ContentPack;
import de.saschat.minebal.packs.PackParser;
import de.saschat.minebal.packs.abstr.FileAccessAbstraction;

public class MineBalPackParser implements PackParser {
    @Override
    public ContentPack parsePack(FileAccessAbstraction file) {
        if(!MineBalPack.validPack(file))
            return null;
        try {
            return new MineBalPack(file);
        } catch (Exception ex) {
            ex.printStackTrace();
            return null;
        }
    }
}
