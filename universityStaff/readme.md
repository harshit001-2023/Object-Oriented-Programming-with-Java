# University Staff Management System

This Java application manages different types of university staff members, their salaries, and bonuses. It demonstrates object-oriented principles including inheritance, polymorphism, and interfaces.

## Class Structure

```mermaid
classDiagram
    direction TB
    
    class Staff {
        <<interface>>
        +calculateSalary()
        +displayInfo()
    }
    
    class Employee {
        <<abstract>>
        #String name
        #String department
        #String designation
        #double monthlySalary
        #double annualIncome
        +Employee(String name, String department, String designation, double monthlySalary)
        +calculateSalary()
        +calculateBonus()* double
        +displayInfo()*
    }
    
    class Professor {
        +Professor(String name, String department, double monthlySalary)
        +calculateBonus() double
        +displayInfo()
    }
    
    class AssistantProfessor {
        +AssistantProfessor(String name, String department, double monthlySalary)
        +calculateBonus() double
        +displayInfo()
    }
    
    class Clerk {
        +Clerk(String name, String department, double monthlySalary)
        +calculateBonus() double
        +displayInfo()
    }
    
    Staff <|.. Employee
    Employee <|-- Professor
    Employee <|-- AssistantProfessor
    Employee <|-- Clerk
