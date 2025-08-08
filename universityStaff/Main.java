package universityStaff;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
//        Professor professor = new Professor("Ram Bhadracharya", "Humanities", 17000.0);
//        professor.calculateSalary();
//        professor.displayInfo();
//
//        System.out.println("-----------************------------\n");
//
//        AssistantProfessor assistantProfessor = new AssistantProfessor("Shailu Krishnan", "Computer Science", 15000.0);
//        assistantProfessor.calculateSalary();
//        assistantProfessor.displayInfo();
//
//        System.out.println("-----------************------------\n");
//
//        Clerk clerk = new Clerk("Reddhesh Patel", "Business",10000.0);
//        clerk.calculateSalary();
//        clerk.displayInfo();

// Instead of this hectic I am going to use ArrayList
        ArrayList<Staff> staffList = new ArrayList<>();
        staffList.add(new Professor("Dr. Ram Bhadracharya", "Humanities", 17700.0));
        staffList.add(new AssistantProfessor("Ms. Shailu Krishnan", "Computer Science", 15000.0));
        staffList.add(new Clerk("Mr. Riddhesh Patel", "MBA", 13500));

        for (Staff s : staffList){
            s.calculateSalary();
            s.displayInfo();
            s.calculateBonus();
        }
    }
}
