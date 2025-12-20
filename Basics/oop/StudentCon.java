package Basics.oop;

public class StudentCon {
    private int studentID;
    private String studentName;
    private int studentAge;

    public StudentCon(){
        this.studentName = "Not given";
    }
    public StudentCon(int studentID, String studentName){
        this.studentID = studentID;
        this.studentName = studentName;
    }
    public StudentCon(int studentID, String studentName, int studentAge){
        this.studentID = studentID;
        this.studentName = studentName;
        this.studentAge = studentAge;
    }

    public String toString(){
        return "Student Details:"+
                "\nStudent ID   : "+studentID+
                "\nStudent Name : "+studentName+
                "\nStudent Age  : "+studentAge;
    }




    static void main(){
        int choice = Integer.parseInt(IO.readln());

        switch(choice){
            case 1:
                StudentCon student = new StudentCon();
                IO.println(student.toString());
                break;

            case 2:
                int studentID1 = Integer.parseInt(IO.readln());
                String studentName = IO.readln();
                StudentCon student1 = new StudentCon(studentID1, studentName);
                IO.println(student1.toString());
                break;

            case 3:
                int studentID2 = Integer.parseInt(IO.readln());
                String studentName1 = IO.readln();
                int studentAge = Integer.parseInt(IO.readln());
                StudentCon student2 = new StudentCon(studentID2, studentName1, studentAge);
                IO.println(student2.toString());
                break;

            default:
                IO.println("Error");
                break;
        }
    }
}
