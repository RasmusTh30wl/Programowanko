package org.example;

public class Point {
    public double x,y;

    public double getX() {
        return x;
    }

    public double getY() {
        return y;
    }

    public Point(double x, double y) {
        this.x = x;
        this.y = y;
    }
    public double  distance (Point p){
        return Math.hypot(p.x-this.x,p.y-this.y);
    }
}
