class MyClass {
    private int value;

    public MyClass setValue(int value) {
        this.value = value;
        return this;
    }

    public MyClass add(int num) {
        this.value += num;
        return this;
    }

    public void display() {
        System.out.println("Value: " + value);
    }
}

public class MethodChaining {
    public static void main(String[] args) {
        MyClass myObject = new MyClass();

        // Method chaining
        myObject.setValue(10).add(5).display();
    }
}
