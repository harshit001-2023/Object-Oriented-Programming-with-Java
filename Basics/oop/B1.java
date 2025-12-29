package Basics.oop;

class Vehicle
{
    void run()
    {
        System.out.println("Vehicle is running");
    }
}
class Bike extends Vehicle
{
    void run()
    {
        super.run();
        System.out.println("Bike is running");
    }
}
public class B1
{
    public static void main(String[] args)
    {
        new Bike().run();
    }
}