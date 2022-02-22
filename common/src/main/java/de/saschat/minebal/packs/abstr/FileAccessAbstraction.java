package de.saschat.minebal.packs.abstr;

import java.io.InputStream;

public interface FileAccessAbstraction {
    InputStream getFile(String name);
    String[] getFiles();
}
