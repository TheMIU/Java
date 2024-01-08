public class AssertExample {
    public static void main(String[] args) {
        int x = 10;
        assert x == 10 : "x is not 10!"; // Assertion checks if x is indeed 10  

        x = 5;
        assert x == 10 : "x is not 10!"; // This assertion would fail during execution

        // by default assert are disabled, so nothing happen when run
        // to enable, use -ea flag
        // javac AssertExample.java
        // java -ea AssertExample  
        // this way it gives 'AssertionError'
    }
}
