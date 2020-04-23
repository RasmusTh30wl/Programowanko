package org.example;
//klasa abstrakcyjna
abstract class RegularPolyhedron {
    private double a, height, area;
    private int noSides;

    public RegularPolyhedron(double a, double height, int noSides) {
        this.a=a;
        this.height=height;
        this.noSides=noSides;
        this.area = 0.25*noSides*a*a*(1/Math.tan(Math.PI/noSides));
    }

    protected double getHeight() {
        return height;
    }

    protected double getArea(){
        return area;
    }
    abstract double volume();

}
