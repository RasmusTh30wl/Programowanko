package org.example;

public class RegularPyramid extends RegularPolyhedron {

    public RegularPyramid(double a, double height, int noSides){
        super(a,height, noSides);
    }
    public double volume(){
        return this.getArea()*this.getHeight()/3;
    }


}
