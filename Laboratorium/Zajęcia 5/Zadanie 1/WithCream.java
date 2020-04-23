package org.example;

public class WithCream extends CakeDecorator {

    public WithCream(Basic cake) {
        super(cake);
    }

    public double getCost() {
        return super.getCost() + 4;
    }

    public String getIngredients() {
        return super.getIngredients() + "krem ";

    }
}
