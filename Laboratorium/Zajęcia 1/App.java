package org.example;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        Point p = new Point(0,0);
        Point q = new Point(1,0);
        Point r = new Point(0,1);
        Triangle t = new Triangle(p,q,r);
        System.out.println(t.perimeter());
        System.out.println(t.area());
    }
}
