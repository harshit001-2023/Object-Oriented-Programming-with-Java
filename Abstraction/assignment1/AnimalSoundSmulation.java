/*1. AnimalSoundSimulation
Easy
100 points
• 130 min suggested
Problem Description
creating a Java program to model different animal sounds using abstract classes and subclasses. Follow the instructions below to complete the program:

Start by defining an abstract class called Animal with an abstract method:

sound(): This method should represent the sound that the animal makes.
Create a subclass named Lion that extends the Animal class. Implement the sound() method to print:

"Lion roars: Roaaar!"
Create another subclass named Tiger that also extends the Animal class. Implement the sound() method to print:

"Tiger growls: Grrrrr!"
In the Main class, write a main method to accomplish the following:

Create an instance of the Lion class.
Call the sound() method on the lion instance.
Create an instance of the Tiger class.
Call the sound() method on the tiger instance.
Ensure that your program output displays the unique sounds of both the lion and the tiger.

Write the Java program according to the instructions above and include it in your response.

Examples
Example 1
Input:
-
Output:
Lion roars: Roaaar!
Tiger growls: Grrrrr!
*/


package Abstraction.assignment1;

class Main{
    void main(){
        Lion lion = new Lion();
        lion.sound();

        Tiger tiger = new Tiger();
        tiger.sound();
    }
}

abstract class Animal{
    public abstract void sound();
}

class Lion extends Animal{
    public void sound(){
        IO.println("Lion roars: Roaaar!");
    }
}

class Tiger extends Animal{
    public void sound(){
        IO.println("Tiger growls: Grrrrr!");
    }
}


