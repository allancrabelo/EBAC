import java.util.ArrayList;
import java.util.List;

/**
 * @class Car
 * @brief Base class for all cars
 */
class Car {
    private String model;
    private int year;

    public Car(String model, int year) {
        this.model = model;
        this.year = year;
    }

    public String getModel() {
        return model;
    }

    public int getYear() {
        return year;
    }

    @Override
    public String toString() {
        return model + " (" + year + ")";
    }
}

/**
 * @class Ferrari
 * @brief Subclass representing Ferrari cars
 */
class Ferrari extends Car {
    public Ferrari(String model, int year) {
        super(model, year);
    }
}

/**
 * @class Toyota
 * @brief Subclass representing Toyota cars
 */
class Toyota extends Car {
    public Toyota(String model, int year) {
        super(model, year);
    }
}

/**
 * @class Ford
 * @brief Subclass representing Ford cars
 */
class Ford extends Car {
    public Ford(String model, int year) {
        super(model, year);
    }
}

/**
 * @class CarList
 * @brief Generic list that can store any type of Car
 * @param <T> Type must be Car or its subclasses
 */
class CarList<T extends Car> {
    private List<T> cars;

    public CarList() {
        cars = new ArrayList<>();
    }

    public void add(T car) {
        cars.add(car);
    }

    public void showCars() {
        for (T car : cars) {
            System.out.println(car);
        }
    }
}

/**
 * @class Main
 * @brief Main program to test the generic car list
 */
public class Cars {
    public static void main(String[] args) {
        CarList<Car> list = new CarList<>();

        list.add(new Ferrari("F8 Spider", 2020));
        list.add(new Toyota("Corolla", 2022));
        list.add(new Ford("Mustang", 2021));

        System.out.println("List of cars:");
        list.showCars();
    }
}

