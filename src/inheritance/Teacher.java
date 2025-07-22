package src.inheritance;

import src.inheritance.School;

class Teacher extends School {
    private String subject;

    public Teacher(String name, String department, String subject){
        super(name, department);
        this.subject = subject;
    }

    public void showRole(){
        showDetails();
        System.out.println("Role: Teacher");
        System.out.println("Subject: "+subject);
    }
}