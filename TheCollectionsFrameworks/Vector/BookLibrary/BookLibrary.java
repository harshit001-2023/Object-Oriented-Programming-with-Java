package TheCollectionsFrameworks.Vector.BookLibrary;

import java.util.ArrayList;
import java.util.Scanner;

public class BookLibrary {
    public static void main(String[] args) {
        Library library = new Library();
        Scanner scanner = new Scanner(System.in);
        int choice;

        // Continuous menu loop until user selects Exit (option 5)
        do {
            System.out.println("\n1. Add Book");
            System.out.println("2. Display Books");
            System.out.println("3. Update Quantity");
            System.out.println("4. Delete Book");
            System.out.println("5. Exit");
            System.out.print("Choose an option: ");

            choice = scanner.nextInt();
            scanner.nextLine(); // Consume newline

            switch (choice) {
                case 1:
                    // Add Book
                    System.out.print("Enter Title: ");
                    String title = scanner.nextLine();
                    System.out.print("Enter Author: ");
                    String author = scanner.nextLine();
                    System.out.print("Enter ISBN: ");
                    long isbn = scanner.nextLong();
                    System.out.print("Enter Price: ");
                    double price = scanner.nextDouble();
                    System.out.print("Enter Quantity: ");
                    int quantity = scanner.nextInt();
                    scanner.nextLine(); // Consume newline

                    Book newBook = new Book(title, author, isbn, price, quantity);
                    library.addBook(newBook);
                    break;

                case 2:
                    // Display Books
                    library.displayAllBooks();
                    break;

                case 3:
                    // Update Quantity
                    System.out.print("Enter ISBN: ");
                    long searchIsbn = scanner.nextLong();
                    scanner.nextLine(); // Consume newline

                    Book bookToUpdate = library.searchBookByISBN(searchIsbn);
                    if (bookToUpdate != null) {
                        System.out.println("Updating quantity of book :");
                        System.out.print("Enter new Quantity: ");
                        int newQuantity = scanner.nextInt();
                        scanner.nextLine(); // Consume newline
                        library.updateBookQuantityByISBN(searchIsbn, newQuantity);
                    } else {
                        System.out.println("Book with ISBN " + searchIsbn + " not found.");
                    }
                    break;

                case 4:
                    // Delete Book
                    System.out.print("Enter Book Title: ");
                    String bookTitle = scanner.nextLine();
                    library.deleteBookByTitle(bookTitle);
                    break;

                case 5:
                    System.out.println("Exiting from the Application. Thank you!!!");
                    break;

                default:
                    System.out.println("Invalid choice. Please try again.");
            }
        } while (choice != 5);

        scanner.close();
    }
}

class Book {
    private String title;
    private String author;
    private long isbn;
    private double price;
    private int quantity;

    public Book(String title, String author, long isbn, double price, int quantity) {
        this.title = title;
        this.author = author;
        this.isbn = isbn;
        this.price = price;
        this.quantity = quantity;
    }

    // Getters
    public String getTitle() {
        return title;
    }

    public String getAuthor() {
        return author;
    }

    public long getIsbn() {
        return isbn;
    }

    public double getPrice() {
        return price;
    }

    public int getQuantity() {
        return quantity;
    }

    // Setters
    public void setTitle(String title) {
        this.title = title;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public void setIsbn(long isbn) {
        this.isbn = isbn;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    public String displayBook() {
        return "(title=" + title + ", author=" + author + ", isbn=" + isbn +
                ", price=" + price + ", quantity=" + quantity + ")";
    }
}

class Library {
    private ArrayList<Book> books;

    public Library() {
        this.books = new ArrayList<Book>();
    }

    // Private helper method to search book by ISBN
    Book searchBookByISBN(long isbn) {
        for (Book book : this.books) {
            if (book.getIsbn() == isbn) {
                return book;
            }
        }
        return null;
    }

    // Public method to add book
    public void addBook(Book book) {
        // Check if book with same ISBN already exists
        Book existingBook = searchBookByISBN(book.getIsbn());

        if (existingBook != null) {
            System.out.println("Book with the same ISBN " + book.getIsbn() + " already exists.");
        } else {
            this.books.add(book);
            System.out.println("Book added successfully.");
        }
    }

    // Public method to display all books
    public void displayAllBooks() {
        if (books.isEmpty()) {
            System.out.println("No books in the library.");
        } else {
            for (Book book : this.books) {
                System.out.println(book.displayBook());
            }
        }
    }

    // Public method to update book quantity by ISBN
    public void updateBookQuantityByISBN(long isbn, int newQuantity) {
        // Validate quantity
        if (newQuantity <= 0) {
            System.out.println("Invalid quantity.");
            return;
        }

        Book book = searchBookByISBN(isbn);

        if (book != null) {
            book.setQuantity(newQuantity);
            System.out.println("Quantity updated successfully. new quantity = " + newQuantity);
        } else {
            System.out.println("Book with ISBN " + isbn + " not found.");
        }
    }

    // Public method to delete book by title
    public void deleteBookByTitle(String title) {
        // Validate title
        if (title == null || title.trim().isEmpty()) {
            System.out.println("Book Title cannot be blank");
            return;
        }

        boolean found = false;
        for (int i = 0; i < books.size(); i++) {
            if (books.get(i).getTitle().equalsIgnoreCase(title)) {
                books.remove(i);
                System.out.println(title + " book has removed successfully...");
                found = true;
                break;
            }
        }

        if (!found) {
            System.out.println("Book with title '" + title + "' not found.");
        }
    }
}