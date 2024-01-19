package inner_class;

interface Greeting {
    void greet();
}

class OuterClass {
    public static void main(String[] args) {
        // Anonymous Inner Class
        Greeting greeting1 = new Greeting() {
            public void greet() {
                System.out.println("Hello from anonymous class 1");
            }
        };
        greeting1.greet();

        // also can write like this using lambda expression
        // valid for functional interfaces (interfaces with a single abstract method)
        Greeting greeting2 = () -> System.out.println("Hello from anonymous class 2");
        greeting2.greet();
    }
}