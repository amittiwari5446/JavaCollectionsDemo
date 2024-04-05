package TreeSetDemo1;

import java.util.Iterator;
import java.util.TreeSet;

public class Example1 {
    public static void main(String[] args) {
        TreeSet<String> tset = new TreeSet<>();
        tset.add("Ravi");
        tset.add("Kavita");
        tset.add("Renu");
        tset.add("Ravi");
        tset.add("Arun");

        System.out.println("Initial TreeSet: " + tset);
        Iterator itr = tset.descendingIterator();
        Iterator itr2 = tset.iterator();
        while (itr.hasNext()) System.out.print(itr.next() + " ");
        System.out.println();
        while (itr2.hasNext()) System.out.print(itr2.next() + " ");
    }
}
