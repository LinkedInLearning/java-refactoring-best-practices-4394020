package com.linkedin.mod3.exceptions;

public class GlobalHandler {
    public static void main(String[] args) {
        Thread.setDefaultUncaughtExceptionHandler((thread, throwable) -> {
            System.err.println("An uncaught exception occurred in thread " + thread.getName() + ": " + throwable.getMessage());
        });

        // Your application code
    }
}

