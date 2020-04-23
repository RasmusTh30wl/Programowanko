package org.example;

public class Rectangle implements Polygon{
    Point a,b,c,d;
    Rectangle(Point a, Point b, Point c, Point d){
        this.a=a;
        this.b=b;
        this.c=c;
        this.d=d;
    }
	@Override
    public double perimeter() {
        return 2*a.distance(b)+2*b.distance(c);
    }
    @Override
    public double area() {
        return a.distance(b)*b.distance(c);
    }
}
