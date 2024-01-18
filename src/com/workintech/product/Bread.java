package com.workintech.product;

public class Bread extends ProductForSale{

    private double weight;
    public Bread(String type, double price, String description) {
        super(type, price, description);
    }

    @Override
    public void showDetails() {
        System.out.println("Type: " + getType() + " Price: " + getPrice() + " Description: " + getDescription() + " Weight: " + weight);
    }
}
