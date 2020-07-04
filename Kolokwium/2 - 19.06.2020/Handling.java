package com.company;


import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.time.format.DateTimeParseException;
import java.util.*;
import java.util.stream.Stream;

class Handling{

    Map<String, IncompletePerson> personMap;


    public void populate(String path) {
        personMap = new HashMap<>();

        try (Stream<Path> paths = Files.list(Paths.get(path))) {
            paths.filter(Files::isRegularFile).forEach(filePath ->  {
                IncompletePerson person = getPersonFromFile(filePath);
                if(!personMap.containsKey(person.name()))
                    personMap.put(person.name(), person);
                else
                    throw new AmbigiousPersonException(person.getPath(), personMap.get(person.name()).getPath());

            });
        }
        catch(IOException e) {
            e.printStackTrace();
        }

        //checkAmbigiousPerson();
        setParentChildrenReferences();
    }

    public Person getPerson(String name) {
        if(personMap.containsKey(name))
            return personMap.get(name);
        else return null;
    }

    private enum FileExpectation{ExpectsDeath, ExpectsParent, ExpectsChild }

    private IncompletePerson getPersonFromFile(Path path)
            throws AmbigiousPersonException, UndefinedPersonReferenceException,
            ParentChildInconsistencyException, ParentingAgeException {
        String name=null;
        LocalDate birth=null,death=null;
        List<String> parents = new ArrayList<>();
        List<String> children = new ArrayList<>();

        Scanner in = null;
        try {
            in = new Scanner(path.toFile());
            name=in.nextLine();
            birth = LocalDate.parse(in.nextLine(), DateTimeFormatter.ofPattern("dd.MM.yyyy"));
            FileExpectation expectation = FileExpectation.ExpectsDeath;
            while(in.hasNext()) {
                String line = in.nextLine();
                if(expectation == FileExpectation.ExpectsDeath) {
                    if(line.equals("Rodzice:")) {
                        expectation = FileExpectation.ExpectsParent;
                        line = in.nextLine();
                    }
                    else if(line.equals("Dzieci:")) {
                        expectation = FileExpectation.ExpectsChild;
                        line = in.nextLine();
                    }
                    else {
                        //System.out.println(path + " " + line);
                        death = LocalDate.parse(line, DateTimeFormatter.ofPattern("dd.MM.yyyy"));
                    }
                }
                if(expectation == FileExpectation.ExpectsParent) {
                    if(line.equals("Dzieci:")) {
                        expectation = FileExpectation.ExpectsChild;
                        line = in.nextLine();
                    }
                    else
                        parents.add(line);
                }
                if(expectation == FileExpectation.ExpectsChild) {
                    children.add(line);
                }
            }

        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }

        return new IncompletePerson(path, name, birth, death, parents, children);
    }

    private void setParentChildrenReferences() throws UndefinedPersonReferenceException {
        for(IncompletePerson person : personMap.values()) {
            for(String parentStr : person.getParentsStr()) {
                if(personMap.containsKey(parentStr)) {
                    IncompletePerson parent = personMap.get(parentStr);
                    if(parent.getChildrenStr().contains(person.name()))
                        person.addParent(parent);
                    else
                        throw new ParentChildInconsistencyException(parent.getPath(), person.getPath());
                }
                else throw new UndefinedPersonReferenceException(person.getPath(), parentStr);
            }
            for(String childStr : person.getChildrenStr()) {
                if(personMap.containsKey(childStr)) {
                    IncompletePerson child = personMap.get(childStr);
                    if(child.getParentsStr().contains(person.name())) {
                        checkParentingAge(person, child);
                        person.addChild(child);
                    }
                    else
                        throw new ParentChildInconsistencyException(person.getPath(), child.getPath());
                }
                else throw new UndefinedPersonReferenceException(person.getPath(), childStr);
            }
        }
    }

    private void checkParentingAge(Person parent, Person child) {
        if( child.birth().isBefore(parent.birth().plusYears(10)) ||
                child.birth().isAfter(parent.birth().plusYears(100)) ||
                (parent.death() != null && child.birth().isAfter(parent.death())))
            throw new ParentingAgeException(parent.getPath(), child.getPath());
    }

    public List<List<Person>> descendants(Person person) {
        List<List<Person>> result = new ArrayList<>();
        List<Person> currentList = new ArrayList<Person>();
        currentList.add(person);

        do {
            List<Person> resultList = new ArrayList<>();
            for(Person currentPerson : currentList)
                resultList.addAll(currentPerson.getChildern());
            if(!resultList.isEmpty())
                result.add(resultList);
            currentList = resultList;
        } while(!currentList.isEmpty());
        return result;
    }

    public static void showDescendands(List<List<Person>> people) {
        List<String> titles = new ArrayList<>();
        if(people.size()>0) titles.add("dzieci: ");
        if(people.size()>1)
            for(int i=1; i<people.size(); i++) {
                String text = "wnuki: ";
                for (int j = 1; j < i; j++)
                    text = "pra" + text;
                titles.add(text);
            }
        Iterator<List<Person>> peopleIt = people.iterator();
        Iterator<String> titlesIt = titles.iterator();

        while(peopleIt.hasNext()) {
            System.out.print(titlesIt.next());
            Iterator<Person> personIt = peopleIt.next().iterator();
            while(personIt.hasNext()) {
                System.out.print(personIt.next().name());
                if(personIt.hasNext())
                    System.out.print(", ");
                else
                    System.out.println("");
            }
        }
    }

    public List<List<Person>> ancestors(Person person) {
        List<List<Person>> result = new ArrayList<>();
        List<Person> currentList = new ArrayList<Person>();
        currentList.add(person);

        do {
            List<Person> resultList = new ArrayList<>();
            for(Person currentPerson : currentList)
                resultList.addAll(currentPerson.getParents());
            if(!resultList.isEmpty())
                result.add(resultList);
            currentList = resultList;
        } while(!currentList.isEmpty());
        return result;
    }

    public static void showAncestors(List<List<Person>> people) {
        List<String> titles = new ArrayList<>();
        if(people.size()>0) titles.add("rodzice: ");
        if(people.size()>1)
            for(int i=1; i<people.size(); i++) {
                String text = "dziadkowie: ";
                for (int j = 1; j < i; j++)
                    text = "pra" + text;
                titles.add(text);
            }
        Iterator<List<Person>> peopleIt = people.iterator();
        Iterator<String> titlesIt = titles.iterator();

        while(peopleIt.hasNext()) {
            System.out.print(titlesIt.next());
            Iterator<Person> personIt = peopleIt.next().iterator();
            while(personIt.hasNext()) {
                System.out.print(personIt.next().name());
                if(personIt.hasNext())
                    System.out.print(", ");
                else
                    System.out.println("");
            }
        }
    }

}


