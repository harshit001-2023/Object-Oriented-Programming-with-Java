package TheCollectionsFrameworks.Set;

/*2. BookSorted
Easy
100 points
• 120 min suggested
Problem Description
Create a record called Book which take two components name and author.

Implement this Book record with Comparable interface to sort the books based on the name using compareTo() method.

Create an ELC class BookSorted which will sort the book based on the name.

Create one TreeSet object which will hold Book as a custom object.

Insert 5 book records using custom object.

Display all the books sorted in alphabetial order.

Examples
Example 1
Input:
Enter number of books to add: 4

--- Book 1 ---
Enter Book Name: The Hobbit
Enter Author Name: J.R.R. Tolkien
✓ Book added successfully!

--- Book 2 ---
Enter Book Name: Animal Farm
Enter Author Name: George Orwell
✓ Book added successfully!

--- Book 3 ---
Enter Book Name: The Hobbit
Enter Author Name: J.R.R. Tolkien
⚠ Book already exists! (Duplicate based on name)

--- Book 4 ---
Enter Book Name:
Enter Author Name: Empty Name
Error: Book name cannot be null or empty
Output:
BOOKS SORTED BY NAME (ALPHABETICAL ORDER):
==================================================
1. 'Animal Farm' by George Orwell
2. 'The Hobbit' by J.R.R. Tolkien

Total books: 2*/

import java.util.*;

// 1. Create a record called Book implementing Comparable
record Book(String name, String author) implements Comparable<Book> {

    // Compact constructor to handle validation
    public Book {
        if (name == null || name.trim().isEmpty()) {
            throw new IllegalArgumentException("Book name cannot be null or empty");
        }
    }

    // 2. Implement compareTo to sort based on the book name
    @Override
    public int compareTo(Book other) {
        return this.name.compareToIgnoreCase(other.name);
    }

    @Override
    public String toString() {
        return "'" + name + "' by " + author;
    }
}

// 3. ELC class BookSorted
public class BookSorted {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // 4. Create TreeSet to hold Book objects
        // Because Book implements Comparable, TreeSet knows how to sort them
        TreeSet<Book> bookSet = new TreeSet<>();

        System.out.print("Enter number of books to add: ");
        int n = sc.nextInt();
        sc.nextLine(); // Consume newline

        for (int i = 1; i <= n; i++) {
            System.out.println("\n--- Book " + i + " ---");
            try {
                System.out.print("Enter Book Name: ");
                String name = sc.nextLine();
                System.out.print("Enter Author Name: ");
                String author = sc.nextLine();

                Book newBook = new Book(name, author);

                // TreeSet.add() returns false if the element already exists
                // (based on compareTo returning 0)
                if (bookSet.add(newBook)) {
                    System.out.println("✓ Book added successfully!");
                } else {
                    System.out.println("⚠ Book already exists! (Duplicate based on name)");
                }
            } catch (IllegalArgumentException e) {
                System.out.println("Error: " + e.getMessage());
            }
        }

        // 5. Display the results
        System.out.println("\nBOOKS SORTED BY NAME (ALPHABETICAL ORDER):");
        System.out.println("==================================================");

        int count = 1;
        for (Book b : bookSet) {
            System.out.println(count + ". " + b);
            count++;
        }

        System.out.println("\nTotal books: " + bookSet.size());

        sc.close();
    }
}
