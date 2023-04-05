package com.linkedin.mod3.solution;

import java.sql.SQLException;

public class ExceptionHandling {
    public void doSomething() {
        try {
            throw new SQLException();
        } catch (SQLException e) {
            // log the error
            System.out.println(e.getMessage());
        }
    }
}
