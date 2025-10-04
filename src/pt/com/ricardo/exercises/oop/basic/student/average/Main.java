package pt.com.ricardo.exercises.oop.basic.student.average;


public class Main {
    public static <students> void main(String[] args) {

        MakeStudentAttributes[] students = new MakeStudentAttributes[4];
        int i = 0;

//        Parse the students data to the MakeStudentsAttributes class to stores it in objects in an array
        students[0] = new MakeStudentAttributes("Ricardo", 37, 8, 10, 15);
        students[1] = new MakeStudentAttributes("Theo", 2, 20, 15, 18);
        students[2] = new MakeStudentAttributes("Mozuda", 38, 8, 0, 2.5);
        students[3] = new MakeStudentAttributes("Test", 0, 9.999999, 9.99, 9.99);

//        iterates over the array with the students data created to show all of their info
        for (MakeStudentAttributes student : students) {

            students[i].showInfo();
            i += 1;
        }
    }
}
