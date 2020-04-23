package org.example;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        Triangle t1=new Triangle(new Point(0,0), new Point(1,0), new Point(1,1));
        System.out.println("Odwód t1: "+t1.perimeter()+"\nPole t1: "+t1.area());
        Rectangle p1=new Rectangle(new Point(0,0), new Point(2,0), new Point(2,2), new Point(0,2));
        System.out.println("Odwód p1: "+p1.perimeter()+"\nPole p1: "+p1.area());

    }
}
