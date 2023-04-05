package com.linkedin.mod2.challenge;

public class someClass {
    public String Name;
    public int age;
    public double[] nrs;

    public someClass(String Name, int age, double[] nrs) {
        this.Name = Name;
        this.age = age;
        this.nrs = nrs;
    }

    public double Calculate() {
        double sum = 0;
        for (int i = 0; i < nrs.length; i++) {
            sum += nrs[i];
        }
        double average = sum / nrs.length;
        if (average >= 90) {
            return 4.0;
        } else if (average >= 80) {
            return 3.0;
        } else if (average >= 70) {
            return 2.0;
        } else if (average >= 60) {
            return 1.0;
        } else {
            return 0.0;
        }
    }
}

