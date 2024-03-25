package org.github.aastrandemma.model;

public enum Size {
    SMALL(10, "Small"),
    MEDIUM(15, "Medium"),
    LARGE(20, "Large");

    private final double price;
    private final String name;

    Size(double price, String name) {
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