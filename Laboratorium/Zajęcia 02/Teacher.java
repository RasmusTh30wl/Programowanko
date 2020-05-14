
/*
Zadanie 2.
Napisz klasę Teacher, która dziedziczy po klasie User, której prywatne pola należy zmienić na chronione. 
Teacher powinien mieć dodatkowe pole ustawiane w konstruktorze, określające jednostkę, w której pracuje. 
Napisz metodę print wypisującą login i password nauczyciela wykorzystując metodę print z klasy User.
*/

package com.company;

public class Teacher extends User {
    private String departament;
    Teacher(String login, String password, String departament){
        super(login, password);
        this.departament=departament;
    }
    public void print(){
        System.out.printf("Teacher: ");
        super.print();
        System.out.println(departament+"\n");
    }




}
