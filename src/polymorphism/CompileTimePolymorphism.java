package polymorphism;

class Numbers {
    public void num() {
        System.out.println("num() -- parameters 0");
    }

    public void num(int x) { // <<---------(1)
        System.out.println("num(int x) -- parameters 1 ");
    }

    public void num(int x, int y) { // <<---------(2)
        System.out.println("num(int x, int y -- parameters 2 ");
    }

    public void num(double x) { // <<---------(3)
        System.out.println("num(double x) -- parameters 1");
    }
}

public class CompileTimePolymorphism {
    public static void main(String[] args) {
        Numbers n1 = new Numbers();
        n1.num(); // num() -- parameters 0
        n1.num(10); // num(int x) -- parameters 1
        n1.num(20, 30); // num(int x, int y -- parameters 2 
        n1.num(10.5); // num(double x) -- parameters 1    
    }
}
