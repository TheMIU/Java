package pass_by_value_vs_reference;

class PassByReference {
    // Pass by reference (simulated)
    // *** Java doesn't have true pass by reference ***
    public static void main(String[] args) {
        StringBuilder str = new StringBuilder("Hello");
        System.out.println("Before: " + str); // Before: Hello
        modifyReference(str); // Inside method: Hello World
        System.out.println("After: " + str); // After: Hello World
    }

    static void modifyReference(StringBuilder value) {
        value.append(" World");
        System.out.println("Inside method: " + value);
    }
}
