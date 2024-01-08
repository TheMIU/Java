package oop.inheritance;

class SuperClass {
    public void publicMethod() {
        System.out.println("public method in superclass.");
    }

    protected void protectedMethod() {
        System.out.println("protected method in superclass.");
    }

    private void privateMethod() {
        System.out.println("private method in superclass.");
    }

    final void finalMethod() {
        System.out.println("final method in superclass.");
    }
}

class SubClass extends SuperClass {

    @Override
    protected void protectedMethod() {
        System.out.println("overridden protected method in subclass.");
    }

    @Override
    public void publicMethod() {
        System.out.println("overridden public method in subclass.");
    }

    // You cannot override private or final methods from the superclass here.
    // Attempting to override them will result in a compilation error.
}

public class OverridingTest {
    public static void main(String[] args) {
        SuperClass subClass = new SubClass();
        subClass.publicMethod(); // Output: overridden public method in subclass.
        subClass.protectedMethod(); // Output: overridden protected method in subclass.
        subClass.finalMethod(); // Output: final method in superclass.
        // subClass.privateMethod(); // Compilation error: privateMethod() has private access in SuperClass.
    }
}
