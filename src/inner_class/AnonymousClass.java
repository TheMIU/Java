package inner_class;

interface Greeting {
    void greet();
}

class OuterClass {
    public static void main(String[] args) {
        // Anonymous Inner Class
        Greeting greeting = new Greeting() {
            public void greet() {
                System.out.println("Hello from anonymous class");
            }
        };
        greeting.greet(); // Output: Hello from anonymous class
    }
}