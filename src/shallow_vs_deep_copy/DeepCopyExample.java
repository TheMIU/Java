package shallow_vs_deep_copy;

public class DeepCopyExample {
    public static void main(String[] args) {
        Person originalPerson = new Person("Tommy", new Address("London"));

        // Creating a deep copy of the original person
        Person deepCopyPerson = new Person(originalPerson.getName(),
                new Address(originalPerson.getAddress().getCity()));

        // Modifying the deep copy
        deepCopyPerson.setName("John");
        deepCopyPerson.setAddress(new Address("New York"));

        // Changes in the deep copy's address do not affect the original person
        System.out.println(originalPerson); // Name: Tommy | Address: London
        System.out.println(deepCopyPerson); // Name: John | Address: New York
    }
}
