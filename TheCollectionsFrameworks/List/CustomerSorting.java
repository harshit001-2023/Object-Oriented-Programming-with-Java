package TheCollectionsFrameworks.List;

/*Program 2:
------------
Write a Program to perform sorting operation on Customer class using
ArrayList by implementing Comparator interface

Create a BLC class Customer
Instance variables:
customerNumber-private-Integer
customerName-private-String
customerBill-private-Double

Create a parameterized constructor to initialize the instance variable of Customer class.

Implement Comparator interface to write the logic to sort the Customer class based on the following
a) Based on customer number
b) Based on customer name
c) Based on customer bill
Create an ELC class which contains main method, create ArrayList object to hold
Customer data as well as sort the Customer data object based on the above criteria
*/

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

class Customer {
    private Integer customerNumber;
    private String customerName;
    private Double customerBill;

    // Parameterized constructor
    public Customer(Integer customerNumber, String customerName, Double customerBill) {
        this.customerNumber = customerNumber;
        this.customerName = customerName;
        this.customerBill = customerBill;
    }

    // Getter methods
    public Integer getCustomerNumber() {
        return customerNumber;
    }

    public String getCustomerName() {
        return customerName;
    }

    public Double getCustomerBill() {
        return customerBill;
    }

    @Override
    public String toString() {
        return "Customer [customerNumber=" + customerNumber +
                ", customerName=" + customerName +
                ", customerBill=" + customerBill + "]";
    }
}

// Comparator for sorting by Customer Number
class SortByCustomerNumber implements Comparator<Customer> {
    @Override
    public int compare(Customer c1, Customer c2) {
        return c1.getCustomerNumber().compareTo(c2.getCustomerNumber());
    }
}

// Comparator for sorting by Customer Name
class SortByCustomerName implements Comparator<Customer> {
    @Override
    public int compare(Customer c1, Customer c2) {
        return c1.getCustomerName().compareTo(c2.getCustomerName());
    }
}

// Comparator for sorting by Customer Bill
class SortByCustomerBill implements Comparator<Customer> {
    @Override
    public int compare(Customer c1, Customer c2) {
        return c1.getCustomerBill().compareTo(c2.getCustomerBill());
    }
}

class CustomerSortingDemo {
    public static void main(String[] args) {
        // Create ArrayList to hold Customer objects
        ArrayList<Customer> customers = new ArrayList<>();

        // Adding Customer objects to ArrayList
        customers.add(new Customer(45, "John", 500.0));
        customers.add(new Customer(78, "Alice", 690.0));
        customers.add(new Customer(15, "Bob", 344.0));
        customers.add(new Customer(21, "Emma", 655.0));
        customers.add(new Customer(91, "David", 1000.0));

        System.out.println("=== Original Customer List ===");
        displayCustomers(customers);

        // a) Sorting based on Customer Number
        System.out.println("\n=== After Sorting by Customer Number ===");
        customers.sort(new SortByCustomerNumber());
        displayCustomers(customers);

        // b) Sorting based on Customer Name
        System.out.println("\n=== After Sorting by Customer Name ===");
        customers.sort(new SortByCustomerName());
        displayCustomers(customers);

        // c) Sorting based on Customer Bill
        System.out.println("\n=== After Sorting by Customer Bill ===");
        Collections.sort(customers, new SortByCustomerBill());
        displayCustomers(customers);
    }

    // Helper method to display all customers
    public static void displayCustomers(ArrayList<Customer> customers) {
        for (Customer customer : customers) {
            System.out.println(customer);
        }
    }
}
