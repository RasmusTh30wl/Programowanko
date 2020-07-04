package com.company;

import java.nio.file.Path;
import java.time.LocalDate;
import java.util.List;

public class IncompletePerson extends Person {
    private List<String> parentsStr;
    private List<String> childrenStr;

    public IncompletePerson(Path path, String name, LocalDate birth, LocalDate death, List<String> parents, List<String> children) {
        super(path, name, birth, death);
        parentsStr = parents;
        childrenStr = children;
    }

    public List<String> getParentsStr() {
        return parentsStr;
    }

    public List<String> getChildrenStr() {
        return childrenStr;
    }
}
