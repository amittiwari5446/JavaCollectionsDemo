package DequeDemo1;

import java.util.ArrayDeque;
import java.util.Deque;

public class Example1 {
    public static void main(String[] args) {
        Deque<String> dq = new ArrayDeque<>();
        dq.add("F");
        dq.add("C");
        dq.add("G");
        dq.add("A");
        dq.add("B");
        dq.add("I");
        dq.add("D");
        dq.add("H");
        dq.add("E");
        System.out.println("Initial Deque: " + dq);

        dq.offerFirst("X");
        System.out.println("After offerFirst(): " + dq);

        dq.offerLast("Y");
        System.out.println("After offerLast(): " + dq);

        dq.pollLast();
        System.out.println("After pollLast(): " + dq);

        dq.addFirst("Z");
        System.out.println("After addFirst(): " + dq);

        System.out.println("dq.contains(\"X\"): " + dq.contains("X"));
        System.out.println("dq.element(): " + dq.element());
        System.out.println("dq.getClass().getName(): " + dq.getClass().getName());
        System.out.println("dq.isEmpty(): " + dq.isEmpty());
        System.out.println("dq.peek(): " + dq.peek());
        System.out.println("dq.peekFirst(): " + dq.peekFirst());
        System.out.println("dq.peekLast(): " + dq.peekLast());
        System.out.println("dq.pop(): " + dq.pop());

        dq.push("P");
        System.out.println("After dq.push(P): " + dq);

        dq.removeFirstOccurrence("D");
        System.out.println("After dq.removeFirstOccurrence(\"D\"): " + dq);

        dq.removeLastOccurrence("D");
        System.out.println("After dq.removeLastOccurrence(\"D\"): " + dq);

        dq.removeIf(str -> str.contains("B"));
        System.out.println("After dq.removeIf(): " + dq);

    }
}
