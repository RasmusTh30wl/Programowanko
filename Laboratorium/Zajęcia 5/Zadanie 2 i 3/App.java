package org.example;

/**
 * Hello world!
 *
 */

//wersja z tablicą (ekosystem jest ograniczony z góry liczbą zwierząt), czyli rozwiązanie nie do końca poprawne
public class App 
{
    public static void main( String[] args )
    {
        Animal[] animals= new Animal[10];
        //animals[0]=new Animal();
        animals[1]= new Animal(Species.BEAR,2,7,true);
        //animals[4]= new Animal(Species.BEAR,3,7,false);
        animals[2]= new Animal(Species.BEAR,2,7,false);
        //animals[3]= new Animal(Species.BEAR,3,7,false);

        Ecosystem eco=new Ecosystem(animals);
        System.out.println("------------------");

        for(int i=0;i<7;i++) {
            eco.print();
            eco.birth();
            eco.addAge();
        }
    }
}


//wersja z ArrayListą (ekosystem nie jest ograniczony z góry liczbą zwierząt)
public class App 
{
    public static void main( String[] args )
    {
        ArrayList <Animal> animals= new ArrayList<>();
        //animals[0]=new Animal();
        animals.add(new Animal(Species.BEAR,2,7,true));
        //animals[4]= new Animal(Species.BEAR,3,7,false);
        animals.add(new Animal(Species.BEAR,2,7,false));
        //animals[3]= new Animal(Species.BEAR,3,7,false);

        Ecosystem eco=new Ecosystem(animals);
        System.out.println("------------------");

        for(int i=0;i<5;i++) {
            eco.print();
            eco.birth();
            eco.addAge();
        }
    }
}
