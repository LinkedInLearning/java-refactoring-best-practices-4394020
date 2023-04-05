package com.linkedin.mod2;

public class CurlyBrackets {
    public static void main(String[] args) {
        int x = 1;
        if (x > 0)
            System.out.println("x is positive");
            System.out.println("This line is not part of the if statement");

        if (x > 0) {
            System.out.println("x is positive");
            System.out.println("This line is part of the if statement");
        }

        if (x > 0)
        {
            System.out.println("x is positive");
        }

    }
}
