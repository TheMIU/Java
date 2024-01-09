package optionals;

import java.util.Optional;

public class OptionalExample {
    public static void main(String[] args) {
        // Creating optional Cats
        Cat cat1 = new Cat("Whiskers", 5);
        Cat cat2 = null; // Simulating a situation where cat2 may be null

        Optional<Cat> optionalCat1 = Optional.ofNullable(cat1);
        Optional<Cat> optionalCat2 = Optional.ofNullable(cat2);

        // Getting cat name and age if present
        optionalCat1.ifPresent(cat -> {
            System.out.println("Cat 1 Name: " + cat.getName());
            System.out.println("Cat 1 Age: " + cat.getAge());
        });

        optionalCat2.ifPresentOrElse(
                cat -> {
                    System.out.println("Cat 2 Name: " + cat.getName());
                    System.out.println("Cat 2 Age: " + cat.getAge());
                },
                () -> System.out.println("Cat 2 is absent"));

        // Using orElse to provide a default cat if optionalCat2 is empty
        Cat defaultCat = optionalCat2.orElse(new Cat("DefaultCat", 3));
        System.out.println("Default Cat Name: " + defaultCat.getName());
        System.out.println("Default Cat Age: " + defaultCat.getAge());
    }
}