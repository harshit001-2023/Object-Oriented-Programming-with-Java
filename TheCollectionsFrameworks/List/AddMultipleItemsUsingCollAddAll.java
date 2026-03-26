package TheCollectionsFrameworks.List;/*AddMultipleElementsToCollection
Easy
Core Java • Collection Framework Overview • Collections methods
20 Points
Description
In a shopping application, you want to add multiple product names to a cart at once.
Instead of adding items one by one, Java provides a convenient method to add multiple elements in a single operation.
This improves code readability and reduces repetitive statements.

Your task is to add multiple elements to a collection using the Collections.addAll() method and then display the elements.
You should not use loops to add elements individually.

Program Structure Instructions

Create a class named AddMultipleElementsToCollectionUsingAddAll.
Inside the main() method, create an empty List<String> representing a shopping cart.
Use Collections.addAll() to add multiple product names to the list and then print all items.

Method Information
No separate method is mandatory for this program.
The Collections.addAll() method should be used directly inside the main() method.
Examples
Example 1:

Input

Enter number of products: 6
Enter product names:
Laptop
Mobile
Headphones
Keyboard
Mouse
Charger
Output

Laptop
Mobile
Headphones
Keyboard
Mouse
Charger*/

import java.util.*;

class AddMultipleElementsToCollectionUsingAddAll{
    void main(){
        List<String> cart = new ArrayList<>();

        int n = Integer.parseInt(IO.readln());

        String[] arr = new String[n];
        for(int i = 0; i < n; i++){
            arr[i] = IO.readln();
        }

        Collections.addAll(cart, arr);

        for(String item : cart){
            IO.println(item);
        }
    }
}

