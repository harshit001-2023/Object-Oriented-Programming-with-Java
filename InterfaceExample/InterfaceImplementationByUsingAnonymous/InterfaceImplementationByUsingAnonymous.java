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