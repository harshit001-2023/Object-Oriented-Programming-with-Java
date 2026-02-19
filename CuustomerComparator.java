/*Q2) Create a record called Customer, which accepts id, name and bill as a component.

Create an ELC class CustomerComparator with main method.

Create a Customer array with dynamic size and dynamic array initialization using IO class.

Sort the Customer object based on following criteria :

  a) By using Customer id
  b) By using Customer name
  c) By using Customer bill*/

import java.util.Arrays;

public record Customer(int id, String name, double bill){
}

static void main() {
    try{
        int n = Integer.parseInt(IO.readln("Enter n: "));

        Customer[] customers = new Customer[n];

        for(int i = 0; i < customers.length; i++){
            int id = Integer.parseInt(IO.readln("Enter ID: "));
            String name = IO.readln("Enter Name: ");
            double bill = Double.parseDouble(IO.readln("Enter Marks: "));
            customers[i] = new Customer( id, name, bill);
        }

        IO.println("Original Data Sequence: ");
        for (Customer cust : customers){
            IO.println(cust);
        }
        IO.println();

        Arrays.sort(customers, (m1, m2) -> Integer.compare(m1.id(), m2.id()));

        IO.println("Sorted Data based on Id: ");
        for(Customer cust : customers){
            IO.println(cust);
        }
        IO.println();

        Arrays.sort(customers, (m1, m2) -> m1.name.compareTo(m2.name));

        IO.println("Sorted Data based on Name: ");
        for(Customer cust : customers){
            IO.println(cust);
        }

        IO.println();
        Arrays.sort(customers, (m1, m2) -> Double.compare(m1.bill(), m2.bill()));

        IO.println("Sorted Data based on Bill: ");
        for(Customer cust : customers){
            IO.println(cust);
        }


    }catch (NumberFormatException e){
        System.err.println("Enter valid value!");
    }
}
