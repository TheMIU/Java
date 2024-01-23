package serialization_vs_externalizable;

import java.io.*;

class ExternalizableExample implements Externalizable {
    private int intValue;
    private String stringValue;

    public ExternalizableExample() {
        // Default constructor is required for Externalizable
    }

    public ExternalizableExample(int intValue, String stringValue) {
        this.intValue = intValue;
        this.stringValue = stringValue;
    }

    @Override
    public void writeExternal(ObjectOutput out) throws IOException {
        // Custom serialization logic
        out.writeInt(intValue);
        out.writeUTF(stringValue);
    }

    @Override
    public void readExternal(ObjectInput in) throws IOException, ClassNotFoundException {
        // Custom deserialization logic
        intValue = in.readInt();
        stringValue = in.readUTF();
    }

    public static void main(String[] args) {
        // Serialization
        try (ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream("externalized_object.ser"))) {
            ExternalizableExample obj = new ExternalizableExample(42, "Hello, Externalizable!");
            oos.writeObject(obj);
        } catch (IOException e) {
            e.printStackTrace();
        }

        // Deserialization
        try (ObjectInputStream ois = new ObjectInputStream(new FileInputStream("externalized_object.ser"))) {
            ExternalizableExample deserializedObj = (ExternalizableExample) ois.readObject();
            System.out.println("Deserialized Object: " + deserializedObj.intValue + ", " + deserializedObj.stringValue);
        } catch (IOException | ClassNotFoundException e) {
            e.printStackTrace();
        }
    }
}
