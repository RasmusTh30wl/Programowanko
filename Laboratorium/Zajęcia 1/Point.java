package org.example;

class Point{


    private float x;
    private float y;
    public Point(float x,float y){
        this.x=x;
        this.y=y;
    }

    public float getX(){
        return x;
    }
//    public void setX(float x) {
//        this.x = x;
//    }
//
//    public void setY(float y) {
//        this.y = y;
//    }

    public float getY(){
        return y;
    }
    public void move(float x, float y){
        this.x+=x;
        this.y+=y;
    }
    public void print(){
        System.out.println("("+getX()+";"+getY()+")");
    }
    public void move(Point p){
        this.x+=p.x;
        this.y+=p.y;
    }
    public double distance(Point p){
        return Math.sqrt((x-p.x)*(x-p.x)+(y-p.y)*(y-p.y));
    }
}

