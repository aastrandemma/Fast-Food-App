package org.github.aastrandemma.model;

import java.text.DecimalFormat;

public abstract class Product {
    private double price;
    private String name;
    private static final DecimalFormat df = new DecimalFormat("0.00");

    public Product(double price, String name) {
        this.price = price;
        setName(name);
    }

    public void setName(String name) {
        if (name == null) throw new IllegalArgumentException("Name is null.");
        this.name = name;
    }

    public double getPrice() {
        return price;
    }

    public String getName() {
        return name;
    }

    public String getDescription() {
        return "Item: " + name + ", Price: " + df.format(price) + " SEK";
    }

    public abstract double calculateTax();
}