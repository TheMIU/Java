package Serialization;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

public class SerializationExample {
    public static void main(String[] args) throws IOException, ClassNotFoundException {
        // file path relative to the package
        String directoryPath = "src/Serialization/serializedFile"; // Directory path
        String filePath = directoryPath + "/object.ser"; // File path

        // Create the directory if it doesn't exist
        File directory = new File(directoryPath);
        if (!directory.exists()) {
            if (directory.mkdirs()) {
                System.out.println("Directory created successfully!");
            } else {
                System.out.println("Failed to create directory!");
                return; // Exit if directory creation fails
            }
        }

        // Serialization: Writing object to a file
        FileOutputStream fileOut = new FileOutputStream(filePath);
        ObjectOutputStream out = new ObjectOutputStream(fileOut);
        MyObject obj = new MyObject();
        obj.setName("John"); // set name 
        out.writeObject(obj);
        out.close();
        fileOut.close();

        // set name after serialization (this is not saved)
        obj.setName("Tommy"); 

        // Deserialization: Reading object from a file
        FileInputStream fileIn = new FileInputStream(filePath);
        ObjectInputStream in = new ObjectInputStream(fileIn);
        MyObject newObj = (MyObject) in.readObject();
        in.close();
        fileIn.close();

        // deserialized object
        System.out.println(newObj); // name : John
    }
}
