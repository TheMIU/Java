package pass_by_value_vs_reference;

class PassByValue {
    public static void main(String[] args) {
        int number = 10;
        System.out.println("Before: " + number); // Before: 10
        modifyValue(number); // Inside method: 20
        System.out.println("After: " + number); // After: 10
    }

    static void modifyValue(int value) {
        value = 20;
        System.out.println("Inside method: " + value);
    }
}
