package Inheritance.intro.StudentFeeManagementSystem;


class Student{
    protected int studentId;
    protected String name;
    protected double examFee;

    public Student(int studentId, String name, double examFee) {
        // Validate inputs
        if (studentId <= 0 || examFee <= 0) {
            IO.println("Error Invalid Input");
            System.exit(0);
        }
        this.studentId = studentId;
        this.name = name;
        this.examFee = examFee;
    }

    public String displayDetails() {
        return String.format("Student[name=%s,studentId=%d,examFee=%.1f]",
                name, studentId, examFee);
    }
    public double payFee(double amount) {
        double totalFee = examFee;
        double remaining = totalFee - amount;

        if (remaining <= 0) {
            IO.println("All Fees are clear");
        } else {
            IO.println("Remaining amount to pay is: " + remaining);
        }

        return remaining;
    }
}

class DayScholar extends Student{
    private final double transportFee;

    public DayScholar(int studentId, String name, double examFee, double transportFee) {
        super(studentId, name, examFee);
        if (transportFee <= 0) {
            IO.println("Error Invalid Input");
            System.exit(0);
        }
        this.transportFee = transportFee;
    }

    @Override
    public String displayDetails() {
        return String.format("DayScholar[TransportFee=%.1f,name=%s,studentId=%d,examFee=%.1f]",
                transportFee, name, studentId, examFee);
    }

    @Override
    public double payFee(double amount) {
        double totalFee = examFee + transportFee;
        double remaining = totalFee - amount;

        if (remaining <= 0) {
            IO.println("All Fees are clear");
        } else {
            IO.println("Remaining amount to pay is: " + remaining);
        }

        return remaining;
    }
}

class Hosteler extends Student{
    private final double hostelFee;

    public Hosteler(int studentId, String name, double examFee, double hostelFee) {
        super(studentId, name, examFee);
        if (hostelFee <= 0) {
            IO.println("Error Invalid Input");
            System.exit(0);
        }
        this.hostelFee = hostelFee;
    }

    @Override
    public String displayDetails() {
        return String.format("Hosteler[HostelFee=%.1f,name=%s,studentId=%d,examFee=%.1f]",
                hostelFee, name, studentId, examFee);
    }

    @Override
    public double payFee(double amount) {
        double totalFee = examFee + hostelFee;
        double remaining = totalFee - amount;

        if (remaining <= 0) {
            IO.println("All Fees are clear");
        } else {
            IO.println("Remaining amount to pay is: " + remaining);
        }

        return remaining;
    }
}

public class Tester {
    static void main() {
        int studentId = Integer.parseInt(IO.readln("Enter your ID: "));
        String name = IO.readln("Enter your name: ");
        double examFee = Double.parseDouble(IO.readln("Enter Exam Fee: "));
        IO.println("1. For Student Class:");
        IO.println("2. For DayScholar Class:");
        IO.println("3. For Hosteler Class:");
        int choice = Integer.parseInt(IO.readln("Enter your Choice [1-3]: "));

        if (choice == 1) {
            Student student = new Student(studentId, name, examFee);
            IO.println(student.displayDetails());
            student.payFee(25000.0);
            IO.println();
        } else if (choice == 2) {
            double transportFee = Double.parseDouble(IO.readln("Enter Transport Fee: "));
            DayScholar dayScholar = new DayScholar(studentId, name, examFee, transportFee);
            IO.println(dayScholar.displayDetails());
            dayScholar.payFee(37000.0);
            IO.println();
        } else if (choice == 3) {
            double hostelFee = Double.parseDouble(IO.readln("Enter Hostel Fee: "));
            Hosteler hosteler = new Hosteler(studentId, name, examFee,hostelFee);
            IO.println(hosteler.displayDetails());
            hosteler.payFee(33000.0);
        }else {
            IO.println("Invalid Choice!");
        }
    }
}
