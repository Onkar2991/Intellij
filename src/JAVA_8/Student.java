package JAVA_8;

import java.util.Arrays;
import java.util.List;

public class Student {
    private String name;
    private double[] marks;

    public Student(String name, double[] marks) {
        this.name = name;
        this.marks = marks;
    }

    public String getName() {
        return name;
    }

    public double getAverageMarks() {
        return Arrays.stream(marks).average().orElse(0.0);
    }
}

 class AverageMarks {
    public static void main(String[] args) {
        List<Student> students = Arrays.asList(
                new Student("onkar", new double[]{50, 75, 70}),
                new Student("Saurabh", new double[]{10, 85, 50}),
                new Student("shubham", new double[]{10, 60, 65})
        );

        students.stream()
                .filter(student -> student.getAverageMarks() > 60)
                .map(Student::getName)
                .forEach(System.out::println);
    }
}
