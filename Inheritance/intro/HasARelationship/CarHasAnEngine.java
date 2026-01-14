/*
* Assignment-1

Title :- Car Has An Engine

Objective :-
------------
Create a Car class that contains an Engine object as a composition. The Engine class should store details about the engine, while the Car class should include details about the car along with validation checks for numeric values.

Create a BLC class Engine.

A class to represent an engine with a model and capacity attributes.

Field Declarations :-
-------------------------
private String model; 		—> Stores the model of the engine.
private int engineCapacity; 	—> Stores the capacity of the engine (must be positive).

Constructor Declaration :-
---------------------------
public Engine(String model, int engineCapacity) -> Initializes the engine model and capacity.

Note:-
------
If engineCapacity <= 0, print "Error Invalid Input" and terminate object creation.

Getter Methods :-
------------------
-> public String getModel()
-> public int getEngineCapacity()
Returns model and capacity.

toString() method :-
--------------------
@Override
public String toString() -> Returns a string representation of the engine in the format :-

Engine Model: [model], Engine Capacity: [capacity]cc

Create another BLC class called Car.

A class to represent a car that contains an engine.

variable Declarations :-
-------------------------
private String make; 	—> Stores the car's make.
private String model; 	—> Stores the car's model.
private int year; 	—> Stores the car's manufacturing year (must be positive).
private final Engine engine; 	—> Stores the engine object.

Constructor Declaration :-
---------------------------
public Car(String make, String model, int year) -> Initializes make, model, and year.

Use composition logic to create Engine object.

Note :-
-------
If year <= 0, print "Error Invalid Input" and terminate object creation.

toString() method :-
--------------------
@Override
public String toString() -> Returns a string representation of the car in the format :-

Create an ELC class CompositionDemo with main method to test this application.*/

package Inheritance.intro.HasARelationship;

class CompositionDemo {
    static void main() {
        Car car = new Car(2026, "1321EV2026", "01-01-2026");
        IO.println(car);
    }
}

class Car{
    private  String make;
    private String model;
    private int year;
    private final Engine engine;

    public Car(int year, String model, String make) {
        if(year <= 0){
            IO.println("Year can't be Negative.");
            System.exit(0);
        }
        this.engine = new Engine("1321EPE",12);
        this.year = year;
        this.model = model;
        this.make = make;
    }

    @Override
    public String toString() {
        return "Car{" +
                "make='" + make + '\'' +
                ", model='" + model + '\'' +
                ", year=" + year +
                ", engine=" + engine +
                '}';
    }
}

class Engine{
    private String model;
    private int engineCapacity;

    public Engine(String model, int engineCapacity) {
        if(engineCapacity <= 0){
            IO.println("Capacity should not be Negative.");
            System.exit(0);
        }
        this.model = model;
        this.engineCapacity = engineCapacity;
    }

    public String getModel() {
        return model;
    }

    public int getEngineCapacity() {
        return engineCapacity;
    }

    @Override
    public String toString() {
        return "Engine Model='" + model + '\'' +
                ", Engine Capacity=" + engineCapacity +
                '}';
    }
}
