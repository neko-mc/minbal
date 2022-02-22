package de.saschat.minebal.packs.abstr;

import org.jetbrains.annotations.NotNull;

import java.io.File;
import java.io.IOException;
import java.io.InputStream;
import java.util.Spliterator;
import java.util.Spliterators;
import java.util.stream.Stream;
import java.util.stream.StreamSupport;
import java.util.zip.ZipEntry;
import java.util.zip.ZipException;
import java.util.zip.ZipFile;

public class ZipFileAbstraction extends ZipFile implements FileAccessAbstraction {
    public ZipFileAbstraction(@NotNull File file) throws ZipException, IOException {
        super(file);
    }

    @Override
    public InputStream getFile(String name) {
        try {
            return getInputStream(getEntry(name));
        } catch (IOException e) {
            return null;
        }
    }

    @Override
    public String[] getFiles() {
        return StreamSupport.stream(Spliterators.spliteratorUnknownSize(this.entries().asIterator(), Spliterator.ORDERED), false)
            .map(ZipEntry::getName)
            .filter(name -> !name.endsWith("/"))
            .toList()
            .toArray(new String[0]);
    }
}
