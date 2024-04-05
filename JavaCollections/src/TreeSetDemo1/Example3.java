package TreeSetDemo1;

import java.util.TreeSet;

public class Example3 {
    public static void main(String[] args) {
        TreeSet<String> tset = new TreeSet<>();
        tset.add("A");
        tset.add("B");
        tset.add("C");
        tset.add("D");
        tset.add("E");
        System.out.println("Initial TreeSet: " + tset);

        System.out.println("Reverse set: " + tset.descendingSet());
        System.out.println("Head set: " + tset.headSet("C", true));
        System.out.println("Subset: " + tset.subSet("A", false, "E", true));
        System.out.println("Tailset: " + tset.tailSet("C", false));
    }

}
