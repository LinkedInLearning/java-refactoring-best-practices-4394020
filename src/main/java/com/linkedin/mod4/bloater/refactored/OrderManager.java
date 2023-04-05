package com.linkedin.mod4.bloater.refactored;

import java.util.ArrayList;
import java.util.List;

public class OrderManager {
    private List<Order> orders;

    public OrderManager() {
        this.orders = new ArrayList<>();
    }

    public void addOrder(Order order) {
        orders.add(order);
    }

    public void removeOrder(Order order) {
        orders.remove(order);
    }

    public void updateOrder(Order order) {
        int index = orders.indexOf(order);
        orders.set(index, order);
    }

    public double calculateTotalRevenue() {
        double totalRevenue = 0.0;
        for (Order order : orders) {
            totalRevenue += order.getTotal();
        }
        return totalRevenue;
    }

    public boolean isInternational() {
        for (Order order : orders) {
            if (order.isInternational()) {
                return true;
            }
        }
        return false;
    }

    public void printOrderHistory() {
        orders.forEach(order -> printOrderDetails(order));
    }

    private void printOrderDetails(Order order) {
        System.out.println("Order Date: " + order.getOrderDate());
        System.out.println("Order Total: " + order.getTotal());
        order.getItems().forEach(item -> printItemDetails(item));
    }

    private void printItemDetails(Item item) {
        System.out.println("Item Name: " + item.getName());
        System.out.println("Item Price: " + item.getPrice());
        System.out.println("Item Quantity: " + item.getQuantity());
    }

    // getters and setters omitted for brevity
}

