package company;

//Practice program is in work
public abstract class Employee {
    final String company_name;
    String emp_name;
    int id;
    private String address;

    public Employee(String emp_name, int id, String address) {
        this.company_name = "Hexaware Tech";
        this.emp_name = emp_name;
        this.id = id;
        this.address = address;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public void empDetails(){
        System.out.println("Company Name: "+company_name);
        System.out.println("Employee Name: "+emp_name);
        System.out.println("ID Number: "+id);
        System.out.println("Employee Address: "+address);
    }

    public abstract void position();

}
