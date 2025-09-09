package pt.com.ricardo.exercises.basic.exercises;

public class AllPair {

    public static void main(String[] args) {

        int limit = 100000;
//        for (int number = 0; number <= limit; number++) {
//            int rest = number % 2;
//
//            if (rest == 0) {
//                System.out.println(number);
//            }
//        }

//        or

//        boolean pair = false;
//        for (int number = 0; number <= limit; number++) {
//            pair = !pair;
//
//            if (pair) {
//                System.out.println(number);
//            }
//        }

        int number = 0;
        while (number <= limit) {
            int rest = number % 2;

            if (rest == 0) {
                System.out.println(number);
            }

            number++;
        }
    }
}
