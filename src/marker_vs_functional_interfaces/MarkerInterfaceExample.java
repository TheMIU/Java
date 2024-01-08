package marker_vs_functional_interfaces;

// Marker Interface
interface Serializable {
    // No methods declared, just used to mark classes as serializable
}

// Class implementing Marker Interface
class MyClass implements Serializable {
    // Class implementation
    //...
}

class MarkerInterfaceExample {
    public static void main(String[] args) {
        MyClass obj = new MyClass();
        // Here, MyClass implements Serializable to indicate it can be serialized
        //...
    }
}
