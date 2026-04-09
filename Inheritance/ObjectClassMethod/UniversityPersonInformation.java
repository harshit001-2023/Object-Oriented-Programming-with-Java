package Inheritance.ObjectClassMethod;

//University Person Information System
//Medium
//Core Java • Object Class Methods • toString()
//50 Points
//        Description
//You are developing a University Person Information System.
//
//The system stores details at different levels such as basic person data, academic data, and specialization data.
//When any final object is printed directly, it should display complete information from all inheritance levels using an overridden toString() method.
//
//This problem demonstrates how toString() works in a multilevel inheritance hierarchy.
//
//Class Details
//
//Class 1: Person
//
//Data Members
//String name // full name of the person
//int age // age in years
//
//Constructor
//Initializes name and age.
//
//Override toString()
//Return basic person details.
//
//Class 2: Student extends Person
//
//Data Members
//String university // university name
//int rollNumber // student roll number
//
//Constructor
//Initializes Person data and student data.
//
//Override toString()
//Call super.toString() and append student details.
//
//Class 3: ResearchStudent extends Student
//
//Data Members
//String researchArea // area of research
//int publicationCount // number of publications
//
//Constructor
//Initializes all fields from Person, Student, and ResearchStudent.
//
//Override toString()
//Call super.toString() and append research details.
//
//Main Class Details
//
//Create a class named UniversityApp.
//
//Use Scanner to read:
//Name
//        Age
//University name
//Roll number
//Research area
//Publication count
//
//Create a ResearchStudent object.
//Print the object directly using System.out.println(object);
//Examples
//
//Example 1:
//Input
//Enter name:
//Liam Anderson
//Enter age:
//        28
//Enter university:
//Oxford University
//Enter roll number:
//        501
//Enter research area:
//Artificial Intelligence
//Enter publication count:
//        6
//Output
//Person[name=Liam Anderson, age=28], Student[university=Oxford University, roll=501], Research[area=Artificial Intelligence, publications=6]
//
//Example 2:
//Input
//Enter name:
//Elena Rossi
//Enter age:
//        25
//Enter university:
//University of Milan
//Enter roll number:
//        312
//Enter research area:
//Data Science
//Enter publication count:
//        3
//Output
//
//Person[name=Elena Rossi, age=25], Student[university=University of Milan, roll=312], Research[area=Data Science, publications=3]
//Explanation
//
//toString() is overridden at every inheritance level.
//        super.toString() helps reuse parent class output.
//Printing the child object triggers the complete chain.
//This shows polymorphic behavior of Object class methods.
//Constraints
//Name length: 1–30
//Age: 18–60
//Roll number > 0
//Publication count ≥ 0
//Execution Limits

import java.util.*;

class Person{
    private String name;
    private int age;

    Person(String name, int age) {
        if(age <  18) {
            System.out.println("Error: Age must be between 18 and 60");
            System.exit(0);
        }
        this.name = name;
        this.age = age;
    }

    public String toString(){
        return "Person[name="+name+", age="+age+"]";
    }
}

class Student extends Person{
    private String university;
    private int rollNumber;

    Student(String name, int age,  String university, int rollNumber){
        super(name,  age);
        this.university = university;
        this.rollNumber = rollNumber;
    }

    public String toString(){
        return super.toString()+", Student[university="+university+", roll="+rollNumber+"]";
    }
}

class ResearchStudent extends Student{
    private String researchArea;
    private int publicationCount;

    ResearchStudent(String name, int age,  String university, int rollNumber,  String researchArea, int publicationCount){
        super(name, age, university, rollNumber);
        this.researchArea = researchArea;
        this.publicationCount = publicationCount;
    }

    public String toString(){
        return super.toString()+", Research[area="+researchArea+", publications="+publicationCount+"]";
    }
}

public class UniversityPersonInformation {
    public static void main(String[] args) {
        // Write your code here
        String name = IO.readln();
        int age = Integer.parseInt(IO.readln());
        String university = IO.readln();
        int rollNumber = Integer.parseInt(IO.readln());
        String researchArea = IO.readln();
        int publicationCount = Integer.parseInt(IO.readln());

        ResearchStudent rs = new ResearchStudent(name, age, university, rollNumber, researchArea, publicationCount);

        System.out.println(rs.toString());

    }
}

