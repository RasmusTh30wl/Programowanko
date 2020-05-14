package org.example;

public class Triangle implements Polygon{
    private Point a,b,c;

    public Triangle(Point a, Point b, Point c){
        this.a=a;
        this.c=c;
        this.b=b;

    }

    @Override
    public double perimeter() {
        return a.distance(b)+b.distance(c)+c.distance(a);
    }
    @Override
    public double area() {
        double p=perimeter()/2;
        return Math.sqrt(p*(p- a.distance(b))*(p-b.distance(c))*(p-c.distance(a)));
    }

}
