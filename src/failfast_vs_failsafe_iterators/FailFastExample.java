package failfast_vs_failsafe_iterators;

import java.util.ArrayList;
import java.util.Iterator;

public class FailFastExample {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();
        list.add(1);
        list.add(2);
        list.add(3);

        Iterator<Integer> iterator = list.iterator();
        while (iterator.hasNext()) {
            Integer num = iterator.next();
            System.out.println(num);
            if (num == 2) {
                list.remove(num); // Concurrent modification (fail-fast)
            }
        }
        System.out.println(list); // Reflects partial changes before exception (not consistent)
    }
}

/* 
    output
    1
    2     
    [1, 3] 
*/

// java 21 does not throw exception, just stop iteration