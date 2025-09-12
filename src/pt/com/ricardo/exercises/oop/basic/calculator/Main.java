package pt.com.ricardo.exercises.oop.basic.calculator;

import java.util.Scanner;

public class Main extends Calculator {

    public static void main(String[] args) {

        UserIn userIn = new UserIn();
        userIn.in();

        System.out.println("The sum is: "
                + UserIn.num1 + " + " + UserIn.num2 + " = " + Calculator.sum);
        System.out.println("The subtraction is: "
                + UserIn.num1 + " + " + UserIn.num2 + " = " + Calculator.sub);

        System.out.println("The multiplication is: "
                + UserIn.num1 + " + " + UserIn.num2 + " = " + Calculator.mult);


        if (num2 == 0) {
            System.out.println("division by 0 not allowed");
        } else {
            System.out.println("The division is: "
                    + UserIn.num1 + " + " + UserIn.num2 + " = " + Calculator.div);

        }
    }
}
