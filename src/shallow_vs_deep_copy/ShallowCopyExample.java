package shallow_vs_deep_copy;

public class ShallowCopyExample {
    public static void main(String[] args) {
        Person originalPerson = new Person("Tommy", new Address("London"));

        // Creating a shallow copy of the original person
        Person shallowCopyPerson = new Person(originalPerson.getName(), originalPerson.getAddress());

        // Modifying the shallow copy
        shallowCopyPerson.setName("John");
        shallowCopyPerson.getAddress().setCity("New York");

        // Changes in the shallow copy affect the original person
        System.out.println(originalPerson); // Output: Name: Tommy | Address: New York
        System.out.println(shallowCopyPerson); // Output: Name: John | Address: New York
    }
}
