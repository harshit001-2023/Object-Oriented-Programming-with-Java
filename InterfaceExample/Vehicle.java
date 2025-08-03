package InterfaceExample;

public interface Vehicle {
    void start();
    void stop();
    default void running(){
        System.out.println("Taking Ride");
    }
}
