package Basics.elc;

import Basics.blc.Book;

public class DemoBook {
    static void main() {
        String title = IO.readln("Enter Book Title: ");
        String author = IO.readln("Enter Author Name: ");
        double price = Double.parseDouble(IO.readln("Enter Book Price: "));

        Book book = new Book(title, author, price);
        book.applyDiscount(10);
        IO.println(book);
    }
}
