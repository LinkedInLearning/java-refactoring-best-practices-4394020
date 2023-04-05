package com.linkedin.mod4.solutions.three;

import com.linkedin.mod4.solutions.Employee;

public class PayStub {
    private Employee employee;
    private double grossPay;
    private double taxes;
    private double netPay;

    public PayStub(Employee employee, double grossPay, double taxes, double netPay) {
        this.employee = employee;
        this.grossPay = grossPay;
        this.taxes = taxes;
        this.netPay = netPay;
    }

    public Employee getEmployee() {
        return employee;
    }

    public void setEmployee(Employee employee) {
        this.employee = employee;
    }

    public double getGrossPay() {
        return grossPay;
    }

    public void setGrossPay(double grossPay) {
        this.grossPay = grossPay;
    }

    public double getTaxes() {
        return taxes;
    }

    public void setTaxes(double taxes) {
        this.taxes = taxes;
    }

    public double getNetPay() {
        return netPay;
    }

    public void setNetPay(double netPay) {
        this.netPay = netPay;
    }
}






