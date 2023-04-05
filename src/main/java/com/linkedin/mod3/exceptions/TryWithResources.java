package com.linkedin.mod3.exceptions;

import java.io.FileInputStream;
import java.io.IOException;

public class TryWithResources {
    public static void main(String[] args) {
        try (FileInputStream fis = new FileInputStream("file.txt")) {
            // code to read from the file
        } catch (IOException e) {
            // handle the IOException
        }

    }
}
