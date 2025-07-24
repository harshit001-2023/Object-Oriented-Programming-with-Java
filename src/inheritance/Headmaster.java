package src.inheritance;

class Headmaster extends School {

    private int experience;
/// Headmaster constructor
    public Headmaster(String name, String department, int experience){
        super(name, department);
        this.experience = experience;
    }

    /// method showRole
    public void showRole(){
        showDetails();
        System.out.println("Role : Head");
        System.out.println("Experience: "+ experience +" years.");
    }
    /// Applying concept of Method overloading
    public void showRole(String role){
        showRole();
        System.out.println("HM Responsibility: "+role);
    }
}