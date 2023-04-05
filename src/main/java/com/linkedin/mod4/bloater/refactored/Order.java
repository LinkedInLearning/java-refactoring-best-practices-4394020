package com.linkedin.mod4.bloater.refactored;

import java.time.LocalDate;
import java.util.List;

// some mock code to make the customer class compile
public class Order {
    private double total;
    private LocalDate orderDate;
    private OrderStatus status;

    private List<Item> items;
    private boolean international;


    public Order(List<Item> items) {
        this.items = items;
    }

    public double getTotal() {
        return total;
    }

    public void setTotal(double total) {
        this.total = total;
    }

    public OrderStatus getStatus() {
        return status;
    }

    public void setStatus(OrderStatus status) {
        this.status = status;
    }

    public LocalDate getOrderDate() {
        return orderDate;
    }

    public void setOrderDate(LocalDate orderDate) {
        this.orderDate = orderDate;
    }

    public List<Item> getItems() {
        return items;
    }

    public void setItems(List<Item> items) {
        this.items = items;
    }

    public boolean isInternational() {
        return international;
    }

    public void setInternational(boolean international) {
        this.international = international;
    }
}

class OrderStatus {

}