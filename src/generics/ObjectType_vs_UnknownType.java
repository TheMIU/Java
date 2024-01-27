package generics;

import java.util.ArrayList;
import java.util.List;

public class ObjectType_vs_UnknownType {
    public static void main(String[] args) {
        // List<Object>
        List<Object> objectList = new ArrayList<>();
        objectList.add("Hello");
        objectList.add(42);
        objectList.add(new CustomObject());

        // Type information is lost when retrieving elements
        Object firstElement = objectList.get(0);

        // List<?>
        List<?> wildcardList = new ArrayList<>();

        // wildcardList.add(42); // Compile-time error
        // wildcardList.add("Hello"); // Compile-time error
        // Invalid - Can't add elements to List<?> (unknown type)
        wildcardList.add(null);
        /*
         * The unbounded wildcard ? means that the list can hold elements of an unknown
         * type, and the compiler, in turn, restricts you from adding anything other
         * than null to the list.
         */

        // Type information is preserved when retrieving elements
        Object wildcardFirstElement = wildcardList.get(0);
    }

    static class CustomObject {
        // Custom class
    }
}

/*
 * If you need to add elements to a list, it's often more appropriate to specify
 * a concrete type or use a wildcard with an upper bound that fits your
 * requirements.
 * 
 * List<? extends Number> wildcardList = new ArrayList<>();
 * // or
 * List<? super Integer> wildcardList = new ArrayList<>();
 * // or simply
 * List<Integer> integerList = new ArrayList<>();
 */