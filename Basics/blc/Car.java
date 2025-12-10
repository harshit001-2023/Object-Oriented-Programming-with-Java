package Basics.blc;

public class Car {
    private String model;
    private int year;
    private double price;

    public Car(String model, int year, double price) {
        this.model = model;
        this.year = year;
        this.price = price;
    }

    public void validation(){
        if (year <= 2010) {
            System.err.println("Year must be grater than " + year);
            System.exit(0);
        } else if (price <= 0) {
            System.err.println("Price must be positive integer");
            System.exit(0);
        } else IO.println(toString());
    }

    @Override
    public String toString() {
        return "Car{" +
                "model='" + model + '\'' +
                ", year=" + year +
                ", price=" + price +
                '}';
    }
}
