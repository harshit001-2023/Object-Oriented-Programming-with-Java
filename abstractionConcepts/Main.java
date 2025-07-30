package abstractionConcepts;

public class Main {
    public static void main(String[] args) {
        Car car = new Car();
        car.info();
        System.out.println("-------------");
        Bike bike = new Bike();
        bike.info();
        System.out.println("-------------");
        Bus bus = new Bus();
        bus.info();

    }
}
