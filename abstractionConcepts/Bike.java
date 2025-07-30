package abstractionConcepts;

public class Bike extends NoiseLevel{
    @Override
    public void enigne() {
        System.out.println("BS4");
        System.out.println("Latest Two Wheeler Engine, 125cc");
    }

    @Override
    public void vehicleType(){
        super.vehicleType();
        System.out.println("Two Wheeler: Bike");
    }

    public void info(){
        vehicleType();
        enigne();
        mediumNoise();
    }

}
