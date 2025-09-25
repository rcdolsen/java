package pt.com.ricardo.exercises.oop.basic.student.average;

public class MakeStudentAttributes {

    public String name;
    public int age;
    public float grade1;
    public float grade2;
    public float grade3;
    public float average;
    public String situation;

    protected static Student fillValue(String name, int age, float grade1, float grade2, float grade3) {
        Student student = new Student();

        student.name = name;
        System.out.println("name: " + name);
        student.age = age;
        System.out.println("age: " + age);
        student.grade1 = grade1;
        System.out.println("grade1: " + grade1);
        student.grade2 = grade2;
        System.out.println("grade2: " + grade2);
        student.grade3 = grade3;
        System.out.println("grade3: " + grade3);

        student.average = Math.round(student.average() * 100.0f) / 100.0f;
        System.out.println("Average grade: " + student.average);

        student.situation = student.situation(student.average);
        System.out.println("Situation: " + student.situation);

        System.out.println();
        return student;
    }

    protected float average() {
        return (grade1 + grade2 + grade3)/3;
    }

    protected String situation(float grade) {
        if (grade < 10) {
            return "passed";
        }
        return "failed";
    }
}
