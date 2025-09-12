package pt.com.ricardo.exercises.oop.basic.calculator;

public class Calculator extends UserIn{

            static Operations operations = new Operations();

            static float sum = operations.sum(UserIn.num1, UserIn.num2);
            static float sub = operations.sub(UserIn.num1, UserIn.num2);
            static float mult = operations.mult(UserIn.num1, UserIn.num2);
            static float div = operations.div(UserIn.num1, UserIn.num2);
        }
