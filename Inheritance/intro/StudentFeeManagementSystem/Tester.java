package Inheritance.intro.StudentFeeManagementSystem;

public class Tester {
    static void main() {

    }
}

class Student{
    int studentID;
    String name;
    double examFee;

    public Student(int studentID, String name, double examFee) {
        this.studentID = studentID;
        this.name = name;
        this.examFee = examFee;
    }

    public String displayDetails(){
        return toString();
    }

    public double payFee(){
        return 0.0;
    }

    @Override
    public String toString() {
        return "Student{" +
                "studentID=" + studentID +
                ", name='" + name + '\'' +
                ", examFee=" + examFee +
                '}';
    }
}

class DayScholar extends Student{
    double transportFee;

    public DayScholar(int studentID, String name, double examFee, double transportFee) {
        super(studentID, name, examFee);
        this.transportFee = transportFee;
    }

    @Override
    public String displayDetails() {
        return super.displayDetails();
    }
}

class Hosteler extends Student{
    double hostelFee;

    public Hosteler(int studentID, String name, double examFee, double hostelFee) {
        super(studentID, name, examFee);
        this.hostelFee = hostelFee;
    }

    @Override
    public String displayDetails() {
        return super.displayDetails();
    }
}
