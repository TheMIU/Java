package Comparator_vs_Comparable.Comparator;

import java.util.Comparator;

class AgeComparator implements Comparator<Person> {
    @Override
    public int compare(Person p1, Person p2) {
        return Integer.compare(p1.getAge(), p2.getAge());
    }
}