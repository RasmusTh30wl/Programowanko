package org.example;

public class Book extends Product {
    public Book(String name, double netPrice, int amount){
        super(name,netPrice, amount);
        this.tax=23;
        this.profit=20;
        this.price=((double)Math.round((1+this.tax/100)*netPrice*1.15*100))/100;
    }

    public String ordered(int limit){
        if(amount<limit){
            return "Zamówić książkę "+this.name+" w księgarni\n";
        }
        return "";
    }


}
