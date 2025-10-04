package pt.com.ricardo.exercises.oop.basic.student.average;

import java.util.Arrays;

public class MakeStudentAttributes {

    private String name;
    private int age;
    private double[] grades = new double[] {0, 0, 0};
    private double average;
    private String situation;

    public MakeStudentAttributes(String name, int age, double grade1, double grade2, double grade3) {

//        stores the data parsed in the object attributes
        this.name = name;
        this.age = age;
        this.grades = new double[]{grade1, grade2, grade3};
        this.average = Math.round(this.average() * 10.0) / 10.0;
        this.situation = this.situation(this.average);
    }

    //    iterates over the grades in the list and returns the average grade to the object`s average attribute
    protected double average() {
        double average = 0;
        int i = 0;

        for (double grade : grades) {
            average += grade;
            i++;
        }
        if (i > 0) return average / i;
        else return 0;
    }

    //    Uses the average grade to show if the student has passed or failed
    protected String situation(double grade) {
        if (grade < 10) {
            return "failed";
        }
        return "passed";
    }

    //    Method to show the students stored info
    protected void showInfo() {
        System.out.println("name: " + name);
        System.out.println("age: " + age);
        System.out.println(Arrays.toString(this.grades));
        System.out.println("Average rounded grade: " + this.average);
        System.out.println("Situation: " + this.situation);

        System.out.println();
    }
}
