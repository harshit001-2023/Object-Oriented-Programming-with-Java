package Inheritance.ObjectClassMethod;

//Book Information System
//        Easy
//Core Java • Object Class Methods • toString()
//20 Points
//        Description
//You are developing a Book Information System for a small bookstore.
//
//Whenever a book object is printed directly using System.out.println(object), the system should display meaningful book details instead of the default memory reference.
//To achieve this, you must override the toString() method from the Object class.
//
//Class Details
//
//Create a class named Book.
//
//Data Members
//String title // title of the book
//String author // author name
//double price // price of the book
//
//Constructor
//Book(String title, String author, double price)
//Initializes all data members.
//
//Method
//Override toString()
//Return format:
//Book[Title=<title>, Author=<author>, Price=<price>]
//
//Main Class Details
//
//Create a class named BookApp.
//
//Use Scanner to read:
//Book title
//Author name
//Book price
//
//Create a Book object.
//Print the object directly using System.out.println(book);
//Examples

//Example 1:
//Input
//Enter book title:
//Clean Code
//Enter author name:
//Robert Martin
//Enter book price:
//        450
//Output
//
//Book[Title=Clean Code, Author=Robert Martin, Price=450.0]

//Example 2:
//Input
//Enter book title:
//Effective Java
//Enter author name:
//Joshua Bloch
//Enter book price:
//        650
//Output
//Book[Title=Effective Java, Author=Joshua Bloch, Price=650.0]
//Explanation
//
//toString() converts object data into readable text.
//It replaces the default class-name hash output.
//Printing an object automatically calls toString().
//Constraints
//Title length: 1–40
//Author name length: 1–30
//Price > 0

import java.util.*;

class  Book{
    private String title;
    private String author;
    private double price;

    Book(String title, String author, double price){
        if(price <= 0){
            System.out.println("Error: Price must be greater than zero");
            System.exit(0);
        }
        this.title = title;
        this.author = author;
        this.price = price;
    }

    public String toString(){
        return "Book[Title="+title+", Author="+author+", Price="+price+"]";
    }
}


public class BookInfoManagementSys {
    public static void main(String[] args) {
        // Write your code here
        Scanner sc = new Scanner(System.in);

        String title = sc.nextLine();
        String author = sc.nextLine();
        double price = sc.nextDouble();

        Book book = new Book(title, author, price);
        System.out.println(book.toString());

    }
}

