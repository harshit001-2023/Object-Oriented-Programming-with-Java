static class Person{
    protected String name;
    protected int age;

    public Person(String name, int age){
        if(name.equals("null") || name.trim().isEmpty()){
            IO.println("Name cannot be empty");
            System.exit(0);
        }
        if(age <=0 ){
            IO.println("Age cannot be zero or negative");
            System.exit(0);
        }
        else{
            this.name = name;
            this.age = age;
        }
    }

    public String toString(){
        return "Name: "+name+"\nAge : "+age;
    }
}

static class Employee extends Person{
    protected String employeeId;
    protected double salary;

    public Employee(String name, int age, String employeeId, double salary){
        super(name, age);
        if(employeeId.equals("null") || employeeId.trim().isEmpty()){
            IO.println("employeeId cannot be empty");
            System.exit(0);
        }
        if(salary <=0 ){
            IO.println("salary cannot be zero or negative");
            System.exit(0);
        }
        else{
            this.employeeId = employeeId;
            this.salary = salary;
        }
    }

    public String toString(){
        return super.toString()+"\nEmployee ID : "+employeeId+"\nSalary : "+salary;
    }

}

static class Manager extends Employee{
    private String department;

    public Manager(String name, int age, String employeeId, double salary, String department){
        super(name, age, employeeId, salary);

        if(department.equals("null") || department.trim().isEmpty()){
            IO.println("department cannot be empty");
            System.exit(0);
        }
        else this.department = department;

    }

    public String toString(){
        return super.toString()+"\nDepartment : "+department;
    }
}

void main(){
    String name = IO.readln();
    int age = Integer.parseInt(IO.readln());
    String employeeId = IO.readln();
    double salary = Double.parseDouble(IO.readln());
    String department = IO.readln();

    Manager manager = new Manager(name, age, employeeId, salary, department);
    IO.println(manager.toString());
}