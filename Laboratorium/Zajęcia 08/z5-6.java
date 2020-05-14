package com.company;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

class Point {
    public float getX() {
        return x;
    }

    public float getY() {
        return y;
    }

    private float x, y;

    public Point(float x, float y) {
        this.x = x;
        this.y = y;
    }

    public void print() {
        System.out.println("(" + this.x + "," + this.y + ")");
    }
    //Zadanie 6
    public static List<Point> rec(List<Point> in, Point p, Point r){
        List<Point> out=new ArrayList<>();
        for(Point s:in){
            if(p.getX()<s.getX() && s.getX()<r.getX() &&  r.getY()<s.getY() && s.getY()< p.getY())
                out.add(s);
        }
        return out;
    }


}
class Comp1 implements Comparator<Point> {
    @Override
    public int compare(Point p, Point r) {
        if(p.getX()==r.getX()) return 0;
        else if(p.getX()>r.getX()) return 1;
        return -1;
    }
}

class Comp2 implements Comparator<Point> {
    @Override
    public int compare(Point p, Point r) {
        if(p.getY()==r.getY()) return 0;
        else if(p.getY()>r.getY()) return 1;
        return -1;
    }
}
public class Main {

    public static void main(String[] args) {
        List<Point> lista=new ArrayList<>();
        lista.add(new Point(77,34));
        lista.add(new Point(2,3));
        lista.add(new Point(21,6));
        lista.add(new Point(82,44));
        lista.add(new Point(23,12));
        lista.add(new Point(15,4));
        lista.add(new Point(7,6.25f));

        for(Point p:lista){
            p.print();
        }
        Collections.sort(lista,new Comp1());
        System.out.println("-------Sortowanie po x----------");
        for(Point p:lista){
            p.print();
        }
        Collections.sort(lista,new Comp2());
        System.out.println("-------Sortowanie po y----------");
        for(Point p:lista){
            p.print();
        }
        //Zadanie 6
        System.out.println("-------Prostokąt----------");
        List<Point> res= Point.rec(lista, new Point(4,7),new Point(30,2));
        for(Point p:res){
            p.print();
        }
    }
}
