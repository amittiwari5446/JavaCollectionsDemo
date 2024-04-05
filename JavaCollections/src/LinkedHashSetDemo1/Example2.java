package LinkedHashSetDemo1;

import java.util.LinkedHashSet;

public class Example2 {
    public static void main(String argvs[]) {
        LinkedHashSet<String> lhs = new LinkedHashSet<>();
        lhs.add("Java");
        lhs.add("T");
        lhs.add("Point");
        lhs.add("Good");
        lhs.add("Website");
        System.out.println("Initial LinkedHashSet: " + lhs);

        System.out.println(lhs.remove("Good"));
        System.out.println("After removing the element, the list: " + lhs);

        System.out.println(lhs.remove("For"));

        lhs.removeIf(str -> str.contains("T"));
        System.out.println("After removing the elements, the list: " + lhs);

    }
}