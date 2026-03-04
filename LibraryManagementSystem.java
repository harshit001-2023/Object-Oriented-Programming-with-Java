/*Assignment :
----------------------
Develop a scenario based program by using Collections Framework for processing the Library Management System
using different available options like Display books in the Library, Issue a book, search a particular book in the library.

Create a record called Book.

Components :
 id : Integer
 title : String
 author : String



Create another BLC class Library which contains following non static
methods :

1) Method Name     : displayAvailableBooks()
Argument           : 1 Parameter of type Vector<Book>
Return Type        : void
Access modifier    : public
In this method display all the available books in the Library.[See the Test cases for More Details]

2) Method Name     : issueBook()
Argument           : 2 Parameters [Vector<Book>, IO io]
Return Type        : void
Access modifier    : public
In this method issueBook from the Library based on the id of the Book, If Book is available (based on the id) then remove() the Book from the Library otherwise give an error message  "Book with ID 103 not Found"
[See Test cases for More details]


3) Method Name     : searchBook()
Argument           : 2 parameters [Vector<Book>, IO io]
Return Type        : void
Access modifier    : public
In this method search a Book from the Library by using title OR author, If Book is available either by title OR Author then give a message "Book Found", If not available then give an error message "No matching books found."


Create an ELC class called LibraryManagement which contains main method.
Inside main method Create Vector class object to add books available in the library. [See the Test cases for Library Books]

Inside main method display the following details as a Menu.
Select from the Menu :
	 1) Display Books Available in the Library :
	 2) Search a Book in the Library :
	 3) Issue a Book from the Library :
	 4) Exit from the application :
Please Enter your Choice :

Write Switch case with IO class to perform Various operation with
Library System.

Test Cases for Output :
------------------------
Test Case 1 :
-------------
Select from the Menu :
	 1) Display Books Available in the Library :
	 2) Search a Book in the Library :
	 3) Issue a Book from the Library :
	 4) Exit from the application :
Please Enter your Choice :
1
Available Books in the Library :
  Book[id=101, title=Core Java, author=Mr James]
  Book[id=102, title=Adv Java, author=Mr Robert]
  Book[id=103, title=Head First Java, author=Miss Kathy Sierra]
  Book[id=104, title=Programming in C , author=Mr Denis]
Please Enter your Choice :




Test Case 2 :
-------------
Select from the Menu :
	 1) Display Books Available in the Library :
	 2) Search a Book in the Library :
	 3) Issue a Book from the Library :
	 4) Exit from the application :

Please Enter your Choice :
2

Enter keyword to search by title or author: Core Java
Found: Book[id=101, title=Core Java, author=Mr James]
Please Enter your Choice :



Test Case 3 :
-------------
3

 Enter Book id which for Book issue :102
 Issued: Book[id=102, title=Adv Java, author=Mr Robert]
Please Enter your Choice :
1
Available Books in the Library :
  Book[id=101, title=Core Java, author=Mr James]
  Book[id=103, title=Head First Java, author=Miss Kathy Sierra]
  Book[id=104, title=Programming in C , author=Mr Denis]


Test Cases 4 :
--------------
Select from the Menu :
	 1) Display Books Available in the Library :
	 2) Search a Book in the Library :
	 3) Issue a Book from the Library :
	 4) Exit from the application :
Please Enter your Choice :
4
Thank you for Visiting..


Test Cases for Input Validation :
---------------------------------
Test Cases 1:
-------------
Please Enter your Choice :
1
Available Books in the Library :
  Book[id=101, title=Core Java, author=Mr James]
  Book[id=102, title=Adv Java, author=Mr Robert]
  Book[id=103, title=Head First Java, author=Miss Kathy Sierra]
  Book[id=104, title=Programming in C , author=Mr Denis]
Please Enter your Choice :
2

Enter keyword to search by title or author: Python
No matching books found.


Test Cases 2:
-------------
Please Enter your Choice :
1
Available Books in the Library :
  Book[id=101, title=Core Java, author=Mr James]
  Book[id=102, title=Adv Java, author=Mr Robert]
  Book[id=103, title=Head First Java, author=Miss Kathy Sierra]
  Book[id=104, title=Programming in C , author=Mr Denis]
Please Enter your Choice :
3

 Enter Book id which for Book issue :109
 Please Enter your Choice :
 Book with ID 109 not found.*/

import java.util.Scanner;
import java.util.Vector;

record Book(int id, String title, String author) {

}

class Library {
    private int id;
    private String title;
    private String author;


    @Override
    public String toString() {
        return "Book{id=" + id + ", title='" + title + "', author='" + author + "'}";
    }

    public void displayAvailableBook(Vector<Book> books) {
        for(Book book : books) {
            System.out.println(book.toString());
        }
    }

    // ... displayAvailableBooks method ...
    public void issueBook(Vector<Book> books, int idToIssue) {
        boolean found = false;
        for (Book book : books) {
            if (book.id() == idToIssue) {
                books.remove(book);
                found = true;
                System.out.println("Book with ID " + idToIssue + " issued successfully.");
                break;
            }
        }
        if (!found) {
            System.out.println("Book with ID " + idToIssue + " not Found");
        }
    }
        // Other methods will go here
        public void searchBook(Vector<Book> books, String query) {
            boolean found = false;
            for (Book book : books) {
                if (book.title().equalsIgnoreCase(query) || book.author().equalsIgnoreCase(query)) {
                    found = true;
                    System.out.println("Book Found: " + book.toString());
                    break;
                }
            }
            if (!found) {
                System.out.println("No matching books found..");
            }
        }
    }
public class LibraryManagementSystem {

    void main() {
        Vector<Book> books = new Vector<>();
        Library library = new Library();
        books.add(new Book(1, "Book 1", "Author 1"));
        books.add(new Book(2, "Book 2", "Author 2"));
        books.add(new Book(3, "Book 3", "Author 3"));
        books.add(new Book(4, "Book 4", "Author 4"));
        books.add(new Book(5, "Book 5", "Author 5"));
        books.add(new Book(6, "Book 6", "Author 6"));

        IO.println("Select from the Menu :");
        IO.println("1) Display Books Available in the Library :");
        IO.println("2) Search a Book in the Library :");
        IO.println("3) Issue a Book from the Library :");
        IO.println("4) Exit from the application :");
        int choice = Integer.parseInt(IO.readln("Please Enter your Choice :"));

        switch (choice) {
            case 1:
                library.displayAvailableBook(books);
                break;
            case 2:
                String keyword = IO.readln("Enter keyword to search by title or author: ");
                library.searchBook(books, keyword);
                break;
            case 3:
                int id = Integer.parseInt(IO.readln("Enter Book id which for Book issue : "));
                library.issueBook(books, id);
                break;
            case 4:
                IO.println("Thank you for Visiting..");
                break;
            default:
                IO.println("Invalid choice.");
                break;
        }
    }
}