package FileHandling.SerializationAndDeserialization;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

public class StoreCustomerObject {
    public static void main(String[] args) throws IOException {
        Customer c1 = Customer.getCustomerObject();
        try (ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream("FileHandling\\SerializationAndDeserialization\\CustomerObject.txt"))) {
            oos.writeObject(c1);
            IO.println("Object Serialized Successfully " + c1);
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
    }
}
