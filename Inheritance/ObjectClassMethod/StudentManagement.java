package Inheritance.ObjectClassMethod;

//StudentInfo Details using toString()
//Easy
//Core Java • Object Class Methods • toString()
//20 Points
//        Description
//You are creating a school management system. Each student has a
//name, roll number, and grade.
//        Requirement:
//Override the toString() method to print the student's details in the format:
//        "StudentInfo[RollNo=101, Name=Raju,, Grade=A]"
//
//Question:
//Create a StudentInfo class with attributes: rollNo, name, and grade.
//Override the toString() method and write a main method to display
//student details.
//Examples
//Example 1:
//
//Input
//
//101
//Raju
//        A
//Output
//
//StudentInfo[RollNo=101, Name=Raju, Grade=A]
//Example 2:
//
//Input
//
//55
//Kiran
//        B
//Output
//
//StudentInfo[RollNo=55, Name=Kiran, Grade=B]
//Explanation
//
//Demonstrates method overriding by printing object details using toString()
//Constraints

class StudentInfo{
    private int rollNo;
    private String name;
    private String grade;

    public StudentInfo(int rollNo, String name, String grade){
        this.rollNo = rollNo;
        this.name = name;
        this.grade = grade;
    }

    public int getRollNo(){
        if(rollNo <= 0) {
            System.out.println("Error Invalid Input");
            System.exit(0);
        }
        return this.rollNo;
    }

    public String getName(){
        return this.name;
    }

    public String getGrade(){ return this.grade;}

    public String toString(){
        return "StudentInfo[RollNo="+getRollNo()+", Name="+getName()+", Grade="+getGrade()+"]";
    }
}


class Main {
    public static void main(String[] args) {
        int roll = Integer.parseInt(IO.readln());
        String name = IO.readln();
        String grade = IO.readln();

        StudentInfo student = new StudentInfo(roll, name, grade);
        System.out.println(student.toString());

    }
}

