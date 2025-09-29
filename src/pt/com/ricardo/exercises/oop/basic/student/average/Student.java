package pt.com.ricardo.exercises.oop.basic.student.average;


public class Student extends MakeStudentAttributes {
    public static void main(String[] args) {

        Student student1 = new Student();
        Student student2 = new Student();
        Student student3 = new Student();

        student1 = fillValue("Ricardo", 37, 8, 10, 15);
        student2 = fillValue("Theo", 2, 20, 15, 18);
        student3 = fillValue("Mozuda", 38, 8, 0, 2.5);
        student3 = fillValue("Test", 0, 9.999999, 9.99, 9.99);

    }
}
