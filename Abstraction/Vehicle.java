package Abstraction;

/**
 * Interface representing a generic vehicle.
 * Defines common behavior that all vehicles must implement.
 */
public interface Vehicle {
    /**
     * Describes the vehicle's engine specifications.
     * Must be implemented by concrete classes.
     */
    void engine();

    /**
     * Provides basic information about the vehicle type.
     * Default implementation can be overridden by implementing classes.
     */
    default void vehicleType() {
        System.out.println("Vehicle type: ");
    }
}