package pt.com.ricardo.exercises.oop.basic.staticex.cars;

public class Cars {
    private String name;
    private double maxSpeed;
    private static double speedLimit;

    static {
        Cars.speedLimit = 120;
        System.out.println("Speed limit is set to: " + speedLimit);
    }

    {
        System.out.println("New car object created");
    }

    public Cars(String name, double maxSpeed) {
        this.setName(name);
        this.setMaxSpeed(maxSpeed);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getMaxSpeed() {
        return maxSpeed;
    }

    public void setMaxSpeed(double maxSpeed) {
        this.maxSpeed = maxSpeed;
    }

    public static void setSpeedLimit(double speedLimit) {
        Cars.speedLimit = speedLimit;
        System.out.println("Speed limit changed to: " + Cars.speedLimit);
    }

    public static double getSpeedLimit() {
        return speedLimit;
    }

    public void showInfo() {
        System.out.println(' ');
        System.out.println("Car brand: " + this.getName());
        System.out.println("Max speed: " + this.getMaxSpeed());
        System.out.println("Speed limit: " + Cars.getSpeedLimit());
    }
}
