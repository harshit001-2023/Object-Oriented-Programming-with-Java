/*Assignment 02 (Day 03)
-----------------------
Develop a Program on Factory Method where method return type is interface.

Coding Requirement :
---------------------
Take a Functional interface Printer which contains a print() method.

Methods :

1) Method Name     : print()
   Parameter       : No Parameter
   Return Type     : void
   Access Modifier : public
   Modifier   : abstract

Take another class PrinterDemo.

1) Method Name     : getPrinter()
   Parameter       : No Parameter
   Return Type     : Printer [Factory Method (Factory Design Pattern)]
   Access Modifier : public

   In this method override the print() method of Printer interface, using anonymous inner class WITHOUT REFERENCE and return the anonymous inner class object.

Take an ELC class InterfaceImplementationByUsingAnonymous.
Create the PrinterDemo object and call the print method.*/

package InterfaceExample.InterfaceImplementationByUsingAnonymous;

interface Printer{
    public abstract void print();
}

class PrinterDemo{
    public Printer getPrinter(){
        Printer printer = new Printer() {
            @Override
            public void print() {
                IO.println("Method Inner class.");
            }
        };

        return printer;
    }
}

public class InterfaceImplementationByUsingAnonymous {
    static void main() {
        PrinterDemo printerDemo = new PrinterDemo();
        printerDemo.getPrinter().print();
    }
}