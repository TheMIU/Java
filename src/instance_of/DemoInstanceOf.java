package instance_of;

interface Creatures {

}

class Animal implements Creatures {

}

class Dog extends Animal {

}

class God {

}

public class DemoInstanceOf {
    public static void main(String[] args) {
        Animal animal = new Animal();
        Dog dog = new Dog();
        God god = new God();

        System.out.println(animal instanceof Creatures); // true
        System.out.println(dog instanceof Creatures); // true
        System.out.println(dog instanceof Animal); // true

        System.out.println(god instanceof Creatures); // false

        // usage
        // Type Checking, check inheritance
        Object obj1 = "Hello";
        if (obj1 instanceof String) {
            System.out.println(obj1);
        }

        Object obj2 = 123;
        if (obj2 instanceof Integer) {
            System.out.println(obj2);
        }
    }
}
