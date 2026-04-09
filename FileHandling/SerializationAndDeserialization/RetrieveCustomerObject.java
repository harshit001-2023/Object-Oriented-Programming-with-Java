package FileHandling.SerializationAndDeserialization;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.ObjectInputStream;

public class RetrieveCustomerObject {
    static void main() throws IOException {
        try (ObjectInputStream ois = new ObjectInputStream(new FileInputStream("FileHandling\\SerializationAndDeserialization\\CustomerObject.txt"))){
            Customer deserializedObj = (Customer) ois.readObject();
            System.out.println("Object deserialized: " + deserializedObj);
        } catch (IOException | ClassNotFoundException e){
            e.printStackTrace();
        }
    }
}
