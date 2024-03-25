package org.github.aastrandemma;

import org.github.aastrandemma.model.Burger;
import org.github.aastrandemma.model.Fries;
import org.github.aastrandemma.model.Meat;
import org.github.aastrandemma.model.OrderItem;

public class FastFoodApp {
    public static void main(String[] args) {
        Burger beefBurger = new Burger();
        Burger turkeyCheeseBurger = new Burger(Meat.TURKEY, true, false, true, false);

        Fries fries = new Fries();

        OrderItem order = new OrderItem();
        order.addItem(beefBurger);
        order.addItem(turkeyCheeseBurger);
        order.addItem(fries);

        order.displayItems();
    }
}