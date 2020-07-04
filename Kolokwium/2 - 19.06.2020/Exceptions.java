package com.company;

import java.nio.file.Path;
import java.util.ArrayList;
import java.util.List;
//1
class  AmbigiousPersonException extends RuntimeException{
    private Path path1, path2;
    public AmbigiousPersonException(Path  path1, Path path2){
        this.path1=path1; this.path2=path2;
    }

    public Path getPath1() {
        return path1;
    }
    public Path getPath2() {
        return path2;
    }
}
//2
class  UndefinedPersonReferenceException extends RuntimeException{
    private Path path;
    private String name;
    public UndefinedPersonReferenceException(Path path, String name){
        this.path=path;
        this.name=name;
    }

    public Path getPath() {
        return path;
    }
    public String getName() {
        return name;
    }
}
//3
class ParentChildInconsistencyException extends RuntimeException{
    private Path pathParent;
    private Path pathChild;
    public ParentChildInconsistencyException(Path pathParent, Path pathChild){
        this.pathParent=pathParent;
        this.pathChild=pathChild;
    }

    public Path getPathParent() {
        return pathParent;
    }
    public Path getPathChild() {
        return pathChild;
    }
}
//4
class ParentingAgeException extends RuntimeException{
    private Path pathParent;
    private Path pathChild;
    public ParentingAgeException(Path pathParent, Path pathChild){
        this.pathParent=pathParent;
        this.pathChild=pathChild;
    }

    public Path getPathParent() {
        return pathParent;
    }
    public Path getPathChild() {
        return pathChild;
    }
}

