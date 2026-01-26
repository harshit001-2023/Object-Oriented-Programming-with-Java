package InnerAndOuterClass;/*Assignment 01 :
----------------
Title :- Customer and Orders Management

Task Description :-
-------------------
Create a program that manages customers and their orders using Aggregation.

Create a BLC class Order.

A class to represent an order with details like order ID, product name, and price.

Field Declarations :-
------------------------
private String orderId; 	-> Stores the order ID
private String itemName; 	-> Stores the name of the product ordered
private double price; 		-> Stores the price of the product

Constructor Declaration :-
---------------------------
-> public Order(String orderId, String itemName, double price) A constructor to initialize the order ID, item name, and price.

getter() Methods Declaration :-
--------------------------------
-> public String getOrderId();
-> public String getProductName();
-> public double getPrice();

toString() Method Declaration :-
---------------------------------
@Override
public String toString();
A method to return a string representation of the order.

Create a class called Customer.

A class to represent a customer with details

Field Declarations :-
------------------------
-> private String name; // Stores the customer's name
-> private String email; // Stores the customer's email
-> private String address; //Stroes the customer's address
-> private long mobileNo; //Stroes the customer's mobile number
-> private Order order; // Stores the order object

Constructor Declaration :-
---------------------------
->Take a parameterized constructor to initialize all the fields.

toString Method Declaration :-
------------------------------
@Override
public String toString();
A method to return a string representation of the customer, including order details.


Create an ELC class Zomoto class with the following tasks:

-> Create a main method.
-> Create an Order object.
-> Create a Customer object that includes the Order.
-> Display the customer information.*/

class Order{
    private String orderId;
    private String itemName;
    private double price;

    public Order(String orderId, String itemName, double price) {
        this.orderId = orderId;
        this.itemName = itemName;
        this.price = price;
    }

    public String getOrderId() {
        return orderId;
    }

    public String getItemName() {
        return itemName;
    }

    public double getPrice() {
        return price;
    }

    @Override
    public String toString() {
        return "Order{" +
                "orderId='" + getOrderId() + '\'' +
                ", itemName='" + getItemName() + '\'' +
                ", price=" + getPrice() +
                '}';
    }
}


class Customer{
    private String name;
    private String email;
    private String address;
    private long mobileNo;
    private Order order;

    public Customer(String name, String email, String address, long mobileNo, Order order) {
        this.name = name;
        this.email = email;
        this.address = address;
        this.mobileNo = mobileNo;
        this.order = order;
    }

    @Override
    public String toString() {
        return "Customer{" +
                "name='" + name + '\'' +
                ", email='" + email + '\'' +
                ", address='" + address + '\'' +
                ", mobileNo=" + mobileNo +
                ", order=" + order +
                '}';
    }
}

class Zomato{
    void main(){
        String orderId = IO.readln("Enter order Id: ");
        String itemName = IO.readln("Enter Item Name: ");
        double price = Double.parseDouble(IO.readln("Enter price: "));
        String name = IO.readln("Enter your Name: ");
        String email = IO.readln("Enter Email: ");
        String address = IO.readln("Enter Address: ");
        long mobileNo = Long.parseLong(IO.readln("Enter Mobile No:"));


        Order order = new Order(orderId, itemName, price);
        Customer customer = new Customer(name, email, address, mobileNo, order);

        IO.println(customer.toString());
    }
}