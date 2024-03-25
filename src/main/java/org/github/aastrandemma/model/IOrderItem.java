package org.github.aastrandemma.model;

public interface IOrderItem {
    int MAX_ITEMS = 10;
    void addItem(Product item);
    void removeItem(Product item);
    Product[] getItems();
    void displayItems();
    double calculateTotal();
    double calculateTotalWithTax();
}