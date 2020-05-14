package org.example;


import java.util.Random;

enum Species {
    BEAR(0), DEER(1), BOBCAT(2), HEDGEHOG(3), FOX(4), None(5);
    int id;

    Species(int id) {
        this.id = id;
    }
    public static int elements(){
        return None.id;
    }

    public int getID() {
        return id;
    }

    public boolean compare(int i) {
        return id == i;
    }

    public static Species getValue(int _id) {
        Species[] As = Species.values();
        for (int i = 0; i < As.length; i++)
            if (As[i].compare(_id))
                return As[i];
        return Species.None;
    }
}
public class Animal {
    private Species name;
    private int age;
    private int maxAge;
    //zakładamy prawda - samiec, fałsz - samica;
    private boolean sex;
    private Random generator=new Random();

//    public Animal(){
//        this.age=0;
//        this.maxAge=generator.nextInt(10)+1;
//        this.sex=generator.nextBoolean();
//        this.name= Species.getValue(generator.nextInt(5));
//        System.out.println("Born: "+getName()+" "+getAge()+" "+getMaxAge()+" "+getSex());
//
//    }
    public Animal(int name){
        this.age=0;
        this.maxAge=generator.nextInt(10)+1;
        this.sex=generator.nextBoolean();
        this.name= Species.getValue(name);
        System.out.println("Born: "+getName()+" "+getAge()+" "+getMaxAge()+" "+getSexSymbol());

    }
    public Animal(Species name, int age, int maxAge, boolean sex){
        this.age=age;
        this.maxAge=maxAge;
        this.sex=sex;
        this.name=name;
        System.out.println("Arrived: "+getName()+" "+getMaxAge()+" "+getAge()+" "+getSexSymbol());
    }

    public boolean addAge(){
        this.age+=1;
        if(this.age==this.maxAge) {
            System.out.println("Died: " + getName() + " " + getMaxAge() + " " + getAge() + " " + getSexSymbol());
            return false;
        }
        return true;
    }
    public Species getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public int getMaxAge() {
        return maxAge;
    }

    public boolean getSex() {
        return sex;
    }
    public String getSexSymbol() {
        return getSex() ? "♂" : "♀";
    }
}
