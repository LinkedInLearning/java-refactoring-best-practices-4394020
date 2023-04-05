package com.linkedin.mod4.bloater.bad;

// some mock code to make the customer class compile
public class Order {
    private double total;
    private OrderStatus status;

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
}

class OrderStatus {

}