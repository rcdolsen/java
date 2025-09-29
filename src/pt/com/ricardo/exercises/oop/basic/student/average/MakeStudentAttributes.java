package pt.com.ricardo.exercises.oop.basic.student.average;

import java.util.Arrays;

public class MakeStudentAttributes {

    public String name;
    public int age;
    public double[] grades = new double[3];
    public double average;
    public String situation;

    protected static Student fillValue(String name, int age, double grade1, double grade2, double grade3) {
        Student student = new Student();

        student.name = name;
        System.out.println("name: " + name);
        student.age = age;
        System.out.println("age: " + age);
        student.grades[0] = grade1;
        student.grades[1] = grade2;
        student.grades[2] = grade3;
        System.out.println(Arrays.toString(student.grades));

        student.average = Math.round(student.average() * 100.0) / 100.0;
        System.out.println("Average grade: " + student.average);

        student.situation = student.situation(student.average);
        System.out.println("Situation: " + student.situation);

        System.out.println();
        return student;
    }

    protected double average() {
        return (grades[0] + grades[1] + grades[2])/3;
    }

    protected String situation(double grade) {
        if (grade < 10) {
            return "failed";
        }
        return "passed";
    }
}
