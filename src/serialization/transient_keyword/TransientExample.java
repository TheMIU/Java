package serialization.transient_keyword;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

class TransientExample {
    public static void main(String[] args) {
        User user = new User("John", "1234");

        // Serialize the User object and save it to a file
        try (ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream("user.txt"))) {
            oos.writeObject(user);
            System.out.println("User object serialized and saved to user.txt");
        } catch (IOException e) {
            e.printStackTrace();
        }

        // Deserialize the User object from the file
        try (ObjectInputStream ois = new ObjectInputStream(new FileInputStream("user.txt"))) {
            User deserializedUser = (User) ois.readObject();
            System.out.println("Deserialized User:");
            System.out.println("Username: " + deserializedUser.getUsername());
            System.out.println("Password: " + deserializedUser.getPassword()); // Password will be null due to transient
        } catch (IOException | ClassNotFoundException e) {
            e.printStackTrace();
        }
    }
}