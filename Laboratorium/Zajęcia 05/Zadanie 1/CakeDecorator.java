package org.example;

abstract class CakeDecorator extends Basic {
    protected  Basic cake;
    public CakeDecorator(Basic cake){
        this.cake=cake;
    }

    @Override
    public double getCost() {
        return cake.getCost();
    }

    @Override
    public String getIngredients() {
        return cake.getIngredients();
    }
}
