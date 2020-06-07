package com.umcs.oop1;

import java.util.List;

public interface AbstractFilesystemEntry {
    public long size();
    public List<AbstractFilesystemEntry> children();
    public AbstractFilesystemEntry child(String name);
    public String name();
}
