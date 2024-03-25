package org.github.aastrandemma.model;

public class Fries extends Product {
    private Size size;
    private boolean spicy;
    private boolean sweetPotato;
    private boolean extraCrispy;

    public Fries() {
     super(Size.SMALL.getPrice(), Size.SMALL.getName());
     this.size = Size.SMALL;
    }

    public Fries(Size size, boolean spicy, boolean sweetPotato, boolean extraCrispy) {
        super(size.getPrice(), size.getName());
        this.size = size;
        this.spicy = spicy;
        this.sweetPotato = sweetPotato;
        this.extraCrispy = extraCrispy;
    }

    @Override
    public double calculateTax() {
        return getPrice() * 1.2;
    }

    @Override
    public String getDescription() {
        return super.getDescription() + ", Size: " + size + ", Spicy: " + spicy
                + ", Sweet Potato: " + sweetPotato + ", Extra Crispy: " + extraCrispy;
    }
}
