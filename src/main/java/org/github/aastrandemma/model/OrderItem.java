package org.github.aastrandemma.model;

import java.text.DecimalFormat;
import java.time.LocalDateTime;
import java.util.Arrays;
import java.util.UUID;

public class OrderItem implements IOrderItem {
    private final String orderId;
    private final LocalDateTime orderDate;
    private Product[] orderItems;
    private static final DecimalFormat df = new DecimalFormat("0.00");

    public OrderItem() {
        this.orderId = UUID.randomUUID().toString();
        this.orderDate = LocalDateTime.now();
        this.orderItems = new Product[0];
    }

    @Override
    public void addItem(Product item) {
        Product[] newItems = new Product[orderItems.length + 1];
        System.arraycopy(orderItems, 0, newItems, 0, orderItems.length);
        newItems[newItems.length - 1] = item;
        orderItems = newItems;
    }

    @Override
    public void removeItem(Product item) {
        Product[] newItems = new Product[orderItems.length - 1];
        System.arraycopy(orderItems, 0, newItems, 0, orderItems.length);
        int i = 0;
        for (Product food : orderItems) {
            if (!food.getName().equalsIgnoreCase(item.getName())) {
                newItems[i] = food;
                i++;
            }
        }
        orderItems = newItems;
    }

    @Override
    public Product[] getItems() {
        return Arrays.copyOf(orderItems, orderItems.length);
    }

    @Override
    public void displayItems() {
        int counter = 1;
        for (Product item : orderItems) {
            System.out.println("-----------ORDER[" + counter++ + "]-----------");
            System.out.println(item.getDescription());

        }
        System.out.println("#########################################");
        System.out.println("TOTAL ORDER Cost: " + df.format(calculateTotal()) + " SEK");
        System.out.println("TOTAL ORDER Cost with Tax: " + df.format(calculateTotalWithTax()) + " SEK");
        System.out.println("#########################################");
    }

    @Override
    public double calculateTotal() {
        double total = 0;
        for (Product item : orderItems) {
            total = total + item.getPrice();
        }
        return total;
    }

    @Override
    public double calculateTotalWithTax() {
        double totalTax = 0;
        for (Product item : orderItems) {
            totalTax = totalTax + item.calculateTax();
        }
        return totalTax;
    }

    public int getMaxItemNumber() {
        return MAX_ITEMS;
    }
}