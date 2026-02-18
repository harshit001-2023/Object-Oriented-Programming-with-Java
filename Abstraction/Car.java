package Abstraction;

/**
 * Concrete class representing a Car that implements NoiseLevel interface.
 */
public class Car implements NoiseLevel {
    @Override
    public void engine() {
        System.out.println("Engine Type: BS6");
    }

    @Override
    public void vehicleType() {
        System.out.println("Four Wheeler: Car");
    }

    /**
     * Prints complete information about this car
     */
    public void printDetails() {
        vehicleType();
        engine();
        lowNoise();
    }
}