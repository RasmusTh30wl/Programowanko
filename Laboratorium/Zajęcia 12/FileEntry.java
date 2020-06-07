package com.umcs.oop1;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.ArrayList;
import java.util.List;

public class FileEntry implements AbstractFilesystemEntry {
    protected String name;
    protected long size;

    public FileEntry(Path path) {
        this.name = path.getFileName().toString();
        try {
            this.size = Files.size(path);
        } catch (IOException e) {
            this.size = 0;
        }
    }

    public long size() {
        return this.size;
    }

    public List<AbstractFilesystemEntry> children() {
        return new ArrayList<AbstractFilesystemEntry>();
    }

    public AbstractFilesystemEntry child(String s) {
        return null;
    }

    public String name() {
        return this.name;
    }
}
