package InterfaceExample;

public class ElectricCar implements Vehicle, EVMaintenance {
    @Override
    public void softwareUpdate() {
        System.out.println("*Updating Software...");
    }

    @Override
    public void serviceDue() {
        System.out.println("*Maintenance Required");
    }

    @Override
    public void batteryCheck() {
        System.out.println("*Battery Problem* please visit official center");
    }

    @Override
    public void start() {
        System.out.println("EV Started...");
    }

    @Override
    public void stop() {
        System.out.println("EV Stopped!");
    }

    @Override
    public void running() {
        Vehicle.super.running();
    }
}
