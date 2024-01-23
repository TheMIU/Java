package serialization_vs_externalizable;

import java.io.*;

class SerializableExample implements Serializable {
    private static final long serialVersionUID = 1L;

    private int intValue;
    private String stringValue;

    public SerializableExample(int intValue, String stringValue) {
        this.intValue = intValue;
        this.stringValue = stringValue;
    }

    public static void main(String[] args) {
        // Serialization
        try (ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream("serialized_object.ser"))) {
            SerializableExample obj = new SerializableExample(42, "Hello, Serializable!");
            oos.writeObject(obj);
        } catch (IOException e) {
            e.printStackTrace();
        }

        // Deserialization
        try (ObjectInputStream ois = new ObjectInputStream(new FileInputStream("serialized_object.ser"))) {
            SerializableExample deserializedObj = (SerializableExample) ois.readObject();
            System.out.println("Deserialized Object: " + deserializedObj.intValue + ", " + deserializedObj.stringValue);
        } catch (IOException | ClassNotFoundException e) {
            e.printStackTrace();
        }
    }
}
