package org.designpatterns.strategy;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ShoppingCart {
    private List<Item> items;
    private int total;

    public int getTotal() {
        return total;
    }

    public void setTotal(int total) {
        this.total = total;
    }

    public ShoppingCart() {
        this.items = new ArrayList<Item>();
    }

    public void addItem(Item item) {
        items.add(item);
    }

    public void removeItem(Item item) {
        if (items.size() != 0)
            items.remove(item);
        else {
            System.out.println("Cart is empty");
        }
    }

    public void dispayCart() {
        for (Item item : this.items) {
            System.out.println(item.toString());
        }
    }

    public void calculateTotal() {
        for (Item item : this.items) {
            total = total + item.getPrice();
        }
        this.setTotal(total);
    }

    public void pay(PaymentStrategy pay) {
        pay.pay(this.getTotal());

    }

}
