package com.company;
import java.io.File;
import java.io.FileNotFoundException;
import java.time.Period;
import java.time.format.DateTimeFormatter;
import java.time.format.DateTimeParseException;
import java.util.ArrayList;
import java.util.List;
import java.time.LocalDate;
import java.util.Scanner;






public class Main {

    public static void main(String[] args) throws FileNotFoundException {
        Handling obj=new Handling();
        try {
            obj.populate("tmp");
//            List<List<Person>> people = obj.descendants(obj.getPerson("Marek Głaz"));
//            Handling.showDescendands(people);

            List<List<Person>> people = obj.descendants(obj.getPerson("Marek Głaz"));
            Handling.showDescendands(people);

        }catch(AmbigiousPersonException ex){
            System.err.println("AmbigiousPersonException "+ ex.getPath1() + " " + ex.getPath2());
        }catch(UndefinedPersonReferenceException ex){
            System.err.println("UndefinedChildException "+ex.getName()+" "+ex.getPath());
        }catch(ParentChildInconsistencyException ex){
            System.err.println("ParentChildInconsistencyException "+ex.getPathParent()+" "+ex.getPathChild());
        }catch(ParentingAgeException ex){
            System.err.println("ParentingAgeException "+ex.getPathParent()+" "+ex.getPathChild());
        }


        
    }
}
