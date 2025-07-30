package abstractionConcepts;

/**
 * Interface extending Vehicle to add noise level capabilities.
 * Provides default implementations for different noise levels.
 */
public interface NoiseLevel extends Vehicle {
    /**
     * Default implementation for low noise level
     */
    default void lowNoise() {
        System.out.println("Low Noise Level Vehicle");
    }

    /**
     * Default implementation for medium noise level
     */
    default void mediumNoise() {
        System.out.println("Medium Noise Level Vehicle");
    }

    /**
     * Default implementation for high noise level
     */
    default void highNoise() {
        System.out.println("High Noise Level Vehicle");
    }
}