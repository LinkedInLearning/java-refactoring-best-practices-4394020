package com.linkedin.mod2;

public class myClass {
    private int a;

    public void F(int b) {
        for (int i = 0; i < b; i++) {
            a += i;
        }
        System.out.println("a: " + a);
    }
}
