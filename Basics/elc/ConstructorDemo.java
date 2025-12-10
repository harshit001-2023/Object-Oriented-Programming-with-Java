package Basics.elc;

import Basics.blc.Car;

public class ConstructorDemo {
    static void main() {
        String model = IO.readln("Enter Car model: ");
        int year = Integer.parseInt(IO.readln("Enter Car Manufacturing year: "));
        double price = Double.parseDouble(IO.readln("Enter Car Price: "));

        Car car = new Car(model, year, price);
        IO.println(car);
    }
}
