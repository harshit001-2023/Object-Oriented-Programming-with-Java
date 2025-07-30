package abstractionConcepts;

public class Car extends NoiseLevel{
    @Override
    public void enigne() {
        System.out.println("Engine Type: BS6");
    }

    @Override
    public void vehicleType() {
        super.vehicleType();
        System.out.println("Four Wheeler: Car");

    }

    public void info(){
        vehicleType();
        enigne();
        lowNoise();
    }

}
