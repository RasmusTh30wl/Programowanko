package com.umcs.oop1;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.atomic.AtomicLong;
import java.util.stream.Stream;

import static java.nio.file.Paths.get;

public class DirectoryEntry implements AbstractFilesystemEntry {
    protected String name;
    protected long size;
    Map<String, AbstractFilesystemEntry> children = new HashMap<>();

    public DirectoryEntry(Path path) {
        this.name = path.getFileName().toString();
        try {
            this.size = populateChildren(path);
        } catch (IOException e) {
            this.size = 0;
        }
    }

    long populateChildren(Path path) throws IOException {
        AtomicLong childrenSize = new AtomicLong(0);
        Stream<Path> files = Files.list(path);
        files.forEach(file -> {
            AbstractFilesystemEntry entry;
            if (Files.isDirectory(file))
                entry = new DirectoryEntry(file);
            else
                entry = new FileEntry(file);
            children.put(file.getFileName().toString(), entry);
            childrenSize.addAndGet(entry.size());
        });
        return childrenSize.get();
    }

    public long size() {
        return this.size;
    }

    public List<AbstractFilesystemEntry> children() {
        return new ArrayList<>(children.values());
    }

    public AbstractFilesystemEntry child(String name) {
        return children.get(name);
    }


    public String name() {
        return "["+this.name+"]";
    }
}
