package abstractionConcepts;

/**
 * Concrete class representing a Bus that implements NoiseLevel interface.
 */
public class Bus implements NoiseLevel {
    @Override
    public void engine() {
        System.out.println("BS6");
        System.out.println("30 ltrs, Latest Engine for Buses");
    }

    @Override
    public void vehicleType() {
        System.out.println("Four Wheeler: Bus");
    }

    /**
     * Prints complete information about this bus
     */
    public void printDetails() {
        vehicleType();
        engine();
        highNoise();
    }
}