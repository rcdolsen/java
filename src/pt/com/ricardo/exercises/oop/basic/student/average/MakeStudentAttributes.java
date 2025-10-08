package pt.com.ricardo.exercises.oop.basic.student.average;

import java.util.Arrays;

public class MakeStudentAttributes {

    private String name;
    private int age;
    private double[] grades = new double[]{0, 0, 0};
    private double average;
    private boolean situation;

    //    getters and setters start
    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public int getAge() {
        return age;
    }

    public void setGrades(double[] grades) {
        this.grades = grades;
    }

    public double[] getGrades() {
        return grades;
    }

    private void setAverage(double average) {
        this.average = average;
    }

    public double getAverage() {
        return average;
    }

    private void setSituation(boolean situation) {
        this.situation = situation;
    }

    public boolean isSituation() {
        return situation;
    }
//    getters and setters end

    public MakeStudentAttributes(String name, int age, double grade1, double grade2, double grade3) {

//        stores the data parsed in the object attributes
        this.setName(name);
        this.setAge(age);
        this.setGrades(new double[]{grade1, grade2, grade3});
        this.setAverage(Math.round(this.calculateAverage() * 10.0) / 10.0);
        this.setSituation(this.determineSituation(this.average));
    }

    //    iterates over the grades in the list and returns the average grade to the object`s average attribute
    protected double calculateAverage() {
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
    protected boolean determineSituation(double grade) {
        if (grade < 10) {
            return false;
        }
        return true;
    }

    // Show all student info
    public void showInfo() {
        System.out.println("name: " + this.getName());
        System.out.println("age: " + this.getAge());
        System.out.println(Arrays.toString(this.getGrades()));
        System.out.println("Average rounded grade: " + this.getAverage());
        if (this.isSituation()) System.out.println("Situation: passed");
        else System.out.println("Situation: failed");
        System.out.println();
    }
}
