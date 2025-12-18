package Basics.oop;

// ELC
public class TaxCalculation{
    static void main(){
        var employeeType = Integer.parseInt(IO.readln());
        int employeeID = Integer.parseInt(IO.readln());
        String employeeName = IO.readln();
        double basicSalary = Double.parseDouble(IO.readln());
        double HRAPer = Double.parseDouble(IO.readln());
        double DAPer = Double.parseDouble(IO.readln());

        TaxUtil taxUtil = new TaxUtil();

        // Employee
        if(employeeType == 1){

            Employee employee = new Employee(employeeID, employeeName, basicSalary, HRAPer, DAPer);
            IO.println("Gross Salary : "+employee.claculateGrossSalary());
            IO.println("Tax : "+taxUtil.calculateTax(employee));
        }
        // Manager
        else if(employeeType == 2){
            double projectAllowance = Double.parseDouble(IO.readln());

            Manager manager = new Manager(employeeID, employeeName, basicSalary, HRAPer, DAPer, projectAllowance);
            IO.println("Gross Salary : "+manager.claculateGrossSalary());
            IO.println("Tax : "+taxUtil.calculateTax(manager));
        }
        // Trainer
        else if(employeeType == 3){
            int batchCount = Integer.parseInt(IO.readln());
            double perkPerBatch = Double.parseDouble(IO.readln());

            Trainer trainer = new Trainer(employeeID, employeeName, basicSalary, HRAPer, DAPer, batchCount, perkPerBatch);
            IO.println("Gross Salary : "+trainer.claculateGrossSalary());
            IO.println("Tax : "+taxUtil.calculateTax(trainer));
        }
        // Sourcing 4
        else if(employeeType == 4){
            int enrollmentTarget = Integer.parseInt(IO.readln());
            int enrollmentReached = Integer.parseInt(IO.readln());
            double perkPerEnrollment = Double.parseDouble(IO.readln());

            Sourcing sourcing = new Sourcing(employeeID, employeeName, basicSalary, HRAPer, DAPer, enrollmentTarget, enrollmentReached, perkPerEnrollment);
            IO.println("Gross Salary : "+sourcing.claculateGrossSalary());
            IO.println("Tax : "+taxUtil.calculateTax(sourcing));
        }
        else {
            IO.println("Invalid Employee");
        }
    }
}

// BLC
class Employee{
    private int employeeID;
    private String employeeName;
    private double basicSalary;
    private double HRAPer;
    private double DAPer;

    public Employee(int employeeID, String employeeName, double basicSalary, double HRAPer, double DAPer){
        this.employeeID = employeeID;
        this.employeeName = employeeName;
        this.basicSalary = basicSalary;
        this.HRAPer = HRAPer;
        this.DAPer = DAPer;
    }

    public double claculateGrossSalary(){
        return (basicSalary + HRAPer + DAPer);
    }
}

//BLC
class Manager{
    private int managerID;
    private String managerName;
    private double basicSalary;
    private double HRAPer;
    private double DAPer;
    private double projectAllowance;

    public Manager(int managerID, String managerName, double basicSalary, double HRAPer, double DAPer, double projectAllowance){
        this.managerID = managerID;
        this.managerName = managerName;
        this.basicSalary = basicSalary;
        this.HRAPer = HRAPer;
        this.DAPer = DAPer;
        this.projectAllowance = projectAllowance;
    }

    public double claculateGrossSalary(){
        return (basicSalary + HRAPer + DAPer + projectAllowance);
    }
}

// BLC
class Trainer{
    private int trainerID;
    private String trainerName;
    private double basicSalary;
    private double HRAPer;
    private double DAPer;
    private double batchCount;
    private double perkPerBatch;

    public Trainer(int trainerID, String trainerName, double basicSalary, double HRAPer, double DAPer, double batchCount, double perkPerBatch){
        this.trainerID = trainerID;
        this.trainerName = trainerName;
        this.basicSalary = basicSalary;
        this.HRAPer = HRAPer;
        this.DAPer = DAPer;
        this.batchCount = batchCount;
        this.perkPerBatch = perkPerBatch;
    }

    public double claculateGrossSalary(){
        return (basicSalary + HRAPer + DAPer + (batchCount*perkPerBatch));
    }
}

// BLC
class Sourcing{
    private int sourcingID;
    private String sourcingName;
    private double basicSalary;
    private double HRAPer;
    private double DAPer;
    private double enrollmentTarget;
    private double enrollmentReached;
    private double perkPerEnrollment;

    public Sourcing(int sourcingID, String sourcingName, double basicSalary, double HRAPer, double DAPer, double enrollmentTarget, int enrollmentReached, double perkPerEnrollment){
        this.sourcingID = sourcingID;
        this.sourcingName = sourcingName;
        this.basicSalary = basicSalary;
        this.HRAPer = HRAPer;
        this.DAPer = DAPer;
        this.enrollmentTarget = enrollmentTarget;
        this.enrollmentReached = enrollmentReached;
        this.perkPerEnrollment = perkPerEnrollment;
    }

    public double claculateGrossSalary(){
        return (basicSalary + HRAPer + DAPer + (((enrollmentReached/enrollmentTarget)*100)*perkPerEnrollment));
    }
}

// BLC
class TaxUtil{
    public double calculateTax(Employee employee){
        double grossSalary = employee.claculateGrossSalary();
        if(grossSalary > 50000){
            return (grossSalary * 0.2);
        }else{
            return (grossSalary * 0.05);
        }
    }

    public double calculateTax(Manager manager){
        double grossSalary = manager.claculateGrossSalary();
        if(grossSalary > 50000){
            return (grossSalary * 0.2);
        }else{
            return (grossSalary * 0.05);
        }
    }
    public double calculateTax(Trainer trainer){
        double grossSalary = trainer.claculateGrossSalary();
        if(grossSalary > 50000){
            return (grossSalary * 0.2);
        }else{
            return (grossSalary * 0.05);
        }
    }
    public double calculateTax(Sourcing sourcing){
        double grossSalary = sourcing.claculateGrossSalary();
        if(grossSalary > 50000){
            return (grossSalary * 0.2);
        }else{
            return (grossSalary * 0.05);
        }
    }

    /**public double conditionForGS(Object object){
     if(grossSalary > 50000){
     return (grossSalary * 0.2);
     }else{
     return (grossSalary * 0.05);
     }
     }*/
}
