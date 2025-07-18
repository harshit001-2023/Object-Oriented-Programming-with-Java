public class Headmaster extends School {

    private int exerience;

    public Headmaster(String name, String department, int exerience){
        super(name, department);
        this.exerience = exerience;
    }

    public void showRole(){
        showDetails();
        System.out.println("Role : Head");
        System.out.println("Experience: "+exerience+" years.");
    }
}