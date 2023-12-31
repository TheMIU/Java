package comparator_vs_comparable.Comparator;

class Person {
    private String name;
    private int age;

    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    // Getters and other methods...
    public int getAge() {
        return this.age;
    }

    @Override
    public String toString() {
        return "Person{age=" + age + " name=" + name + "}";
    }
}
