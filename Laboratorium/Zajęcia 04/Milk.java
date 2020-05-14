package org.example;

public class Milk extends Product {
    public Milk(String name, double netPrice, int amount){
        super(name,netPrice, amount);
        this.tax=5;
        this.profit=15;
        this.price=((double)Math.round((1+this.tax/100)*netPrice*1.15*100))/100;
    }
    public String ordered(int limit){
        if(amount<limit){
            return "Zamówić mleko "+this.name+" w mleczarni\n";
        }
        return "";
    }


}
