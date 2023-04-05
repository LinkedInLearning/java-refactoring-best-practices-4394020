package com.linkedin.mod3.exceptions;

public class EmptyCatchClause {
    public static void main(String[] args) {
        try {
            // code that may cause an exception
        } catch (Exception e) {
            // At least log the exception and its message
            System.err.println("Exception occurred: " + e.getMessage());
        }

    }
}
