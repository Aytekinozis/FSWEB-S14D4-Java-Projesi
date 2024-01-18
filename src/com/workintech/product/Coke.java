package com.workintech.product;

public class Coke extends ProductForSale{

    private String brand;

    public Coke(String type, double price, String description, String brand) {
        super(type, price, description);
        this.brand = brand;
    }

    @Override
    public void showDetails() {
        System.out.println("Type: " + getType() + " Price: " + getPrice() + " Description: " + getDescription() + " Brand: " + brand);
    }
}
