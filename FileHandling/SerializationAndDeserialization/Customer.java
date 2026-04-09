package FileHandling.SerializationAndDeserialization;

//Program 02 :
//Perform Serialization and De-Serialization.
//
//Create a BLC class Customer with following attributes :
//private Integer customerId
//private String customerName
//private Double customerBill
//
//Create a parameterized Constructor to initialize all fields
//
//Create a static factory Method getCustomerObject(customerId, customerName, customerBill) to get Customer Object from end user
//Name of the Method : getCustomerObject() 3 parametrs
//Modifiers : public and static
//Return type : Customer
//
//In this Method take the user input from Scanner class to initialize the
//        instance variable.
//
//Generate toString(), getter and setter.
//
//
//Create another class StoreCustomerObject which will store customer object into a file called CustomerObject.txt.
//
//The number of Customer object you want to store in a file must be taken from end user through IO class.
//
//Create another class called RetrieveCustomerObject which will read the
//        Customer object from file and print the customer data through toString()
//method.

import java.io.Serial;
import java.io.Serializable;
import java.util.Scanner;

public class Customer implements Serializable {
    @Serial
    private static final long serialVersionUID = 1L;

    private Integer customerId;
    private String customerName;
    private Double customerBill;

    public Integer getCustomerId() {
        return customerId;
    }

    public void setCustomerId(Integer customerId) {
        this.customerId = customerId;
    }

    public String getCustomerName() {
        return customerName;
    }

    public void setCustomerName(String customerName) {
        this.customerName = customerName;
    }

    public Double getCustomerBill() {
        return customerBill;
    }

    public void setCustomerBill(Double customerBill) {
        this.customerBill = customerBill;
    }

    public Customer(Integer customerId, String customerName, Double customerBill) {
        this.customerId = customerId;
        this.customerName = customerName;
        this.customerBill = customerBill;
    }

    public static Customer getCustomerObject() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter Customer ID: ");
        int id = scanner.nextInt();
        scanner.nextLine(); // Consume newline
        System.out.print("Enter Customer Name: ");
        String name = scanner.nextLine();
        System.out.print("Enter Customer Bill: ");
        double bill = scanner.nextDouble();

        return new Customer(id, name, bill);
    }

    @Override
    public String toString() {
        return "Customer{" +
                "customerId=" + customerId +
                ", customerName='" + customerName + '\'' +
                ", customerBill=" + customerBill +
                '}';
    }
}


