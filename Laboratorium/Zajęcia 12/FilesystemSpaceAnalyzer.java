package com.umcs.oop1;

import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.function.ToIntFunction;

public class FilesystemSpaceAnalyzer {
    private AbstractFilesystemEntry root;
    private Path rootPath;

    public FilesystemSpaceAnalyzer(String pathString) {
        this.rootPath = Paths.get(pathString);
        root = new DirectoryEntry(rootPath);
    }

    public void analyze(String relativePathString) {
        String [] pathStrings = relativePathString.split("/");
        AbstractFilesystemEntry relativeRoot = root;
        for(String pathPart : pathStrings)
            relativeRoot = relativeRoot.child(pathPart);

        List<AbstractFilesystemEntry> entries = new ArrayList<>(relativeRoot.children());
        entries.sort(Comparator.comparingLong(AbstractFilesystemEntry::size).reversed());

        for(AbstractFilesystemEntry entry : entries) {
            System.out.printf("%5.2f%%\t%s\n",(float)(100*entry.size()/relativeRoot.size()),entry.name());
        }
    }


}
