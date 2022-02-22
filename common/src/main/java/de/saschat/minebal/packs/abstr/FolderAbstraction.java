package de.saschat.minebal.packs.abstr;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.InputStream;
import java.nio.file.Path;
import java.util.Arrays;
import java.util.Objects;

public class FolderAbstraction implements FileAccessAbstraction {
    File loc;
    public FolderAbstraction(File folder) {
        this.loc = folder;
    }

    @Override
    public InputStream getFile(String name) {
        try {
            if(loc.isFile())
                return new FileInputStream(loc);
            return new FileInputStream(new File(loc, name));
        } catch (FileNotFoundException e) {
            return null;
        }
    }

    @Override
    public String[] getFiles() {
        if(loc.isFile())
            return new String[]{"/"};
        return Arrays.stream(getFiles(loc)).map(a ->
            Path.of(
                a.getPath()
            ).relativize(Path.of(loc.getPath())).toString().replace("\\", "/")
        ).toArray(String[]::new);
    }

    public File[] getFiles(File directory) {
        return Arrays.stream(Objects.requireNonNull(directory.listFiles()))
            .<File>mapMulti((a, b) -> {
                if(a.isDirectory())
                    Arrays.stream(getFiles(a)).forEach(b::accept);
                else
                    b.accept(a);
        }).toArray(File[]::new);
    }
}
