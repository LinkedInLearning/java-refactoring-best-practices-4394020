package com.linkedin.mod2;

public class Employee {
    public static final int MAX_HOURS_PER_WEEK = 40;

    private String firstName;
    private String lastName;
    private int employeeId;
    private double hourlyRate;
    private int hoursWorked;

    public Employee(String firstName, String lastName, int employeeId, double hourlyRate) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.employeeId = employeeId;
        this.hourlyRate = hourlyRate;
    }

    public String getFullName() {
        return firstName + " " + lastName;
    }

    public int getEmployeeId() {
        return employeeId;
    }

    public double getHourlyRate() {
        return hourlyRate;
    }

    public void setHourlyRate(double hourlyRate) {
        this.hourlyRate = hourlyRate;
    }

    public int getHoursWorked() {
        return hoursWorked;
    }

    public void setHoursWorked(int hoursWorked) {
        if (hoursWorked <= MAX_HOURS_PER_WEEK) {
            this.hoursWorked = hoursWorked;
        } else {
            throw new IllegalArgumentException("Hours worked exceeds maximum allowed");
        }
    }

    public String getPayDetails() {
        return "Employee " + employeeId + " earned $" + calculatePay();
    }

    private double calculatePay() {
        return hourlyRate * hoursWorked;
    }
}

