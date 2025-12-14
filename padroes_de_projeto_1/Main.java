/**
 * @file Main.java
 * @brief Main class to demonstrate the Abstract Factory pattern.
 * Demonstrates creating cars using Abstract Factory.
 */
public class Main {

    public static void main(String[] args) {

        CarFactory popularFactory = new PopularFactory();
        Car popularCar = popularFactory.createCar();
        popularCar.showInfo();

        CarFactory luxuryFactory = new LuxuryFactory();
        Car luxuryCar = luxuryFactory.createCar();
        luxuryCar.showInfo();
    }
}
