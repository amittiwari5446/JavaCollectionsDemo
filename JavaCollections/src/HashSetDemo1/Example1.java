package HashSetDemo1;

import java.util.HashSet;
import java.util.Iterator;

public class Example1 {
    public static void main(String[] args) {
        HashSet<String> set = new HashSet<>();
        set.add("One");
        set.add("Two");
        set.add("Three");
        set.add("Three");
        set.add("Four");

        Iterator<String> itr = set.iterator();
        while (itr.hasNext()) System.out.println(itr.next());
    }
}
