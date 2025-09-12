package pt.com.ricardo.exercises.oop.basic.calculator;

import java.util.Scanner;

public class UserIn {
    static float num1;
    static float num2;

    public void in() {
        while (true) {
            Scanner scanner = new Scanner(System.in);

            System.out.println("Input the first number");
            String num1In = scanner.nextLine();
            System.out.println("Input the second number");
            String num2In = scanner.nextLine();

            try {
                num1 = Float.parseFloat(num1In);
                num2 = Float.parseFloat(num2In);
                scanner.close();
                break;

            } catch (Exception e) {
                System.out.println("Number not valid, please input a valid number");
            }
        }
    }
}
