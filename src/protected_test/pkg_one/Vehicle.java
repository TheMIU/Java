package protected_test.pkg_one; // inside package one

public class Vehicle {
    void tryAccessDefault() {
        System.out.println("I'm a default method");
    }

    public void tryAccessPublic() {
        System.out.println("I'm a public method");
    }

    private void tryAccessPrivate() {
        System.out.println("I'm a private method");
    }

    protected void tryAccessProtected() {
        System.out.println("I'm a protected method");
    }
}
