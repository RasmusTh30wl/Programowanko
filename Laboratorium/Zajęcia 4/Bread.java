package org.example;

public class Bread extends Product  {
    public Bread(String name, double netPrice, int amount){
        super(name,netPrice, amount);
        this.tax=5;
        this.profit=10;
        this.price=((double)Math.round((1+this.tax/100)*netPrice*1.15*100))/100;
    }
    public String ordered(int limit){
        if(amount<limit){
            return "Zamówić chleb "+this.name+" w piekarni\n";
        }
        return "";
    }


}
