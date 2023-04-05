package com.linkedin.mod3.exceptions;

import java.io.FileInputStream;
import java.io.IOException;

public class CheckSuppressedExceptions {
    public static void main(String[] args) {
        try (FileInputStream fis = new FileInputStream("file.txt")) {
            // code to read from the file
        } catch (IOException e) {
            for (Throwable suppressedException : e.getSuppressed()) {
                System.err.println("Suppressed exception: " + suppressedException.getMessage());
            }
        }
    }
}
