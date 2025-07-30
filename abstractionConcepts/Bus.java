package abstractionConcepts;

public class Bus extends NoiseLevel{
    @Override
    void enigne() {
        System.out.println("BS6");
        System.out.println("30 ltrs, Latest Engine for Buses");
    }

    @Override
    public void vehicleType() {
        super.vehicleType();
        System.out.println("Four Wheeler: Bus");
    }

    public void info(){
        vehicleType();
        enigne();
        highNoise();
    }
}
