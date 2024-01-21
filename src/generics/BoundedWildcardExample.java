package generics;

import java.util.List;

class Animal {
    public void makeSound() {
        System.out.println("Some generic animal sound");
    }
}

class Dog extends Animal {
    @Override
    public void makeSound() {
        System.out.println("Woof!");
    }
}

class Cat extends Animal {
    @Override
    public void makeSound() {
        System.out.println("Meow!");
    }
}

public class BoundedWildcardExample {
    // Bounded wildcard method
    public static void printSounds(List<? extends Animal> animals) {
        for (Animal animal : animals) {
            animal.makeSound();
        }
    }

    public static void main(String[] args) {
        // Create a list of animals and its subtypes
        List<Animal> animals = List.of(new Animal(), new Dog(), new Cat());

        // Call the method with the list
        printSounds(animals);
    }
}

// output
// Some generic animal sound
// Woof!
// Meow!
