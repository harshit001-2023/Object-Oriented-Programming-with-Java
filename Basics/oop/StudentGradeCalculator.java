package Basics.oop;

public // ELC
class StudentGradeCalculator{
    static void main() {
        String name = IO.readln();
        int marks = Integer.parseInt(IO.readln());

        Student1 student = new Student1(name, marks);
        StudentGrade studentGrade = CalculateStudentGrade.calculateGrade(student);
        IO.println(studentGrade);
    }

}


// BLC
class Student1{
    private String name;
    private int marks;

    public Student1(String name, int marks){
        this.name = name;
        this.marks = marks;
    }

    public void setName(String name){
        this.name = name;
    }

    public String getName(){
        return this.name;
    }

    public void setMarks(int marks){
        this.marks = marks;
    }

    public int getMarks(){
        return this.marks;
    }

    public String toString(){
        return this.getName();
    }
}

// BLC 1
class StudentGrade{
    private Student1 student;
    private char studentGrade;

    public StudentGrade(Student1 student, char studentGrade){
        this.student = student;
        this.studentGrade = studentGrade;
    }

    public void setName(Student1 student){
        this.student = student;
    }

    public Student getStudent(){
        return this.getStudent();
    }

    public void setStudentGrade(char studentGrade){
        this.studentGrade = studentGrade;
    }

    public char getStudentGrade(){
        return this.studentGrade;
    }

    public String toString(){
        return "[The Student "+this.student.getName()+" has '"+this.studentGrade+"' Grade]";
    }
}

class CalculateStudentGrade{

    public static StudentGrade calculateGrade(Student1 student){
        int studentMarks = student.getMarks();
        if(studentMarks > 90) return new StudentGrade(student,'A');
        else if(studentMarks<90 && studentMarks >= 75) return new StudentGrade(student,'B');
        else if(studentMarks < 75 && studentMarks >= 60) return new StudentGrade(student,'C');
        else return new StudentGrade(student,'A');
    }

}




