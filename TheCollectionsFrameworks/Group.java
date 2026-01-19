// Program 1: Write a program to store a group off objects ino an array and retrieve he object data and display

package TheCollectionsFrameworks;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

class Employee{
    int id;
    String name;

    Employee(int id, String name){
        this.id = id;
        this.name = name;
    }

    void displayData(){
        IO.println(id+"\t"+name);
    }
}

public class Group {
    static void main() throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        IO.println("Enter Array size: ");
        int size = Integer.parseInt(br.readLine());
        Employee[] arr = new Employee[size];

        for (int i = 0; i < arr.length; i++){
            int id = Integer.parseInt(IO.readln("Enter ID: "));
            String name = IO.readln("Enter Name: ");

            arr[i] = new Employee(id, name);
        }

        IO.println("\nThe Employee Data: ");

        for (Employee employee : arr) {
            employee.displayData();
        }
    }
}
