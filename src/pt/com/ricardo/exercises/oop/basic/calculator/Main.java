package pt.com.ricardo.exercises.oop.basic.calculator;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        float num1;
        float num2;
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
        System.out.println("the first number is: " + num1);
        System.out.println("the second number is: " + num2);
        System.out.println();

    Operations operations = new Operations();

        float sum = operations.sum(num1,num2);
        float sub = operations.sub(num1,num2);
        float mult = operations.mult(num1,num2);
        float div = operations.div(num1,num2);

        System.out.println("The sum is: "
                + num1 + " + " + num2 + " = " + sum);
        System.out.println("The subtraction is: "
                + num1 + " - " + num2 + " = " + sub);
        System.out.println("The multiplication is: "
                + num1 + " * " + num2 + " = " + mult);
        System.out.println("The division is: "
                + num1 + " / " + num2 + " = " + div);
    }
}
