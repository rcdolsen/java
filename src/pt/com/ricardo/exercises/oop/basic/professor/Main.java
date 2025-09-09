package pt.com.ricardo.exercises.oop.basic.professor;

public class Main {

    public static void main(String[] args) {
        Professor ricardo = new Professor();
        ricardo.name = "Ricardo";
        ricardo.ccNumber = 123456789;
        ricardo.nif = 987654321;
        ricardo.registrationNumber = 1234;

        System.out.println("Professor: " + ricardo.name);
        System.out.println("NIF: " + ricardo.nif);
        System.out.println("Registration Number: " + ricardo.registrationNumber);
        System.out.println("CC: " + ricardo.ccNumber);
    }
}