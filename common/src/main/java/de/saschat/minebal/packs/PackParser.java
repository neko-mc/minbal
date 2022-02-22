package de.saschat.minebal.packs;

import de.saschat.minebal.packs.ContentPack;
import de.saschat.minebal.packs.abstr.FileAccessAbstraction;

public interface PackParser {
    ContentPack parsePack(FileAccessAbstraction file);
}
