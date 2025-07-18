public class School {
    protected String name;
    protected String department;


    public School(String name, String department) {
        this.name = name;
        this.department = department;
    }

    public void showDetails(){
        System.out.println("Name: "+name);
        System.out.println("Departmant: "+department);
    }
}