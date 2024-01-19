package copy_objects;

import java.io.*;

class SerializationDeserialization {
    public static void main(String[] args) {
        try {
            TestClass originalObj = new TestClass(30);

            // Serialize the object
            byte[] serializedData = serialize(originalObj);

            // Deserialize the object
            TestClass deserializedObj = deserialize(serializedData);

            deserializedObj.testMethod();
            // Test method invoked
            // Data: 30
            
        } catch (IOException | ClassNotFoundException e) {
            e.printStackTrace();
        }
    }

    // Serialize the object to a byte array
    private static byte[] serialize(TestClass obj) throws IOException {
        ByteArrayOutputStream bos = new ByteArrayOutputStream();
        ObjectOutputStream oos = new ObjectOutputStream(bos);
        oos.writeObject(obj);
        oos.flush();
        return bos.toByteArray();
    }

    // Deserialize the object from a byte array
    private static TestClass deserialize(byte[] data) throws IOException, ClassNotFoundException {
        ByteArrayInputStream bis = new ByteArrayInputStream(data);
        ObjectInputStream ois = new ObjectInputStream(bis);
        return (TestClass) ois.readObject();
    }
}

class TestClass implements Serializable {
    private int data;

    public TestClass(int data) {
        this.data = data;
    }

    void testMethod() {
        System.out.println("Test method invoked");
        System.out.println("Data: " + data);
    }
}
