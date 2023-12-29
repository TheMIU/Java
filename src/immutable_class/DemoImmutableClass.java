package immutable_class;

public class DemoImmutableClass {
    public static void main(String[] args) {
        ImmutableClass c1 = new ImmutableClass(1, "John");
        ImmutableClass c2 = new ImmutableClass(2, "Tommy");

        // cant modify, just read only
        System.out.println(c1.getName());
        System.out.println(c2.getName());
    }
}

/*
 * Immutable classes are used for;
1. Thread Safety
2. Consistent State
3. Caching Benefits
4. Map Keys
5. Potential Performance
6. Design Clarity & Security
 */