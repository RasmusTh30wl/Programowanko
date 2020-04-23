package org.example;

abstract class Product implements Order{
    //cena brutto i cenna netto
    protected double price, netPrice;
    protected String name;
    //padatek VAT
    protected double tax;
    protected int amount;
    //marża sklepu
    protected double profit;


    public Product(String name, double netPrice, int amount){
        this.name=name;
        this.netPrice=netPrice;
        this.amount=amount;
    }
    public double getPrice() {
        return price;
    }
    public double getNetPrice() {
        return netPrice;
    }

    public static double storeValue(Product[] store){
        double value=0;
        for(Product s: store){
            value+=s.costOfProducts();
        }
        return value;
    }
    public double costOfProducts(){
        return this.price*this.amount;
    }
    public boolean sell(int amount){
        if(this.amount>=amount) {
            this.amount -= amount;
            return true;
        }
        return false;
    }
}
