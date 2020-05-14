
/*
Zadanie 6.
W osobnym pliku zdefiniuj klasę Triangle. Powinna ona posiadać trzy prywatne pola typu Point określające położenie punktów trójkąta. 
Napisz konstruktor, który przyjmie jako argumenty trzy obiekty typu Point. 
Napisz publiczne metody perimeter zwracający obwód trójkąta oraz area zwracający pole trójkąta, oba w typie float. 
Przy obliczaniu pola skorzystaj z wzoru Herona: √p(p−a)(p−b)(p−c), gdzie p jest połową obwodu.
*/

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
