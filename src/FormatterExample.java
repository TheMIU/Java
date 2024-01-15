public class FormatterExample {
    public static void main(String[] args) {
        String name = "John";
        int age = 25;
        double salary = 50000.7597;

        // Using Formatter to create a formatted string
        System.out.println(String.format("Salary: %.2f", salary)); // Salary: 50000.76
        System.out.println(String.format("Name: %s", name));
        System.out.println(String.format("Age: %d", age));
    }
}
