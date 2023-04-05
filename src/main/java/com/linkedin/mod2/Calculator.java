package com.linkedin.mod2;

public class Calculator {
    private int sum;

    public void calculateSum(int limit) {
        for (int i = 0; i < limit; i++) {
            sum += i;
        }
        System.out.println("Sum: " + sum);
    }
}
