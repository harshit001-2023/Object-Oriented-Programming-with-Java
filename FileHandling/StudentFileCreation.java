package FileHandling;

//Program 01
//Create a file called Student.txt using FileOutputStream class and
//write some data to the file using write() method.
//
//Read the data from Student.txt using FileInputStream class and
//print the data in the console as well as write the data to another file called JavaStudent.txt.

import java.io.*;

public class StudentFileCreation {
    public static void main(String[] args) throws IOException {
        FileOutputStream fos = new FileOutputStream("FileHandling\\Student.txt");
        fos.write("Hello Welcome here..".getBytes());
        fos.close();

        try (FileInputStream fis = new FileInputStream("FileHandling\\Student.txt")) {
            int byteData;
            while ((byteData = fis.read()) != -1) {
                // Convert byte to char if reading simple text
                System.out.print((char) byteData);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
