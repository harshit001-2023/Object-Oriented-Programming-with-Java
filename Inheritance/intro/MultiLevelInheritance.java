package Inheritance.intro;

class Student1{
    protected int id;
    protected String name;
    protected String address;

    public Student1(int id, String name, String address){
        super();
        this.id = id;
        this.name = name;
        this.address = address;
    }

    @Override
    public String toString() {
        return "Student1{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", address='" + address + '\'' +
                '}';
    }
}

class ScienceStudent extends Student1{
    protected int phy;
    protected int che;

    public ScienceStudent(int id, String name, String address, int phy, int che){
        super(id, name, address);
        this.phy = phy;
        this.che = che;
    }

    @Override
    public String toString() {
        return super.toString()+"ScienceStudent{" +
                "phy=" + phy +
                ", che=" + che +
                '}';
    }
}

class PCM extends ScienceStudent{
    protected int maths;
    public PCM(int id, String name, String address, int phy, int che, int maths){
        super(id, name, address, phy, che);
        this.maths = maths;
    }

    @Override
    public String toString() {
        return super.toString()+"PCM{" +
                "maths=" + maths +
                '}';
    }

    public int getTotalMarks(){
        return this.phy + this.che + this.maths;
    }
}

public class MultiLevelInheritance {
    static void main(){
        PCM pcm = new PCM(1, "Sam", "Berlin", 85, 95, 95);
        IO.println(pcm);
        IO.println("Total Marks is "+pcm.getTotalMarks());
    }
}
