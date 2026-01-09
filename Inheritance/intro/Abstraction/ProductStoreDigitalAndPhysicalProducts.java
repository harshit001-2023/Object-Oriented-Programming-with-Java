/*Description
Develop a scenario based program by using abstract class and abstract method for displaying different kinds of Products like Digital Product and
Physical Product as well as discount and tax applicable on thses products

We need to develop one program on Hierarchical Inheritance, where Product is the super class and It has two sub classes DigitalProduct and PhysicalProduct.

Validate all the user inputs in constructor and where it is required.

Coding Requirements :
---------------------
Create one BLC class called Product.

Attributes/Properties/Fields :[Access Modifier private for all the fields]
-------------------------------------------------------------------
name : String
price : double
category : String

Take a parameterized constructor to initialize all the fields.

Methods :

a) Method Name : applyDiscount()
Argument : One argument of type double [double percentage]
Return Type : void
Access modifier : public and abstract


b) Method Name : calculateTax()
Argument : No Argument
Return Type : double
Access modifier : public and abstract


c) Setter and getter for price variable.

d) Generate toString() method to print Object properties.


Create another class DigitalProduct which extends from Product class.

Attributes/Properties/Fields :[Access Modifier private for all the fields]
-------------------------------------------------------------------------
licenseKey : String

Take a parameterized constructor to initialize all the fields.

Methods :
a) Override applyDiscount(double percentage) method
In this method find out the discount based on the given percentage on the product price.
Update the new price based on the given discount.
Print both Discount and Updated Price.


b)Override calculateTax() method
In this method you should return 5% tax on the discounted price.

c) Generate toString() to print all the fields


Create another class PhysicalProduct which extends from Product class.

Attributes/Properties/Fields :[Access Modifier private for all the fields]
-------------------------------------------------------------------------
shippingWeight : double

Take a parameterized constructor to initialize all the fields.

Methods :
a) Override applyDiscount(double percentage) method
In this method find out the discount based on the given percentage on the product price.
Update the new price based on the given discount.
Print both Discount and Updated Price.


b)Override calculateTax() method
In this method you should return 8% tax on the discounted price.

c)
Method Name : calculateShippingCost()
Argument : No argument
Return Type : double
Access modifier : public

In this method you need to calculate and return shipping cost of the Physical Product. The defined shipping cost is 5 RS per KG.

d) Generate toString() to print all the fields

Create an ELC class called ProductStore.

Inside main method display the following details as a Menu.
Select Product Type:
1. Digital Product
2. Physical Product

Write Switch case with Scanner class to select Digital OR Physical Product
Examples
Example 1:

Input

1
Java E Book
1499.89
Electronics
E_BUK_0001
Output

Digital Product:
Product Name: Java E Book
Category: Electronics
Price RS:1499.89
License Key: E_BUK_0001
Discount applied :149.989
New Price :1349.901
Tax RS :67.49505
Example 2:

Input

2
Laptop
112000
Electronics
2.9
Output

Physical Product:
Product Name: Laptop
Category: Electronics
Price RS:112000.0
Shipping Weight: 2.9 kg
Discount applied :16800.0
New Price :95200.0
Tax RS :7616.0
Shipping Cost RS :14.5*/

package Inheritance.intro.Abstraction;

import java.util.*;

abstract class Product {
    private String name;
    private double price;
    private String category;

    public Product(String name, double price, String category) {
        // Validation
        if (name == null || name.trim().isEmpty()) {
            throw new IllegalArgumentException("Error Invalid Input.");
        }
        if (price <= 0) {
            throw new IllegalArgumentException("Error Invalid Input.");
        }
        if (category == null || category.trim().isEmpty()) {
            throw new IllegalArgumentException("Error Invalid Input.");
        }

        this.name = name;
        this.price = price;
        this.category = category;
    }

    // Getters
    public String getName() { return name; }
    public String getCategory() { return category; }

    // Setter and Getter for price
    public void setPrice(double price) {
        if (price <= 0) {
            throw new IllegalArgumentException("Error Invalid Input.");
        }
        this.price = price;
    }

    public double getPrice() {
        return price;
    }

    // Abstract methods
    public abstract void applyDiscount(double percentage);
    public abstract double calculateTax();

    @Override
    public String toString() {
        return String.format("Product Name: %s\nCategory: %s\nPrice RS:%.2f",
                name, category, price);
    }
}

class DigitalProduct extends Product {
    private String licenseKey;

    public DigitalProduct(String name, double price, String category, String licenseKey) {
        super(name, price, category);
        if (licenseKey == null || licenseKey.trim().isEmpty()) {
            throw new IllegalArgumentException("Error Invalid Input.");
        }
        this.licenseKey = licenseKey;
    }

    @Override
    public void applyDiscount(double percentage) {
        double currentPrice = getPrice();
        double discount = (currentPrice * percentage) / 100;
        double discountedPrice = currentPrice - discount;

        setPrice(discountedPrice);  // Update the price with discount

        IO.println("Discount applied :" + discount);
        IO.println("New Price :" + discountedPrice);
    }

    @Override
    public double calculateTax() {
        double taxRate = 0.05;  // 5% tax for digital products
        return getPrice() * taxRate;
    }

    @Override
    public String toString() {
        return "Digital Product:\n" + super.toString() +
                "\nLicense Key: " + licenseKey;
    }
}

class PhysicalProduct extends Product {
    private double shippingWeight;

    public PhysicalProduct(String name, double price, String category, double shippingWeight) {
        super(name, price, category);
        if (shippingWeight <= 0) {
            throw new IllegalArgumentException("Error Invalid Input.");
        }
        this.shippingWeight = shippingWeight;
    }

    @Override
    public void applyDiscount(double percentage) {
        double currentPrice = getPrice();
        double discount = (currentPrice * percentage) / 100;
        double discountedPrice = currentPrice - discount;

        setPrice(discountedPrice);  // Update the price with discount

        IO.println("Discount applied :" + discount);
        IO.println("New Price :" + discountedPrice);
    }

    @Override
    public double calculateTax() {
        double taxRate = 0.08;  // 8% tax for physical products
        return getPrice() * taxRate;
    }

    public double calculateShippingCost() {
        double ratePerKg = 5.0;
        return shippingWeight * ratePerKg;
    }

    @Override
    public String toString() {
        return "Physical Product:\n" + super.toString() +
                "\nShipping Weight: " + shippingWeight + " kg";
    }
}

class ProductStore {
    public static void main(String[] args) {
        try {
            int choice = Integer.parseInt(IO.readln());

            switch(choice) {
                case 1:
                    processDigitalProduct();
                    break;
                case 2:
                    processPhysicalProduct();
                    break;
                default:
                    IO.println("Invalid choice!");
            }
        } catch (NumberFormatException e) {
            IO.println("Error Invalid Input.");
        } catch (IllegalArgumentException e) {
            IO.println(e.getMessage());
        } catch (Exception e) {
            IO.println("Error Invalid Input.");
        }
    }

    private static void processDigitalProduct() {
        try {
            String name = IO.readln();
            double price = Double.parseDouble(IO.readln());
            String category = IO.readln();
            String licenseKey = IO.readln();
            double discountPercent = Double.parseDouble(IO.readln());

            DigitalProduct digitalProduct = new DigitalProduct(name, price, category, licenseKey);

            IO.println(digitalProduct.toString());
            digitalProduct.applyDiscount(discountPercent);
            double tax = digitalProduct.calculateTax();
            IO.println("Tax RS :" + tax);
        } catch (Exception e) {
            IO.println("Error Invalid Input.");
        }
    }

    private static void processPhysicalProduct() {
        try {
            String name = IO.readln();
            double price = Double.parseDouble(IO.readln());
            String category = IO.readln();
            double shippingWeight = Double.parseDouble(IO.readln());
            double discountPercent = Double.parseDouble(IO.readln());

            PhysicalProduct physicalProduct = new PhysicalProduct(name, price, category, shippingWeight);

            IO.println(physicalProduct.toString());
            physicalProduct.applyDiscount(discountPercent);
            double tax = physicalProduct.calculateTax();
            IO.println("Tax RS :" + tax);
            double shippingCost = physicalProduct.calculateShippingCost();
            IO.println("Shipping Cost RS :" + shippingCost);
        } catch (Exception e) {
            IO.println("Error Invalid Input.");
        }
    }
}