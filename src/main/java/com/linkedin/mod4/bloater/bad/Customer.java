package com.linkedin.mod4.bloater.bad;

import java.util.ArrayList;
import java.util.List;

public class Customer {
    private String name;
    private String email;
    private String address;
    private String city;
    private String country;
    private List<Order> orders;

    public Customer(String name, String email, String address, String city, String country, List<Order> orders) {
        this.name = name;
        this.email = email;
        this.address = address;
        this.city = city;
        this.country = country;
        this.orders = orders;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    public List<Order> getOrders() {
        return orders;
    }

    public void setOrders(List<Order> orders) {
        this.orders = orders;
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
        // also sending an email here, logic omitted

    }

    public double calculateTotalRevenue() {
        double totalRevenue = 0.0;
        for (Order order : orders) {
            totalRevenue += order.getTotal();
        }
        return totalRevenue;
    }

    public List<Order> getOrdersByStatus(OrderStatus status) {
        List<Order> result = new ArrayList<>();
        for (Order order : orders) {
            if (order.getStatus() == status) {
                result.add(order);
            }
        }
        // also sending an email here, logic omitted
        return result;
    }


}
