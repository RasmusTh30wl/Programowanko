package org.example;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        //nie można utworzyć obiektu klasy abstarkcyjnej
        //RegularPolyhedron b1=new RegularPolyhedron(2, 4, 2);

        //polimorfizm
        RegularPolyhedron b2=new RegularPrism(3,1,4);
        //do elementów chronionych mamy dostęp z poziomu pakietu
        System.out.println("Pole podstawy wynosi: " + b2.getArea()+
                "\nObjętość bryły wynosi: " + b2.volume());

        RegularPolyhedron b3=new RegularPyramid(3,1,4);
        System.out.println("Pole podstawy wynosi: " + b3.getArea()+
                "\nObjętość bryły wynosi: " + b3.volume());



    }
}
