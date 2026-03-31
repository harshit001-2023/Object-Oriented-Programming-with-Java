import Threads.Synchronization.PetorlPumpSimulation.Car;
import Threads.Synchronization.PetorlPumpSimulation.PetrolPump;

void main() {
    // Create the shared resource
    PetrolPump sharedPump = new PetrolPump();

    // Create an array of Car objects
    Car[] cars = {
            new Car("Sedan", sharedPump),
            new Car("SUV", sharedPump),
            new Car("Truck", sharedPump),
            new Car("Hatchback", sharedPump)
    };

    // Create and initialize Thread objects for each car
    Thread[] threads = new Thread[cars.length];
    for (int i = 0; i < cars.length; i++) {
        threads[i] = new Thread(cars[i]);
    }

    // Start each car thread
    for (Thread thread : threads) {
        thread.start();
    }

    // Wait for all threads to complete
    for (Thread thread : threads) {
        try {
            thread.join();
        } catch (InterruptedException e) {
            System.err.println("Main thread interrupted.");
        }
    }

    System.out.println("Simulation finished: All cars have refilled.");
}