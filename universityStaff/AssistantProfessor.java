package universityStaff;

public class AssistantProfessor extends Employee implements Staff{
    double monthlySalary;
    double annualIncome;
    String name;
    String department;
    final String designation;

    public AssistantProfessor(String name, String department, double monthlySalary) {
        this.name = name;
        this.department = department;
        this.monthlySalary = monthlySalary;
        designation = "Assistant Professor";
    }

    //Salary Calculation formula for Annual Income = Monthly Salary * 12 Months
    @Override
    public void calculateSalary() {
        annualIncome = monthlySalary * 12;
    }

    @Override
    public double calculateBonus() {
        return annualIncome * 0.8; // 8% for example
    }


    @Override
    public void displayInfo() {
        System.out.println("Name: "+name);
        System.out.println("Department: "+department);
        System.out.println("Designation: "+designation);
        System.out.println("Salary per Month is "+monthlySalary+" therefore Annual Income is "+annualIncome+" with additional annual Bonus 0.8%");
    }
}
