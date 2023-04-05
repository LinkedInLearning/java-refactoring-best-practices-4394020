package com.linkedin.mod3.exceptions;

import java.io.IOException;

public class MeaningfulMessage {
    public static void main(String[] args) {
        try {
            // code that may cause an exception
            throw new IOException();
        } catch (IOException e) {
            System.err.println("Error: Unable to read the file. Please ensure the file exists and has the correct permissions.");
        }

    }
}
