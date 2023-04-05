package com.linkedin.mod3.challenge;

import java.sql.SQLException;

public class ExceptionHandling {
    // The following code uses a general exception handler instead of specific handlers
    // for each exception. It also swallows exceptions without logging them.
    // Identify the problem areas and make the improvements.
    public void doSomething() {
        try {
            // some code that might throw an exception
            throw new SQLException();
        } catch (Exception e) {
            // do nothing
        }
    }
}
