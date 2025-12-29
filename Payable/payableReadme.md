# Payable Package - Payment Processing System

![Java](https://img.shields.io/badge/Java-17%2B-blue)
![OOP](https://img.shields.io/badge/OOP-Design-blueviolet)
![License](https://img.shields.io/badge/License-MIT-green)

Basics.oop.A robust Java payment processing system supporting multiple payee types, international payments, and tax calculations.

## 📊 Class Diagram

```mermaid
classDiagram
    direction TB
    
    class Payable {
        <<interface>>
        +calculatePayment() double
        +generatePaymentDetails() String
        +displayPaymentConfirmation()*
    }
    
    class Taxable {
        <<interface>>
        +calculateTax() double
    }
    
    class InternationalPayment {
        <<interface>>
        +convertCurrency(double, Currency) double
        +getIBAN() String
    }
    
    class FullTimeEmployee {
        -String name
        -double monthlySalary
        -double bonus
        +calculatePayment() double
    }
    
    class Freelancer {
        -String name
        -double hourlyRate
        -double hoursWorked
        +calculatePayment() double
    }
    
    class Contractor {
        -String companyName
        -double projectFee
        -double expenses
        +displayPaymentConfirmation()
    }
    
    Payable <|.. FullTimeEmployee
    Payable <|.. Freelancer
    Payable <|.. Contractor
    Taxable <|.. Contractor
    InternationalPayment <|.. Contractor
```

## 🏗️ Architecture

```mermaid
flowchart TD
    Basics.oop.A[Payment Processor] --> Basics.oop.B[FullTimeEmployee]
    Basics.oop.A --> C[Freelancer]
    Basics.oop.A --> D[Contractor]
    D --> E[Tax Calculation]
    D --> F[Currency Conversion]
```

## 🌟 Features

- Multiple payment types (salary, hourly, project-based)
- International payment support
- Automatic tax calculations
- Payment history tracking
- Customizable payment methods

## 🚀 Quick Start

```java
// 1. Create payees
Payable[] payables = {
    new FullTimeEmployee("Jane Smith", 5000, 1000),
    new Freelancer("John Doe", 50.0, 80),
    new Contractor("Tech Solutions", 15000, 2500)
};

// 2. Process payments
for (Payable payable : payables) {
    System.out.println(payable.generatePaymentDetails());
    System.out.printf("Amount: $%.2f%n", payable.calculatePayment());
    payable.displayPaymentConfirmation();
}
```

## 📝 Sample Output

```
Employee: Jane Smith
Salary: $5000.00 | Bonus: $1000.00
Total Payment: $6000.00
Payment processed successfully
----------------------
Freelancer: John Doe
Hours: 80.00 | Rate: $50.00/hr
Total Payment: $4000.00
Payment processed successfully
----------------------
```

## 🔧 Payment Methods

```mermaid
pie
    title Payment Methods
    "Bank Transfer" : 45
    "PayPal" : 30
    "Check" : 15
    "Crypto" : 10
```

## 📚 Documentation

| Component | Description |
|-----------|-------------|
| `Payable` | Core payment interface |
| `Taxable` | Handles tax calculations |
| `InternationalPayment` | Manages cross-border payments |
| `FullTimeEmployee` | Salaried employee implementation |
| `Freelancer` | Hourly worker implementation |
| `Contractor` | Project-based worker with international support |

## 🤝 Contributing

1. Fork the repository
2. Create your feature branch
3. Commit your changes
4. Push to the branch
5. Open a pull request

## 📜 License

MIT © 2023 Harshit Pande

---

💡 **Tip**: Use the `PaymentProcessor` class for batch processing payments with automatic tax and currency conversion handling.
```

This README includes:
- Badges for quick info
- Visual diagrams (class, flow, pie chart)
- Code examples with syntax highlighting
- Clean documentation table
- Contribution guidelines
- Professional formatting
