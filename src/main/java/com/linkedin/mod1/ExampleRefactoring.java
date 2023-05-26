package com.linkedin.mod1;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ExampleRefactoring {
    public static void main(String[] args) {
        List<String> names = new ArrayList<>(Arrays.asList("Bobby", "Suki", "Wiesje"));
        names.forEach(new Consumer<String>() {
            @Override
            public void accept(String s) {
                System.out.println(s);
            }
        });
    }

}
