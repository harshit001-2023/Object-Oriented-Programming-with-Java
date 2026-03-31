package Threads.Synchronization.PetorlPumpSimulation;

public class Car implements Runnable {
    private String carName;
    private PetrolPump petrolPump;

    public Car(String carName, PetrolPump petrolPump) {
        this.carName = carName;
        this.petrolPump = petrolPump;
    }

    @Override
    public void run() {
        // Calling the synchronized method on the shared PetrolPump instance
        petrolPump.refillCar(carName);
    }
}

