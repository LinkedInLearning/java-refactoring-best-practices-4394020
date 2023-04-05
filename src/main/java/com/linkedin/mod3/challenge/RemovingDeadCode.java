package com.linkedin.mod3.challenge;
//The following code has a method that is never called and an unused variable.
// Identify the dead code and suggest improvements.
public class RemovingDeadCode {
    private String name;

    public RemovingDeadCode(String name, int age) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void removeDeadCode() {
        // some code
    }

}
