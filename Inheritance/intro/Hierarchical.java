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
class DayScholar extends Student{
    protected double transportFee;

    public DayScholar(int id, String name, double example, double transportFee) {
        super(id, name, example);
        this.transportFee = transportFee;
    }

    @Override
    public String toString() {
        return "DayScholar{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", example=" + example +
                ", transportFee=" + transportFee +
                '}';
    }
}
class Hosteler extends Student{
    protected double hostelFess;

    public Hosteler(int id, String name, double example, double hostelFess) {
        super(id, name, example);
        this.hostelFess = hostelFess;
    }

    @Override
    public String toString() {
        return "Hosteler{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", example=" + example +
                ", hostelFess=" + hostelFess +
                '}';
    }
}
public class Hierarchical {
    static void main() {
        DayScholar dayScholar = new DayScholar(101, "Sam", 8000, 1000);
        IO.println(dayScholar);

        Hosteler hosteler = new Hosteler(102, "sam2", 60000, 1000);
        IO.println(hosteler);
    }
}
