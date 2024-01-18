package com.workintech.product;

public class Chocolate extends ProductForSale{

    private int milkpercentage;

    public Chocolate(String type, double price, String description, int milkpercentage) {
        super(type, price, description);
        this.milkpercentage = milkpercentage;
    }

    @Override
    public void showDetails() {
        System.out.println("Type: " + getType() + " Price: " + getPrice() + " Description: " + getDescription() + " Milk Percentage: " + milkpercentage);
    }
}
