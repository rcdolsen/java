package pt.com.ricardo.exercises.basic.exercises;

import java.util.Scanner;

public class FirstExercise {
    public static void main(String[] args) {
        Scanner userInput = new Scanner(System.in);

        System.out.println("What's your name?");
        String name = userInput.nextLine();

        System.out.println("What's your address?");
        String address = userInput.nextLine();

        System.out.println("What's your phone number?");
        String phoneNumber = userInput.nextLine();

        System.out.println("What's your salary?");
        String salary = userInput.nextLine();

        String sex;
        while (true) {
            System.out.println("What's your sex (M or F)?");
            sex = userInput.nextLine();
            String upperSex = sex.toUpperCase();
            if (upperSex.equals("M")) {
                sex = "Male";
                break;
            }
            if (upperSex.equals("F")) {
                sex = "Female";
                break;
            }
            System.out.println("Please input only M for male or F for female");
        }
        System.out.println("What's your marital status?");
        String marital = userInput.nextLine();

        System.out.println("What's your age?");
        String age = userInput.nextLine();

        userInput.close();

        System.out.println("Employee " + name + " is a " + sex + " with " + age + " years old, " + marital +
                " who lives at " + address + ", With phone number: " + phoneNumber + " and a salary of: " + salary);
    }
}