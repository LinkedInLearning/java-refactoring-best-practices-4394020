package com.linkedin.mod4.solutions.three;

import com.linkedin.mod4.solutions.Employee;

import java.util.List;

public class PayrollService implements PayrollProcessor {
    private EmployeeService employeeService;
    private PayrollCalculator payrollCalculator;
    private TaxCalculator taxCalculator;
    private PayrollSaver payrollSaver;

    public PayrollService(EmployeeService employeeService, PayrollCalculator payrollCalculator, TaxCalculator taxCalculator, PayrollSaver payrollSaver) {
        this.employeeService = employeeService;
        this.payrollCalculator = payrollCalculator;
        this.taxCalculator = taxCalculator;
        this.payrollSaver = payrollSaver;
    }

    @Override
    public void processPayroll() {
        List<Employee> employees = employeeService.loadEmployees();
        for (Employee employee : employees) {
            double grossPay = payrollCalculator.calculateGrossPay(employee);
            double taxes = taxCalculator.calculateTaxes(employee, grossPay);
            double netPay = payrollCalculator.calculateNetPay(grossPay, taxes);
            PayStub payStub = new PayStub(employee, grossPay, taxes, netPay);
            payrollSaver.savePayrollData(payStub);
        }
    }
}
