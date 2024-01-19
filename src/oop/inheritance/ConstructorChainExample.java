package oop.inheritance;

class A {
    A() {
        System.out.println("Constructor A");
    }
}

class B extends A {
    B() {
        System.out.println("Constructor B");
    }
}

class C extends B {
    C() {
        System.out.println("Constructor C");
    }
}

class ConstructorChainExample {
    public static void main(String[] args) {
        new C();
        // output
        // Constructor A
        // Constructor B
        // Constructor C

        // that happens because each subclass constructors super(); method refers their
        // super class constructor
    }
}

// constructor chaining can be happen in the same class, 
// if there are many constructors.
// there is no 'super();'' because no inheritance,
// there is 'this'