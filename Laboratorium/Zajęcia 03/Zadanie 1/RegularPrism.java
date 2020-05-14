package org.example;

public class RegularPrism extends RegularPolyhedron{
    public RegularPrism(double a, double height, int noSides){
        super(a,height, noSides);
    }

    public double volume(){
        return this.getArea()*this.getHeight();
    }

}
