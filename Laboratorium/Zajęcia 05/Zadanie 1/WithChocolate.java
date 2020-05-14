package org.example;

public class WithChocolate extends CakeDecorator {

    public WithChocolate(Basic cake){
        super(cake);
    }
    public double getCost(){
        return super.getCost()+5;
    }
    public String getIngredients(){
        return super.getIngredients()+"czekolada ";

    }

}