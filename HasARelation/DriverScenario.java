/*Assignment 03 :
--------------

Change the Driver scenario.

Scenario Description :-
------------------------
This is a scenario based program on Copy Constructor and Deep copy concept (another object) with HAS-A realtion.

It describes that if we create another object by using copy constructor and deep copy concept then Modification done in first object will not reflect another object that means another object will remain unchanged.

Coding Requirements :
=====================
Create a BLC class called Driver with the following private non static fields:

-> name;
-> age;

Constructor :-
--------------
Implement a parameterized constructor to initialize all non static fields.
Implement getter and setter methods for all non static fields.


Create a BLC class Car with the following attributes:
-> private String brand;
-> private String model;
-> private int year;
-> private Driver driver;

Constructor :-
--------------
Implement a parameterized constructor to initialize all non static fields.

Implement a copy constructor (which accepts Car as a paraneter) for the Car  and initializes the new Car object with the existing object properties. [Deep copy]

methods()
----------
Implement getter and setter methods for all non static fields.

Implement a method named changeDriver(Driver newDriver) to update the driver of the car with public modifier and void as a return type.


Create an ELC class UpdateDriverScenario with main method.

Create two Car objects by using Deep copy concept.
Now, Change the Driver from first Car object by using changeDriver() method.
Verify drived changed in both the Car Objects OR only 1 object. [Deep Copy]

Output :
=== Before Changing Driver ===
Original Car: Car Brand: Hyundai, Model: Creta, Year: 2025, Driver Name: Scott, Age: 30
Copied   Car: Car Brand: Hyundai, Model: Creta, Year: 2025, Driver Name: Scott, Age: 30

=== After Changing Driver ===
Original Car: Car Brand: Hyundai, Model: Creta, Year: 2025, Driver Name: Alen, Age: 35
Copied   Car: Car Brand: Hyundai, Model: Creta, Year: 2025, Driver Name: Scott, Age: 30*/

class Driver{
    private String name;
    private int age;

    public Driver(String name, int age) {
        this.name = name;
        this.age = age;
    }

    @Override
    public String toString() {
        return "Driver{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }
}

class Car{
    private String brand;
    private String model;
    private int year;
    private Driver driver;

    public Car(String brand, String model, int year, Driver driver) {
        this.brand = brand;
        this.model = model;
        this.year = year;
        this.driver = driver;
    }
    public Car(Car car) {
        this.brand = car.brand;
        this.model = car.model;
        this.year = car.year;
        this.driver = car.driver;
    }
    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public Driver getDriver() {
        return driver;
    }

    public void setDriver(Driver driver) {
        this.driver = driver;
    }

    public void changeDriver(Driver newDriver){
        this.driver = newDriver;
    }

    @Override
    public String toString() {
        return "Car{" +
                "brand='" + brand + '\'' +
                ", model='" + model + '\'' +
                ", year=" + year +
                ", driver=" + driver +
                '}';
    }
}


void main() {
    String name = IO.readln("Enter Name: ");
    int age = Integer.parseInt(IO.readln("Enter age: "));
    String brand = IO.readln("Enter brand: ");
    String model = IO.readln("Model: ");
    int year = Integer.parseInt(IO.readln("Enter Year: "));

    Driver driver = new Driver(name, age);
    Car car = new Car(brand, model, year, driver);
    Car copyCar = new Car(car);
    Driver d = new Driver("Hari", 22);
    car.changeDriver(d);

    IO.println(d);
    IO.println(car);
    IO.println(copyCar);
}