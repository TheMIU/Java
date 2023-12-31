package static_members;

public class Block {
    static {
        System.out.println("I change the count value when loads my class into memory");
        Counter.count = 10;
    }
}
