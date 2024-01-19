package shadowing_vs_hiding;

class Hiding {
    public static void main(String[] args) {
        System.out.println(Child.x); // 5
    }
}

class Parent {
    static int x = 10;
}

class Child extends Parent {
    // This is hiding the static variable x in the parent class
    static int x = 5;
}