package com.linkedin.mod4.bloater.refactored;

import java.util.List;

public class ShoppingBasket {
    private List<Item> items;
    private OrderManager orderManager;

    public List<Item> getItems() {
        return items;
    }

    public void setItems(List<Item> items) {
        this.items = items;
    }

    public OrderManager getOrderManager() {
        return orderManager;
    }

    public void setOrderManager(OrderManager orderManager) {
        this.orderManager = orderManager;
    }

    public void checkout() {
        Order order = new Order(this.getItems());
        orderManager.addOrder(order);
    }
}
