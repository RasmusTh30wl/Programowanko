package com.company;

import java.lang.reflect.Array;
import java.util.ArrayList;

class BooleanHolder{
    public boolean b;
}

public class Subject {
    private String name;
    private Teacher emp;
    private Student[] stud;
    private int max;
    private int current;
    public  Subject(String name, int max, Teacher emp){
        this.name=name;
        this.max=max;
        this.emp=emp;
        stud = new Student[max];
        this.current=0;
    }
    public Subject(Subject s){
        this(s.name,s.max, s.emp);
    }

    public boolean addStudent(Student s){
        if(current<max) {
            stud[current++]=s;
            return true;
        }
        else
            return false;
    }
    void printStudents(){
        if(current==0) {
            System.out.println("No students!");
        }
        for(int i=0;i<current;i++)
            System.out.println(stud[i].getLogin());
    }
    public Student checkStudent(int index,BooleanHolder b){

        for(int i=0;i<current;i++){
            if(stud[i].getIndex()==index) {
                b.b=true;
                return stud[i];
            }
        }
        b.b=false;
        return new Student("","",0,0);
    }
    //Wersja 1
//    public static Subject[] check(Subject[] subject, Student student){
//        BooleanHolder b=new BooleanHolder();
//        int counter=0;
//        for(Subject sub: subject){
//            sub.checkStudent(student.getIndex(),b);
//            if(b.b==true)
//                counter++;
//        }
//        Subject arr[] = new Subject[counter];
//        counter=0;
//        for(Subject sub: subject){
//            sub.checkStudent(student.getIndex(),b);
//            if(b.b==true)
//                arr[counter++]=sub;
//        }
//        return arr;
//    }
    //Wersja 2
    public static ArrayList<Subject> check(Subject[] subject, Student student){
        BooleanHolder b=new BooleanHolder();
        ArrayList<Subject> arr = new ArrayList<Subject>();
        for(Subject sub: subject){
            Student s=sub.checkStudent(student.getIndex(),b);
            if(b.b==true)
                arr.add(sub);
        }
        return arr;
    }


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
