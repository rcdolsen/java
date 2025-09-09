package pt.com.ricardo.exercises.basic.exercises;

public class Days {
    public static void main(String[] args) {
        byte day = 93;
        String sex = "Q";

        switch (day) {
            case 1:
                System.out.println("Sunday. Good, I hope it`s sunny");
                break;
            case 2:
                System.out.println("Monday. That`s sad, things will get better");
                break;
            case 3:
                System.out.println("Tuesday. At least it's not monday");
                break;
            case 4:
                System.out.println("Wednesday. Middle of the week already");
                break;
            case 5:
                System.out.println("Thursday. We`re almost there");
                break;
            case 6:
                System.out.println("Friday. That`s it, weekend ahead");
                break;
            case 7:
                System.out.println("Saturday. Have a nice weekend");
                break;
            default:
                System.out.println("This day doesn`t exist, but it`s still better than monday");
        }

        switch (sex) {
            case "M":
                System.out.println("Male");
                break;
            case "F":
                System.out.println("Female");
                break;
            default:
                System.out.println("I`m a machine, I don`t understand other sexes");
        }

    }
}
