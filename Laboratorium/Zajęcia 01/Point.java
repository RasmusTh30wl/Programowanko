
/*
Zadanie 1.
Napisz klasę Point posiadającą dwa pola prywatne typu float. Napisz akcesory do tych pól.
*/

/*
Zadanie 2a.
Do klasy Point dopisz metodę move, która przyjmie dwa argumenty typu float - x i y, która przesunie punkt o zadany wektor.
*/

/*
Zadanie 2b.
Przeciąż metodę move, aby mogła przyjmować w argumencie obiekt klasy Point, którego pola x, y traktowane są jako składowe wektora.
*/

/*
Zadanie 3.
Usuń z klasy Point settery. Napisz konstruktor, który przyjmie dwa argumenty typu float i ustawi ich wartości polom x i y.
*/

/*
Zadanie 4.
Napisz metodę distance, która przyjmie jako argument obiekt klasy Point, a następnie zwróci odległość między punktami 
wyrażoną za pomocą typu double.
*/

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

