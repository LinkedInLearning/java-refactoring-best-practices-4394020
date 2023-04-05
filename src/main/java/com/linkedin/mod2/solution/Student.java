package com.linkedin.mod2.solution;

public class Student {
    private final String name;
    private final int age;
    private final double[] grades;

    public Student(String name, int age, double[] grades) {
        this.name = name;
        this.age = age;
        this.grades = grades;
    }

    public double calculateAverageGrade() {
        if (grades.length == 0) {
            throw new IllegalStateException("Grades cannot be empty.");
        }
        double sum = 0;
        for (double grade : grades) {
            sum += grade;
        }
        return sum / grades.length;
    }

    public double calculateGpa() {
        double averageGrade = calculateAverageGrade();
        if (averageGrade >= 90) {
            return 4.0;
        } else if (averageGrade >= 80) {
            return 3.0;
        } else if (averageGrade >= 70) {
            return 2.0;
        } else if (averageGrade >= 60) {
            return 1.0;
        } else {
            return 0.0;
        }
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public double[] getGrades() {
        return grades.clone();
    }
}



