/**
 * @file PopularFactory.java
 * @brief Factory for creating popular cars.
 * Concrete factory for popular cars.
 */
public class PopularFactory implements CarFactory {
    @Override
    public Car createCar() {
        return new PopularCar();
    }
}