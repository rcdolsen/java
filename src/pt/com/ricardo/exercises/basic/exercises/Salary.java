package pt.com.ricardo.exercises.basic.exercises;

import java.util.Scanner;

public class Salary {

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        float salary;
        float result;
        String input;
        float tax;

//        while (true) {
//            System.out.println("What`s your salary?");
//            input = s.nextLine();
//
//            try {
//                salary = Float.parseFloat(input);
//                System.out.println(input + " is a valid number");
//                break;
//            } catch (NumberFormatException e) {
//                System.out.println(input + " is not a valid number, " + "please input a valid number");
//            }
//        }

//        or

        do {
            System.out.println("What`s your salary?");
            input = s.nextLine();

            try {
                salary = Float.parseFloat(input);
                System.out.println(input + " is a valid number");
                break;
            } catch (NumberFormatException e) {
                System.out.println(input + " is not a valid number, " + "please input a valid number");
            }
        } while (true);

        s.close();

        if (salary < 1000) tax = 0.05F;
        else if (salary >= 1000 && salary < 2000) tax = 0.1F;
        else if (salary >= 2000 && salary < 4000) tax = 0.15F;
        else tax = 0.2F;

        result = salary - (salary * tax);

        System.out.println("Your salary is: " + salary);
        System.out.println("Your tax is: " + tax);
        System.out.println("Your discounted salary is: " + result);
    }
}
