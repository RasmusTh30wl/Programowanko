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
