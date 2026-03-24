package TheCollectionsFrameworks.Set;

/*1. Product_Management_System
Easy
100 points
• 120 min suggested
Problem Description
Create a record called Product which is accepting two components pid and pname.

Write one compact constructor to throw IllegalArgumentException if pid is zero or Negative.

Create one TreeSet class which will hold the Custom product object.

With the help of TreeSet constructor using Comparator interface, write the logic to sort the Product data on the following basis

1) Sort based on the pid in ascending order.
2) Sort based on the pid in descending order.
3) Sort based on the name in Alphabetical order.
4) Sort based on the name in Reverse order.

Examples
Example 1
Input:
Test Case 1: Sort by PID (Ascending Order)
User Input:
text
Enter number of products: 5

Enter Product ID: 203
Enter Product Name: Laptop

Enter Product ID: 101
Enter Product Name: Mouse

Enter Product ID: 305
Enter Product Name: Keyboard

Enter Product ID: 102
Enter Product Name: Monitor

Enter Product ID: 404
Enter Product Name: Printer
Output:
=== SORT BY PID (ASCENDING) ===
Product[pid=101, pname='Mouse']
Product[pid=102, pname='Monitor']
Product[pid=203, pname='Laptop']
Product[pid=305, pname='Keyboard']
Product[pid=404, pname='Printer']*/

import java.util.*;

// Record with Compact Constructor for validation
record Product(int pid, String pname) {
    public Product {
        if (pid <= 0) {
            throw new IllegalArgumentException("Product ID cannot be zero or Negative.");
        }
    }

    @Override
    public String toString() {
        return "Product[pid=" + pid + ", pname='" + pname + "']";
    }
}

public class ProductManagementSys {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        if (!sc.hasNextInt()) return;
        IO.println("Enter your choice: ");
        int choice = sc.nextInt(); // 1, 2, 3, or 4

        if (!sc.hasNextInt()) return;
        int n = sc.nextInt(); // Number of products

        List<Product> list = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            int id = sc.nextInt();
            sc.nextLine(); // consume newline
            String name = sc.nextLine();
            list.add(new Product(id, name));
        }

        TreeSet<Product> sortedSet;

        switch (choice) {
            case 1 -> {
                System.out.println("--- Sorting by PID (Ascending) ---\n");
                sortedSet = new TreeSet<>(Comparator.comparingInt(Product::pid));
                display(sortedSet, list);
            }
            case 2 -> {
                System.out.println("--- Sorting by PID (Descending) ---\n");
                sortedSet = new TreeSet<>((p1, p2) -> Integer.compare(p2.pid(), p1.pid()));
                display(sortedSet, list);
            }
            case 3 -> {
                System.out.println("--- Sorting by Name (Alphabetical) ---\n");
                sortedSet = new TreeSet<>(Comparator.comparing(Product::pname));
                display(sortedSet, list);
            }
            case 4 -> {
                System.out.println("--- Sorting by Name (Reverse Order) ---\n");
                sortedSet = new TreeSet<>(Comparator.comparing(Product::pname).reversed());
                display(sortedSet, list);
            }
        }
        sc.close();
    }

    private static void display(TreeSet<Product> set, List<Product> list) {
        set.addAll(list);
        System.out.println("Sorted Products:");
        for (Product p : set) {
            System.out.println(p);
        }
    }
}
