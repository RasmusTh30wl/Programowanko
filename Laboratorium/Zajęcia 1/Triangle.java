package org.example;

public class Triangle {
    private Point p,r,s;
    public Triangle(Point p,Point r, Point s){
        this.p=p;
        this.r=r;
        this.s=s;
    }
    public float perimeter(){
        return (float) (p.distance(r)+ r.distance(s)+s.distance(p));
    }
    public float area(){
        double l=0.5*perimeter();
        return (float) (Math.sqrt(l*(l-p.distance(r))*(l-r.distance(s))*(l-s.distance(p))));
    }
}
