import java.util.*;

class Main55 {
    public static void main(String[] args) {
        // Write your code here
        Vehicle.displayCategory();
        Car car = new Car();
        car.startEngine();
    }
}

abstract class Vehicle{
    public Vehicle(){

    }

    public static void displayCategory(){
        IO.println("This is a vehicle.");
    }

    abstract void startEngine();
}

class Car extends Vehicle{
    void startEngine(){
        IO.println("Car engine started.");
    }
}
