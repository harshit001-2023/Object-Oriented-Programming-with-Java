package Abstraction;

/**
 * Concrete class representing a Bike that implements NoiseLevel interface.
 */
public class Bike implements NoiseLevel {
    @Override
    public void engine() {
        System.out.println("BS4");
        System.out.println("Latest Two Wheeler Engine, 125cc");
    }

    @Override
    public void vehicleType() {
        System.out.println("Two Wheeler: Bike");
    }

    /**
     * Prints complete information about this bike
     */
    public void printDetails() {
        vehicleType();
        engine();
        mediumNoise();
    }
}