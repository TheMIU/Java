package oop.polymorphism;

class Animal {
    void say() {
        System.out.println("I'm Animal");
    }
}

class Dog extends Animal {
    void say() {
        System.out.println("I'm Dog");
    }
}

public class RuntimePolymorphism {
    public static void main(String[] args) {
        Animal a1 = new Dog();
        a1.say(); // I'm Dog
    }
}