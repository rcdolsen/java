package pt.com.ricardo.exercises.oop.basic.staticex.cars;

public class Main {

    public static void main(String[] args) {

        Cars[] car = new Cars[3];

        car[0] = new Cars("BMW", 220);
        car[1] = new Cars("Mercedes", 230);
        car[2] = new Cars("Porsche", 300);

        showAllInfo(car);
        Cars.setSpeedLimit(100);
        showAllInfo(car);

    }
    public static void showAllInfo(Cars[] cars) {
        for (Cars c : cars) {
            c.showInfo();
        }
    }
}
