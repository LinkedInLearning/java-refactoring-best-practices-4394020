package com.linkedin.mod3.exceptions;

import java.io.FileNotFoundException;
import java.io.IOException;

public class SpecificExceptions {
    public static void main(String[] args) {
        // not specific
        try {
            // code that may cause different exceptions
            throw new FileNotFoundException();
        } catch (Exception e) {
            // handle the Exception
        }

        // specific
        try {
            // code that may cause different exceptions
            throw new FileNotFoundException();
        } catch (FileNotFoundException e) {
            // handle the FileNotFoundException
        } catch (IOException e) {
            // handle the IOException
        }

    }
}
