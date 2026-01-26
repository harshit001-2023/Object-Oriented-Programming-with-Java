package abstractionConcepts.assignment1;/*3. abstractionConcepts.assignment1.CakeOrderMain
Easy
100 points
• 130 min suggested
Problem Description
Create a program on abstract class to display abstractionConcepts.assignment1.Cake details with message and without
event message.

Coding Requirements :
--------------------
Create a BLC class called abstractionConcepts.assignment1.Cake with following attributes :

Attributes/Properties/Fields: [Access modifier is private for all the fields]

Attribute Name : shape String
Attribute Name :flavor String
Attribute Name :quantity int
public static double price = 400;

Create a Parameterized Constructor to initialize only shape, flavor and quantity.
[Don't initialize price through Constructor, Manual Initialization]

Methods :
  1) Define setters and getters for all non static fields
  2) Name of the method : toString()
     Return Type : String
     Modifier : public.
     Task : It must return the data as per below format/example.
     "A Round Chocolate abstractionConcepts.assignment1.Cake Of 4 KG is Ready @ Rs.1600.0"

Create an inherited class "abstractionConcepts.assignment1.OrderedCake". Inherit this from "abstractionConcepts.assignment1.Cake"
Define the following Attributes
Attributes: [private for all the fields]
Attribute name : message String

Constructors:(3 only)
   1) No argument Constructor : Ensure shape is Round, flavour is Vanilla,
      qty is 1 kg and price is 400. [see the output test cases]
   2) Parameterized public Constructor : For shape,flavor,quantity
   3) Parameterized public Constructor : For shape,flavor,quantity and message.
   Price is to be dynamically changed @400 per Kg.
Methods :
Name of the method : toString()
     Return Type : String
     Modifier : public.
     Task :Print the following if message is not null
    "A Square Pineapple abstractionConcepts.assignment1.Cake of 3KG is Ready with Happy Birthday message @ Rs.1200.0".
      Otherwise display the message from superclass.


Create an ELC class abstractionConcepts.assignment1.CakeOrderMain to display cake details with price and message.

Examples
Example 1
Input:
Sample Input
---------------------
abstractionConcepts.assignment1.Cake Name: Chocolate
abstractionConcepts.assignment1.Cake Type: Round
abstractionConcepts.assignment1.Cake Quantity: 4
Output:
Sample Output:
A Round Chocolate abstractionConcepts.assignment1.Cake Of 4 KG is Ready @ Rs.1600.0
*/


import java.util.Scanner;

class Cake {
    private String shape;
    private String flavor;
    private int quantity;
    public static double price = 400;

    public Cake(String shape, String flavor, int quantity) {
        this.shape = shape;
        this.flavor = flavor;
        this.quantity = quantity;
    }

    public String getShape() { return shape; }
    public String getFlavor() { return flavor; }
    public int getQuantity() { return quantity; }

    @Override
    public String toString() {
        return "A " + shape + " " + flavor + " abstractionConcepts.assignment1.Cake Of " + quantity + " KG is Ready @ Rs." + (quantity * price);
    }
}

class OrderedCake extends Cake {
    private String message;

    public OrderedCake() {
        super("Round", "Vanilla", 1);
    }

    public OrderedCake(String shape, String flavor, int quantity) {
        super(shape, flavor, quantity);
    }

    public OrderedCake(String shape, String flavor, int quantity, String message) {
        super(shape, flavor, quantity);
        this.message = message;
    }

    @Override
    public String toString() {
        if (message != null && !message.isEmpty()) {
            return "A " + getShape() + " " + getFlavor() + " abstractionConcepts.assignment1.Cake Of " + getQuantity() +
                    "KG is Ready with " + message + " message @ Rs." + (getQuantity() * Cake.price);
        }
        return super.toString();
    }
}

public class CakeOrderMain {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        if (!sc.hasNextInt()) return;
        int choice = sc.nextInt();

        if (choice == 1) {
            System.out.println(new OrderedCake());
        }
        else if (choice == 2 || choice == 3) {
            String flavor = sc.next();
            String shape = sc.next();
            int quantity = sc.nextInt();

            // Validation per Test Case 5
            if (quantity < 1) {
                System.out.println("Invalid input. All fields must be provided, and quantity must be > 0.");
                return;
            }

            if (choice == 2) {
                System.out.println(new OrderedCake(shape, flavor, quantity));
            } else {
                // Read the rest of the line as the message
                String message = sc.next();
                // If message can be multiple words, use sc.nextLine().trim()
                System.out.println(new OrderedCake(shape, flavor, quantity, message));
            }
        } else {
            System.out.println("Invalid Choice");
        }
        sc.close();
    }
}