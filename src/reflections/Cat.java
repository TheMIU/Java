package reflections;

public class Cat {
    private String name;
    private int age;

    public Cat() {
    }

    public Cat(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    private final void talk() {
        System.out.println("Meow, I'm a private final method!");
    }

    @Override
    public String toString() {
        return " name : " + name + " \n age  : " + age;
    }
}
