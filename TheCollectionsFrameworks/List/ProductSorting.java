package TheCollectionsFrameworks.List;

/*Program 1:
------------
Write a Program to perform sorting operation on Product class using ArrayList by implementing
Comparable interface.

Create a BLC class Product.

Instance variables:
productNumber-private-Integer
productName-private-String
productPrice-private-Double

Create a parameterized constructor to initialize the instance variable of Product class.

Implement Comparable interface to write the logic to sort the Product class based on the Product Name.

Create an ELC class which contains main method, create ArrayList object to hold Product data as well as
 sort the product data object based on the product name.*/

import java.util.ArrayList;
import java.util.Collections;

class Product implements Comparable<Product> {
    private final Integer productNumber;
    private final String productName;
    private final Double productPrice;

    public Product(Integer productNumber, String productName, Double productPrice) {
        this.productNumber = productNumber;
        this.productName = productName;
        this.productPrice = productPrice;
    }

    @Override
    public int compareTo(Product p) {
        return this.productNumber.compareTo(p.productNumber);
    }

    @Override
    public String toString() {
        return "Product [productNumber=" + productNumber +
                ", productName=" + productName +
                ", productPrice=" + productPrice + "]";
    }
}

class ProductSortingDemo {
    static void main() {
        ArrayList<Product> products = new ArrayList<>();

        products.add(new Product(105, "Monitor", 249.99));
        products.add(new Product(104, "Headphones", 79.99));
        products.add(new Product(102, "Smartphone", 599.99));
        products.add(new Product(101, "Laptop", 999.99));
        products.add(new Product(103, "Tablet", 299.99));

        IO.println("Products Before Sorting");
        for (Product product : products) {
            IO.println(product);
        }

        Collections.sort(products);

        IO.println("\nProducts After Sorting (by Product Number)");
        for (Product product : products) {
            IO.println(product);
        }
    }
}
