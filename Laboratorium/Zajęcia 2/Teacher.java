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
