package com.linkedin.mod4.solutions.one;

import com.linkedin.mod4.solutions.Order;

public class CheckoutController {

    public void processOrder(Order order) {
        double totalAmount = calculateTotalAmount(order);
        double discountedAmount = applyDiscounts(totalAmount, order);
        processPayment(discountedAmount, order);
        sendConfirmationEmails(order);
        updateInventory(order);
        updateOrderStatus(order);
    }

    private double calculateTotalAmount(Order order) {
        // Calculate the total amount
        // Return the calculated amount
        return 1.0;
    }

    private double applyDiscounts(double totalAmount, Order order) {
        // Apply any discounts to the total amount
        // Return the discounted amount
        return 1.0;
    }

    private void processPayment(double amount, Order order) {
        // Process the payment for the order
    }

    private void sendConfirmationEmails(Order order) {
        // Send confirmation emails to the customer and vendor
    }

    private void updateInventory(Order order) {
        // Update the inventory based on the ordered items
    }

    private void updateOrderStatus(Order order) {
        // Update the order status to "completed" or the appropriate status
    }
}


