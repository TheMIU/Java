package javadoc.Example;

/**
 * This is a simple class representing a person.
 * It demonstrates the usage of JavaDoc comments.
 */
public class Person {

    /**
     * The name of the person.
     */
    private String name;

    /**
     * The age of the person.
     */
    private int age;

    /**
     * Constructs a new Person object with the given name and age.
     *
     * @param name The name of the person.
     * @param age  The age of the person.
     */
    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    /**
     * Gets the name of the person.
     *
     * @return The name of the person.
     */
    public String getName() {
        return name;
    }

    /**
     * Sets the name of the person.
     *
     * @param name The new name of the person.
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * Gets the age of the person.
     *
     * @return The age of the person.
     */
    public int getAge() {
        return age;
    }

    /**
     * Sets the age of the person.
     *
     * @param age The new age of the person.
     */
    public void setAge(int age) {
        this.age = age;
    }

    /**
     * Prints a simple greeting message including the person's name.
     */
    public void greet() {
        System.out.println("Hello, my name is " + name + "!");
    }
}
