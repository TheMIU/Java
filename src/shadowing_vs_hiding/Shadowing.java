package shadowing_vs_hiding;

class Shadowing {
    public static void main(String[] args) {
        Demo demo = new Demo();
        demo.shadowingExample();
    }
}

class Demo {
    // instance variable x
    private int x = 10;

    public void shadowingExample() {
        System.out.println(x); // Prints the instance variable x // 10

        int x = 5; // This is shadowing the instance variable x
        System.out.println(x); // Prints the local variable x // 5

        // but if this keyword is used
        System.out.println(this.x); // Prints the instance variable x // 10
    }
}
