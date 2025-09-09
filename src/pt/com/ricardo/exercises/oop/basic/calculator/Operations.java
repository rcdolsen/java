package pt.com.ricardo.exercises.oop.basic.calculator;

public class Operations {
    public float sum(float num1, float num2) {
        return num1 + num2;
    }

    public float sub(float num1, float num2) {
        return num1 - num2;
    }

    public float mult(float num1, float num2) {
        return num1 * num2;
    }

    public float div(float num1, float num2) {
//        if (num2 == 0) {
//            throw new ArithmeticException("Division by 0 error");
//        }
        try {
            return num1/num2;
        }
        catch (Exception e) {
            System.out.println("Division by 0 error");
            return 0;
        }
    }
}
