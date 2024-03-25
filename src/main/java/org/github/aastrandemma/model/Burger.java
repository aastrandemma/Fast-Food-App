package org.github.aastrandemma.model;

public class Burger extends Product {
    private Meat meat;
    private boolean cheese;
    private boolean lettuce;
    private boolean tomato;
    private boolean ketchup;
    // ToDo: add Dressing enum

    // ToDo: add more constructors
    public Burger() {
        super(Meat.BEEF.getPrice(), Meat.BEEF.getName());
        this.meat = Meat.BEEF;
    }

    public Burger(Meat meat, boolean cheese, boolean lettuce, boolean tomato, boolean ketchup) {
        super(meat.getPrice(), meat.getName());
        this.meat = meat;
        this.cheese = cheese;
        this.lettuce = lettuce;
        this.tomato = tomato;
        this.ketchup = ketchup;
    }

    @Override
    public double calculateTax() {
        return getPrice() * 1.1;
    }

    @Override
    public String getDescription() {
        return super.getDescription() + ", Cheese: " + cheese + ", Lettuce: " + lettuce
                + ", Tomato: " + tomato + ", Ketchup: " + ketchup;
    }
}