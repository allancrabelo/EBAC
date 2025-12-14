/**
 * @file LuxuryFactory.java
 * @brief Factory for creating luxury cars.
 * Concrete factory for luxury cars.
 */
public class LuxuryFactory implements CarFactory {
    @Override
    public Car createCar() {
        return new LuxuryCar();
    }
}
