package company;

//Practice program is in work
public abstract class Employee {//Class declared as abstract
    //Declared necessary variables
    final String company_name;
    String emp_name;
    int id;
    private String address;

    //Employee Constructor
    public Employee(String emp_name, int id, String address) {
        this.company_name = "Hexaware Tech";
        this.emp_name = emp_name;
        this.id = id;
        this.address = address;
    }

    //Getter and setter method for address
    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    //Created a empDetails() Method which prints details of employee such as Company name, Employee name
    //Id number and Address
    public void empDetails(){
        System.out.println("Company Name: "+company_name);
        System.out.println("Employee Name: "+emp_name);
        System.out.println("ID Number: "+id);
        System.out.println("Employee Address: "+address);
    }

    //Created an abstract method named position
    public abstract void position();

}
