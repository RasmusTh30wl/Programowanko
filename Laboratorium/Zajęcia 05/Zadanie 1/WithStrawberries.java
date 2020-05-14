package org.example;

public class WithStrawberries extends CakeDecorator {

    public WithStrawberries(Basic cake){
        super(cake);
    }
    public double getCost(){
        return super.getCost()+2;
    }
    public String getIngredients(){
        return super.getIngredients()+"truskawki ";

    }

}
