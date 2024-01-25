package collection_framework;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;

public class MapExample {
    public static void main(String[] args) {
        /*
         * HashMap
         * contains values based on the key.
         * It contains only unique elements.
         * It may have one null key and multiple null values.
         * It maintains no order.
         */

        Map<String, String> map1 = new HashMap<>();

        map1.put("Name", "John");
        map1.put("Age", "23");
        map1.put("Address", null); // multiple null values
        map1.put(null, null);// one null key accepted
        map1.put(null, null); // not added, only one null key accepted

        System.out.println(map1); // no order
        // {null=null, Address=null, Age=23, Name=John}

        /*
         * ================================
         * TreeMap
         * contains values based on the key.
         * It contains only unique elements.
         * It cannot have a null key but can have multiple null values.
         * It maintains ascending order (Sorted using the natural order of its key).
         */

        Map<String, String> map2 = new TreeMap<>();

        map2.put("Name", "Thomas");
        map2.put("Age", "25");
        map2.put("Address", null); // can have multiple null values
        // map2.put(null, null); // cannot have a null key (NullPointerException)

        System.out.println(map2); // ascending order (Sort by key)
        // {Address=null, Age=25, Name=Thomas}

        /*
         * ================================
         * LinkedHashMap
         * contains values based on the key.
         * It contains only unique elements.
         * It may have one null key and multiple null values.
         * It maintains insertion order.
         */

        Map<String, String> map3 = new LinkedHashMap<>();

        map3.put("Name", "Peter");
        map3.put("Age", "21");
        map3.put("Address", null); // can have multiple null values
        map3.put(null, null); // one null key accepted
        map3.put(null, null); // not added, only one null key accepted

        System.out.println(map3); // insertion order
        // {Name=Peter, Age=21, Address=null, null=null}

        // ================================
        // Accessing map

        // print values
        System.out.println(map2.get("Name")); // Thomas

        // print keys and values using for each loop
        Set<String> keySets = map2.keySet();
        for (String key : keySets) {
            System.out.println(key + " : " + map2.get(key));
        }
    }
}
