package org.github.aastrandemma.model;

public enum Meat {
    BEEF(50, "Ground beef"),
    CHICKEN(50, "Minced chicken"),
    TURKEY(50, "Ground turkey"),
    PORK(50, "Ground pork"),
    VEGAN(50, "Plant-Based");

    private final double price;

    private final String name;

    Meat(double price, String name) {
        this.price = price;
        this.name = name;
    }

    public double getPrice() {
        return price;
    }

    public String getName() {
        return name;
    }
}