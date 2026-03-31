package Threads.Synchronization.PetorlPumpSimulation;

public class PetrolPump {

    /**
     * A synchronized method simulating the process of refilling a car at the petrol pump.
     * Only one car (thread) can execute this method at a time due to the 'synchronized' keyword,
     * ensuring a single-pump simulation.
     *
     * @param carName The name of the car being refilled.
     */
    public synchronized void refillCar(String carName) {
        // Print message when the car starts refilling
        System.out.println(carName + " started refilling...");

        try {
            // Simulate the time it takes to refill the car (e.g., 3 seconds)
            Thread.sleep(3000);
        } catch (InterruptedException e) {
            // Handle potential interruptions to the sleep operation
            Thread.currentThread().interrupt(); // Restore the interrupt flag
            System.out.println(carName + " refilling was interrupted.");
        }

        // Print message when the car completes refilling
        System.out.println(carName + " completed refilling!");
    }
}

