package LinkedHashSetDemo1;

import java.util.Iterator;
import java.util.LinkedHashSet;

public class Example1 {
    public static void main(String[] args) {
        LinkedHashSet<String> set = new LinkedHashSet<>();
        set.add("One");
        set.add("Two");
        set.add("Three");
        set.add("One");
        set.add("Fourth");

        Iterator itr = set.iterator();
        while (itr.hasNext()) System.out.println(itr.next());
    }
}
