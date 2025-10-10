package pt.com.ricardo.exercises.oop.basic.student.average;


import java.util.Arrays;

public class Main {
    public static void main(String[] args) {

        MakeStudentAttributes[] students = new MakeStudentAttributes[6];

//        Parse the students data to the MakeStudentsAttributes class to stores it in objects in an array
        students[0] = new MakeStudentAttributes("Ricardo", 37, 8, 10, 15);
        students[1] = new MakeStudentAttributes("Theo", 2, 20, 15, 18);
        students[2] = new MakeStudentAttributes("Mozuda", 38, 8, 0, 2.5);
        students[3] = new MakeStudentAttributes("Round Test", 0, 9.999999, 9.99, 9.99);
        students[4] = new MakeStudentAttributes("Overload test 1", "123456789");
        students[5] = new MakeStudentAttributes("Overload test 2", 10, 10, 10, 10, "987654321");

//        iterates over the array with the students data to show all of their info
        for (MakeStudentAttributes student : students) {
            student.showInfo();
        }

    }
}
