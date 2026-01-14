/*
* Assignment 02 :
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
-> Display the customer information.

*/

package Inheritance.intro.HasARelationship;

class Order{
    private String orderID;
    private String itemName;
    private double price;

    public Order(String orderID, String itemName, double price) {
        this.orderID = orderID;
        this.itemName = itemName;
        this.price = price;
    }

    public String getOrderID() {
        return orderID;
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
                "orderID='" + orderID + '\'' +
                ", itemName='" + itemName + '\'' +
                ", price=" + price +
                '}';
    }
}

class Customer{
    private String name;
    private String email;
    private String address;
    private long mobleNo;
    private Order order;

    public Customer(String name, String email, String address, long mobleNo, Order order) {
        this.name = name;
        this.email = email;
        this.address = address;
        this.mobleNo = mobleNo;
        this.order = order;
    }

    @Override
    public String toString() {
        return "Customer{" +
                "name='" + name + '\'' +
                ", email='" + email + '\'' +
                ", address='" + address + '\'' +
                ", mobleNo=" + mobleNo +
                ", order=" + order +
                '}';
    }
}

class Zomato{
    static void main() {
        Order order = new Order("2012BCA", "Television", 20000);
        Customer customer = new Customer("Harris", "harris@mail.com", "Barcelona", 485168959, order);
        IO.println(customer);
    }
}