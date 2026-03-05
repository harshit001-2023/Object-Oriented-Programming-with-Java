package TheCollectionsFrameworks.Assignment;

/*Assignment :
----------------------
Develop a scenario based program by using Collections Framework for processing the TheCollectionsFrameworks.Assignment.Library Management System
using different available options like Display books in the TheCollectionsFrameworks.Assignment.Library, Issue a book, search a particular book in the library.

Create a record called TheCollectionsFrameworks.Assignment.Book.

Components :
 id : Integer
 title : String
 author : String



Create another BLC class TheCollectionsFrameworks.Assignment.Library which contains following non static
methods :

1) Method Name     : displayAvailableBooks()
Argument           : 1 Parameter of type Vector<TheCollectionsFrameworks.Assignment.Book>
Return Type        : void
Access modifier    : public
In this method display all the available books in the TheCollectionsFrameworks.Assignment.Library.[See the Test cases for More Details]

2) Method Name     : issueBook()
Argument           : 2 Parameters [Vector<TheCollectionsFrameworks.Assignment.Book>, IO io]
Return Type        : void
Access modifier    : public
In this method issueBook from the TheCollectionsFrameworks.Assignment.Library based on the id of the TheCollectionsFrameworks.Assignment.Book, If TheCollectionsFrameworks.Assignment.Book is available (based on the id) then remove() the TheCollectionsFrameworks.Assignment.Book from the TheCollectionsFrameworks.Assignment.Library otherwise give an error message  "TheCollectionsFrameworks.Assignment.Book with ID 103 not Found"
[See Test cases for More details]


3) Method Name     : searchBook()
Argument           : 2 parameters [Vector<TheCollectionsFrameworks.Assignment.Book>, IO io]
Return Type        : void
Access modifier    : public
In this method search a TheCollectionsFrameworks.Assignment.Book from the TheCollectionsFrameworks.Assignment.Library by using title OR author, If TheCollectionsFrameworks.Assignment.Book is available either by title OR Author then give a message "TheCollectionsFrameworks.Assignment.Book Found", If not available then give an error message "No matching books found."


Create an ELC class called LibraryManagement which contains main method.
Inside main method Create Vector class object to add books available in the library. [See the Test cases for TheCollectionsFrameworks.Assignment.Library Books]

Inside main method display the following details as a Menu.
Select from the Menu :
	 1) Display Books Available in the TheCollectionsFrameworks.Assignment.Library :
	 2) Search a TheCollectionsFrameworks.Assignment.Book in the TheCollectionsFrameworks.Assignment.Library :
	 3) Issue a TheCollectionsFrameworks.Assignment.Book from the TheCollectionsFrameworks.Assignment.Library :
	 4) Exit from the application :
Please Enter your Choice :

Write Switch case with IO class to perform Various operation with
TheCollectionsFrameworks.Assignment.Library System.

Test Cases for Output :
------------------------
Test Case 1 :
-------------
Select from the Menu :
	 1) Display Books Available in the TheCollectionsFrameworks.Assignment.Library :
	 2) Search a TheCollectionsFrameworks.Assignment.Book in the TheCollectionsFrameworks.Assignment.Library :
	 3) Issue a TheCollectionsFrameworks.Assignment.Book from the TheCollectionsFrameworks.Assignment.Library :
	 4) Exit from the application :
Please Enter your Choice :
1
Available Books in the TheCollectionsFrameworks.Assignment.Library :
  TheCollectionsFrameworks.Assignment.Book[id=101, title=Core Java, author=Mr James]
  TheCollectionsFrameworks.Assignment.Book[id=102, title=Adv Java, author=Mr Robert]
  TheCollectionsFrameworks.Assignment.Book[id=103, title=Head First Java, author=Miss Kathy Sierra]
  TheCollectionsFrameworks.Assignment.Book[id=104, title=Programming in C , author=Mr Denis]
Please Enter your Choice :




Test Case 2 :
-------------
Select from the Menu :
	 1) Display Books Available in the TheCollectionsFrameworks.Assignment.Library :
	 2) Search a TheCollectionsFrameworks.Assignment.Book in the TheCollectionsFrameworks.Assignment.Library :
	 3) Issue a TheCollectionsFrameworks.Assignment.Book from the TheCollectionsFrameworks.Assignment.Library :
	 4) Exit from the application :

Please Enter your Choice :
2

Enter keyword to search by title or author: Core Java
Found: TheCollectionsFrameworks.Assignment.Book[id=101, title=Core Java, author=Mr James]
Please Enter your Choice :



Test Case 3 :
-------------
3

 Enter TheCollectionsFrameworks.Assignment.Book id which for TheCollectionsFrameworks.Assignment.Book issue :102
 Issued: TheCollectionsFrameworks.Assignment.Book[id=102, title=Adv Java, author=Mr Robert]
Please Enter your Choice :
1
Available Books in the TheCollectionsFrameworks.Assignment.Library :
  TheCollectionsFrameworks.Assignment.Book[id=101, title=Core Java, author=Mr James]
  TheCollectionsFrameworks.Assignment.Book[id=103, title=Head First Java, author=Miss Kathy Sierra]
  TheCollectionsFrameworks.Assignment.Book[id=104, title=Programming in C , author=Mr Denis]


Test Cases 4 :
--------------
Select from the Menu :
	 1) Display Books Available in the TheCollectionsFrameworks.Assignment.Library :
	 2) Search a TheCollectionsFrameworks.Assignment.Book in the TheCollectionsFrameworks.Assignment.Library :
	 3) Issue a TheCollectionsFrameworks.Assignment.Book from the TheCollectionsFrameworks.Assignment.Library :
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
Available Books in the TheCollectionsFrameworks.Assignment.Library :
  TheCollectionsFrameworks.Assignment.Book[id=101, title=Core Java, author=Mr James]
  TheCollectionsFrameworks.Assignment.Book[id=102, title=Adv Java, author=Mr Robert]
  TheCollectionsFrameworks.Assignment.Book[id=103, title=Head First Java, author=Miss Kathy Sierra]
  TheCollectionsFrameworks.Assignment.Book[id=104, title=Programming in C , author=Mr Denis]
Please Enter your Choice :
2

Enter keyword to search by title or author: Python
No matching books found.


Test Cases 2:
-------------
Please Enter your Choice :
1
Available Books in the TheCollectionsFrameworks.Assignment.Library :
  TheCollectionsFrameworks.Assignment.Book[id=101, title=Core Java, author=Mr James]
  TheCollectionsFrameworks.Assignment.Book[id=102, title=Adv Java, author=Mr Robert]
  TheCollectionsFrameworks.Assignment.Book[id=103, title=Head First Java, author=Miss Kathy Sierra]
  TheCollectionsFrameworks.Assignment.Book[id=104, title=Programming in C , author=Mr Denis]
Please Enter your Choice :
3

 Enter TheCollectionsFrameworks.Assignment.Book id which for TheCollectionsFrameworks.Assignment.Book issue :109
 Please Enter your Choice :
 TheCollectionsFrameworks.Assignment.Book with ID 109 not found.*/

import java.util.Scanner;
import java.util.Vector;

// Record for Book - default toString() produces exact required format
record Book(int id, String title, String author) {}

class Library {

    // Display all available books
    public void displayAvailableBooks(Vector<Book> books) {
        System.out.println("Available Books in the Library :");
        for(Book book : books) {
            System.out.println("  " + book);
        }
    }

    // Issue a book by ID with exact output messages
    public void issueBook(Vector<Book> books, Scanner scanner) {
        System.out.print("\nEnter Book id which for Book issue :");
        int idToIssue = scanner.nextInt();
        scanner.nextLine();

        boolean found = false;
        for (int i = 0; i < books.size(); i++) {
            if (books.get(i).id() == idToIssue) {
                Book issued = books.remove(i); // Safe removal by index
                System.out.println("Issued: " + issued);
                found = true;
                break;
            }
        }
        if (!found) {
            System.out.println("Book with ID " + idToIssue + " not found.");
        }
    }

    // Search book by title OR author (case-insensitive)
    public void searchBook(Vector<Book> books, Scanner scanner) {
        System.out.print("\nEnter keyword to search by title or author: ");
        String query = scanner.nextLine();

        boolean found = false;
        for (Book book : books) {
            if (book.title().equalsIgnoreCase(query) ||
                    book.author().equalsIgnoreCase(query)) {
                System.out.println("Found: " + book);
                found = true;
                break;
            }
        }
        if (!found) {
            System.out.println("No matching books found.");
        }
    }
}

// ELC class with main method (as per assignment)
public class LibraryManagement {
    public static void main(String[] args) {
        Vector<Book> books = new Vector<>();
        Library library = new Library();
        Scanner scanner = new Scanner(System.in);

        // Initialize library with test case books
        books.add(new Book(101, "Core Java", "Mr James"));
        books.add(new Book(102, "Adv Java", "Mr Robert"));
        books.add(new Book(103, "Head First Java", "Miss Kathy Sierra"));
        books.add(new Book(104, "Programming in C ", "Mr Denis"));

        int choice;
        // Continuous menu loop until user selects Exit (option 4)
        do {
            System.out.println("\nSelect from the Menu :");
            System.out.println("\t 1) Display Books Available in the Library :");
            System.out.println("\t 2) Search a Book in the Library :");
            System.out.println("\t 3) Issue a Book from the Library :");
            System.out.println("\t 4) Exit from the application :");
            System.out.print("Please Enter your Choice :\n");

            choice = scanner.nextInt();
            scanner.nextLine(); // Consume newline after int input

            switch (choice) {
                case 1:
                    library.displayAvailableBooks(books);
                    break;
                case 2:
                    library.searchBook(books, scanner);
                    break;
                case 3:
                    library.issueBook(books, scanner);
                    break;
                case 4:
                    System.out.println("Thank you for Visiting..");
                    break;
                default:
                    System.out.println("Invalid choice. Please try again.");
            }
        } while (choice != 4); // Loop continues until exit

        scanner.close();
    }
}