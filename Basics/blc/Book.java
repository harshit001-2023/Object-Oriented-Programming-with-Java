/*Assignment 03 :
---------------
Design a Book printing System

Create a class  Book (BLC Class)

Attributes/Properties :[private access modifier for all the fields]

Name		     data type
-------		      -----------
title                 :String
author       	      :String
price 		      :double

Implement a parameterized constructor to initialize all the fields

Methods :
Genearte toString() method to print object properties.

Method Name		:applyDiscount(double discountPercentage)
Return type		:void
Acess modifier	        :public


Take Main class (ELC Class) which having in main method  and execute the main method


Test Cases :
--------------

Test Case 1:
 Applying Invalid Discount (Negative)

Error: Invalid discount percentage.
Title: 1984
Author: George Orwell
Price: 14.391

Test Case 2: Creating Book with Negative Price
Error : Book Price cannot be negative.
Title: Negative Price Book
Author: No Author
Price: -5.0*/

package Basics.blc;

public class Book {
    private String title;
    private String author;
    private double price;

    public Book(String title, String author, double price){
        this.title = title;
        this.author = author;
        this.price = price;

        if (price < 0) {
            System.err.println("Error Book price cannot be Negative.");
            System.exit(0);
        }
    }

    public void applyDiscount(double discountPercentage){
        if (price >= 500) {
            price = price - (price * discountPercentage) / 100;
            IO.println("You got discount of " + discountPercentage + "\nThe discounted value is " + price);
        }else IO.println("Discount is only applied to Book Price more than 500.");

        IO.println("Thank you!");
    }

    @Override
    public String toString() {
        return "Book{" +
                "title='" + title + '\'' +
                ", author='" + author + '\'' +
                ", price=" + price +
                '}';
    }
}
