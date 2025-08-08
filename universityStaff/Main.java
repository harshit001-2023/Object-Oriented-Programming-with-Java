package universityStaff;

public class Main {
    public static void main(String[] args) {
        Professor professor = new Professor("Ram Bhadracharya", "Humanities", 17000.0);
        professor.calculateSalary();
        professor.displayInfo();

        System.out.println("-----------************------------\n");

        AssistantProfessor assistantProfessor = new AssistantProfessor("Shailu Krishnan", "Computer Science", 15000.0);
        assistantProfessor.calculateSalary();
        assistantProfessor.displayInfo();

        System.out.println("-----------************------------\n");

        Clerk clerk = new Clerk("Reddhesh Patel", "Business",10000.0);
        clerk.calculateSalary();
        clerk.displayInfo();
    }
}
