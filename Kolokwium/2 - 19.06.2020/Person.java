package com.company;

import java.nio.file.Path;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class Person{
    private Path path;
    private String _name;
    private LocalDate _birth;
    private LocalDate _death;
    private List<Person> childern, parents;

    public Person(Path path, String _name, LocalDate _birth, LocalDate _death) {
        this.path=path;
        this._name = _name;
        this._birth = _birth;
        this._death = _death;
        this.childern=new ArrayList<>();
        this.parents=new ArrayList<>();
    }
    public Person(String _name) {
        this._name = _name;
    }
    public void addChild(Person p){
        childern.add(p);
    }
    public void addParent(Person p){
        parents.add(p);
    }

    @Override
    public String toString() {
        return "Person{" +
                "name='" + _name + '\'' +
                ", birth=" + _birth +
                ", death=" + _death +
                ", parents='" + parents + '\'' +
                ", childern=" + childern +
                '}';
    }

    public String name() {
        return _name;
    }
    public LocalDate birth() {
        return _birth;
    }
    public LocalDate death() {
        return _death;
    }
    public List<Person> getChildern() { return childern; }
    public List<Person> getParents() { return parents; }
    public Path getPath() {    return path;   }
}
