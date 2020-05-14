package com.company;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.NoSuchElementException;
import java.util.function.Predicate;
import java.util.stream.Collectors;

class Point{
    private double x;
    private double y;
    public Point(double x, double y){
        this.x=x;
        this.y=y;
    }
    public double getX() {
        return x;
    }
    public double getY() {
        return y;
    }
    @Override
    public String toString() {
        return "Point{" +
                "x=" + x +
                ", y=" + y +
                '}';
    }
    public double distance(Point p){
        return Math.hypot(p.x-this.x, p.y-this.y);
    }
}
public class Main {
    public static void sortX(List<Point> lista){
        Collections.sort(lista, (e1, e2)->Double.compare(e1.getX(),e2.getX()));
    }
    public static void sortY(List<Point> lista){
        Collections.sort(lista, (e1,e2)->Double.compare(e1.getY(),e2.getY()));
    }
    public static void sortPoint(List<Point> lista, Point p){
        Collections.sort(lista, (e1,e2)->Double.compare(e1.distance(p),e2.distance(p)));
    }

    public static List<Point> range(List<Point> lista, Point p){
        Predicate<Point> xPredicate = e1->(e1.getX()<p.getX() && e1.getY()<p.getY());
        List<Point> res=lista
                .stream()
                .filter(xPredicate)
                .collect(Collectors.toList());
        return res;
    }
    public static Point nearest(List<Point> lista, Point p){
        Point min = lista
                .stream()
                .reduce( (p1, p2) -> {
                    double dist1 = p.distance(p1);
                    double dist2 = p.distance(p2);
                    if(dist1<dist2){
                        return p1;
                    } else {
                        return p2;
                    }
                })
                .orElseThrow(NoSuchElementException::new);
        return min;
    }

    public static void main(String[] args) {
        List<Point> lista = new ArrayList();
        lista.add(new Point(15,77));
        lista.add(new Point(20,1));
        lista.add(new Point(5,1));
        lista.add(new Point(77,21));
        System.out.println("zadanie 2a");
        sortX(lista);
        lista.forEach(System.out::println);
        System.out.println("zadanie 2b");
        sortY(lista);
        lista.forEach(System.out::println);
        System.out.println("zadanie 2c");
        sortPoint(lista, new Point(80,80));
        lista.forEach(System.out::println);
        System.out.println("zadanie 2d");
        List<Point> res=range(lista,new Point(77,12));
        res.forEach(System.out::println);
        System.out.println("zadanie 2e");
        Point p=nearest(lista, new Point(0,0));
        System.out.println(p);


    }
}
