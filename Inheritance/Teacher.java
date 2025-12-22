package Inheritance;

class Teacher extends School {
    private String subject;

    public Teacher(String name, String department, String subject){
        super(name, department);
        this.subject = subject;
    }

    public void showRole(){
        System.out.println("Role: Teacher");
        System.out.println("Subject: "+subject);
    }
    // Applying concept of Method overloading
     public void showRole(int std){
         showDetails();
         showRole();
         System.out.println("Class: "+std+"th");
     }
}