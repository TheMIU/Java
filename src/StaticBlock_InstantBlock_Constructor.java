public class StaticBlock_InstantBlock_Constructor {
    public static void main(String[] args) {
        new Dog();
        new Dog();
        new Dog();
    }
}

class Dog {
    Dog() {
        System.out.println("Constructor");
    }

    {
        System.out.println("Instant block");
    }

    static {
        System.out.println("Static block");
    }
}

// output
/*
 * Static block <- run once when class loaded to JVM
 * Instant block
 * Constructor
 * Instant block
 * Constructor
 * Instant block
 * Constructor
 */