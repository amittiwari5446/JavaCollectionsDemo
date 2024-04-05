package PriorityQueuesDemo1;

import java.util.PriorityQueue;

public class Example1 {
    public static void main(String[] args) {
        PriorityQueue<String> pq = new PriorityQueue<>();
        pq.add("Amit");
        pq.add("Shubham");
        pq.add("Pranav");
        pq.add("Vaishnavi");
        pq.add("Aman");

        System.out.println("Initial List: " + pq);
        System.out.println("Head: " + pq.element());
        System.out.println("Head: " + pq.peek());

        System.out.println("After first modification List: " + pq);

        pq.remove(); //removes first element
        System.out.println("After remove() operation List: " + pq);
        pq.poll(); //removes first element
        System.out.println("After poll() operation List: " + pq);

        System.out.println("Contains(Amit): " + pq.contains("Amit"));
        System.out.println("IsEmpty(): " + pq.isEmpty());
        System.out.println("size(): " + pq.size());

        pq.clear();
        System.out.println("After clear() operation: " + pq);

    }
}
