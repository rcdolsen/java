package pt.com.ricardo.exercises.basic.exercises;

public class Installment {
    public static void main(String[] args) {
        float carCost = 30000.00f;
        int installmentNumber = 1;
        float installmentCost = 30000.00f;
        float installmentLimit = 1000.00f;

        while (installmentCost > 1000) {
            System.out.println("You can buy the car for " + installmentCost + " in " + installmentNumber + " installments");
            installmentNumber += 1;
            installmentCost = carCost/installmentNumber;
        }
    }
}
