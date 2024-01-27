import java.util.PriorityQueue;

public class PriorityQueueExample {
    public static void main(String[] args) {
        // Creating a min-heap (default behavior)
        PriorityQueue<Integer> minHeap = new PriorityQueue<>();
        minHeap.offer(3);
        minHeap.offer(1);
        minHeap.offer(2);

        // Dequeue elements in ascending order
        while (!minHeap.isEmpty()) {
            System.out.println(minHeap.poll()); // Output: 1, 2, 3
        }

        // Creating a max-heap using a custom comparator
        PriorityQueue<Integer> maxHeap = new PriorityQueue<>((a, b) -> b - a);
        maxHeap.offer(3);
        maxHeap.offer(1);
        maxHeap.offer(2);

        // Dequeue elements in descending order
        while (!maxHeap.isEmpty()) {
            System.out.println(maxHeap.poll()); // Output: 3, 2, 1
        }
    }
}

/*
 * The expression ((a, b) -> b - a) is a lambda expression that represents a
 * custom comparator for the PriorityQueue. In the context of a
 * PriorityQueue<Integer> where elements are integers, this comparator is used
 * to create a max-heap, where the element with the highest value has the
 * highest priority.
 * 
 * Breaking it down:
 * 
 * (a, b) are the two elements being compared.
 * b - a is the comparison logic. When comparing b - a, the elements are
 * compared in reverse order, effectively creating a descending order.
 * 
 * In a max-heap:
 * 
 * If b - a returns a positive value, it implies that b has higher priority than a.
 * If b - a returns a negative value, it implies that a has higher priority than b.
 * If b - a returns 0, the order of elements is considered equal in terms of priority.
 * 
 * So, ((a, b) -> b - a) ensures that the PriorityQueue orders elements in
 * reverse (descending) order, effectively creating a max-heap where the element
 * with the highest value has the highest priority.
 */