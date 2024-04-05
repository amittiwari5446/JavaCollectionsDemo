package LinkedListDemo1;

import java.util.Iterator;
import java.util.LinkedList;

public class Example4 {
    public static void main(String[] args) {
        LinkedList<String> ll = new LinkedList<>();
        ll.add("Ravi");
        ll.add("Vijay");
        ll.add("Ajay");
        //Traversing the list of elements in reverse order
        Iterator i = ll.descendingIterator();
        while (i.hasNext()) {
            System.out.println(i.next());
        }

    }
}
