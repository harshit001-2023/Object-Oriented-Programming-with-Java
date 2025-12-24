package Inheritance.intro;

class Student{
    protected int id;
    protected String name;
    protected double example;

    public Student(int id, String name, double example) {
        super();
        this.id = id;
        this.name = name;
        this.example = example;
    }
}
class DayScholer extends Student{
    protected double transportFee;

    public DayScholer(int id, String name, double example, double transportFee) {
        super(id, name, example);
        this.transportFee = transportFee;
    }

    @Override
    public String toString() {
        return "DayScholer{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", example=" + example +
                ", transportFee=" + transportFee +
                '}';
    }
}
class Hosteller extends Student{
    protected double hostelFess;

    public Hosteller(int id, String name, double example, double hostelFess) {
        super(id, name, example);
        this.hostelFess = hostelFess;
    }

    @Override
    public String toString() {
        return "Hosteller{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", example=" + example +
                ", hostelFess=" + hostelFess +
                '}';
    }
}
public class Hierarchical {
    static void main() {
        DayScholer dayScholer = new DayScholer(101, "Sam", 8000, 1000);
        IO.println(dayScholer);

        Hosteller hosteller = new Hosteller(102, "sam2", 60000, 1000);
        IO.println(hosteller);
    }
}
