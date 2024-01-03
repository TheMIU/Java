package inner_class;

class OuterClass {
    private int outerVar = 10;
    
    // Inner class
    class InnerClass {
        void display() {
            System.out.println("Inner class method accessing outerVar: " + outerVar);
        }
    }
    
    public static void main(String[] args) {
        OuterClass outerObj = new OuterClass();
        OuterClass.InnerClass innerObj = outerObj.new InnerClass();
        innerObj.display(); // Output: Inner class method accessing outerVar: 10
    }
}
