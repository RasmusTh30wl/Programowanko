package org.example;

public interface Order {
    public String ordered(int limit);
    public double costOfProducts();
    public boolean sell(int amount);
}
