package PriorityQueuesDemo1;

import java.util.Iterator;
import java.util.PriorityQueue;

public class Example2 {
    public static void main(String[] args) {
        PriorityQueue<String> pq = new PriorityQueue<>();
        pq.add("Amit");
        pq.add("Shubham");
        pq.add("Pranav");
        pq.add("Vaishnavi");
        pq.add("Aman");

        Iterator itr = pq.iterator();
        while (itr.hasNext()) System.out.println(itr.next());
    }
}
