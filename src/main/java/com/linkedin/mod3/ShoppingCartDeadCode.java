package com.linkedin.mod3;

import java.util.ArrayList;
import java.util.List;

public class ShoppingCartDeadCode {
    private List<Product> products = new ArrayList<>();
    private double total;

    public ShoppingCartDeadCode(List<Product> products) {
        this.products = products;
        calculateTotalPrice();
    }

    public void addProduct(Product product) {
        products.add(product);
        calculateTotalPrice();
    }

    public void removeProduct(Product product) {
        products.remove(product);
        calculateTotalPrice();
    }

    public double getTotal() {
        return total;
    }

    public void printProducts() {
        for (Product product : products) {
            System.out.println(product.getName() + " - " + product.getPrice());
        }
    }

    // Old way of calculating the total
    private void calculateTotalPriceOld() {
        double newTotal = 0;
        for (Product product : products) {
            newTotal += product.getPrice() * 1.2;
        }
        total = newTotal;
    }

    private void calculateTotalPrice() {
        double newTotal = 0;
        for (Product product : products) {
            newTotal += product.getPrice() * 1.3;
        }
        total = newTotal;
    }
}



