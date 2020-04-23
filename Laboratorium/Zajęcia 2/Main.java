package com.company;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
//        User u1=new User("Ala", "admin");
//        //System.out.println( u1.authorize("Ala","admin"));
//        Student s1=new Student("Jan","admin",1,1231);
//        Student s2=new Student("Jan2","admin", 1,1234);
//        Student s3=new Student("Jan3","admin", 1,1294);
//        s1.print();
//        u1.print();
//        User o=new User("ala", "123");
//        User a=new User("ala", "123");
//        System.out.println(a.equals(o));
//        Employee emp=new Employee("Jasiek", "123","Instytut Informatyki");
//        emp.print();
//        Subject sub1=new Subject("Programowanie Obiektowe",2,emp);
//        System.out.println(sub1.addStudent(s1));
//        System.out.println(sub1.addStudent(s2));
//        System.out.println(sub1.addStudent(s3));
//        Subject sub2=new Subject(sub1);
//        System.out.println(sub2.getName()+"dupa");
//        //sub1.printStudents();
//        BooleanHolder b=new BooleanHolder();
//        Student student = sub1.checkStudent(1231, b);
//        student.print();
//        System.out.println(b.b);
        Teacher t1=new Teacher("Jan","123","Instytut Informatyki");
        Teacher t2=new Teacher("Janina","12345","Instytut Informatyki");
        Student stud1=new Student("Asia", "qwerty", 1,12345);
        Student stud2=new Student("Kasia", "qwerty", 1,12346);
        Student stud3=new Student("Staszek", "qwerty", 1,12347);

        Subject s1=new Subject("Programowanie Obiektowe",120,t1);
        Subject s2=new Subject("Architektury Systemów Komputerowych", 100, t2);
        Subject s3=new Subject("Analiza Matematyczna", 150, t1);
        s1.addStudent(stud1);
        s1.addStudent(stud2);
        s2.addStudent(stud1);
        s2.addStudent(stud2);
        s2.addStudent(stud3);
        Subject arr[]={s1,s2,s3};
        //Wersja 1
        //Subject[] arr2 = Subject.check(arr, stud1);

        //Wersja 2
        ArrayList<Subject> arr2 = Subject.check(arr,stud1);

        for(Subject s: arr2)
            System.out.println(s.getName());




    }
}
