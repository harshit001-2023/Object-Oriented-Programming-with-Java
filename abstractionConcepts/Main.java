package abstractionConcepts;

/**
 * Main class to demonstrate the vehicle hierarchy.
 */
public class Main {
    public static void main(String[] args) {
        // Create and display car details
        Car car = new Car();
        System.out.println("Car Details:");
        car.printDetails();

        System.out.println("\n-------------");

        // Create and display bike details
        Bike bike = new Bike();
        System.out.println("Bike Details:");
        bike.printDetails();

        System.out.println("\n-------------");

        // Create and display bus details
        Bus bus = new Bus();
        System.out.println("Bus Details:");
        bus.printDetails();
    }
}