package failfast_vs_failsafe_iterators;

import java.util.Iterator;
import java.util.concurrent.CopyOnWriteArrayList;

public class FailSafeExample {
    public static void main(String[] args) {
        CopyOnWriteArrayList<Integer> list = new CopyOnWriteArrayList<>();
        list.add(1);
        list.add(2);
        list.add(3);

        Iterator<Integer> iterator = list.iterator();
        while (iterator.hasNext()) {
            Integer num = iterator.next();
            System.out.println(num);
            if (num == 2) {
                list.remove(num); // Safe removal (fail-safe)
            }
        }
        System.out.println(list); // Reflects all changes made during iteration
    }
}

/* 
    output
    1
    2 
    3  
    [1, 3] 
*/