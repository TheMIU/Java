package protected_test.pkg_two; // inside package two

import protected_test.pkg_one.Vehicle; // from package one

// Car Subclass inheriting from Vehicle Superclass
class Car extends Vehicle {

    public void demoAccess() {
        // can access the protected method (access trough inheritance)
        tryAccessProtected();
        // so using protected keyword can access different packages subclasses trough inheritance

        // can access the public method (because public)
        tryAccessPublic();

        // private and default methods can't access different packages (even trough inheritance)
        // tryAccessPrivate();
        // tryAccessDefault();
    }
}