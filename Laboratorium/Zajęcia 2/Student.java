
/*
Zadanie 3.
Napisz klasę Student, która dziedziczy po klasie User. 
Student powinien mieć dodatkowe pole określające semestr ustawiane z poziomu konstruktora. 
Napisz metodę wypisującą informacje o studencie wykorzystując metodę print z klasy User.
*/

package com.company;


public class Student extends User {
    private int semester;
    private int index;

    public Student(String login, String password,int semester, int index) {

        super(login, password);
        this.semester=semester;
        this.index=index;

    }


    public void print(){
        System.out.printf("Student: ");
        super.print();
        System.out.println(" semester "+semester+"\n");
    }

    public int getIndex() {
        return index;
    }
}
