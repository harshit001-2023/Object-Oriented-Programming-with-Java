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
