package Comparator_vs_Comparable.Comparator;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class ComparatorExample {
    public static void main(String[] args) {
        List<Person> people = new ArrayList<>();
        people.add(new Person("Alice", 25));
        people.add(new Person("Charlie", 20));
        people.add(new Person("Bob", 30));
        people.add(new Person("Abuja", 40));

        Collections.sort(people, new AgeComparator()); // Sorts based on age

        for (Person person : people) {
            System.out.println(person);
        }
    }
}

