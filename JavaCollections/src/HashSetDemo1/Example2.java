package HashSetDemo1;

import java.awt.*;
import java.util.HashSet;

public class Example2 {
    public static void main(String[] args) {
        HashSet<String> set = new HashSet<>();
        set.add("Ravi");
        set.add("Vijay");
        set.add("Arun");
        set.add("Sumit");
        System.out.println("Initial List: " + set);

        set.remove("Ravi");
        System.out.println("After invoking remove(Object): " + set);

        HashSet<String> set2 = new HashSet<>();
        set2.add("Ajay");
        set2.add("Gaurav");

        set.addAll(set2);
        System.out.println("After invoking addAll(Object): " + set);

        set.removeAll(set2);
        System.out.println("After invoking removeAll(Object): " + set);

        set.removeIf(str -> str.contains("Vijay"));
        System.out.println("After invoking removeIf(Object): " + set);

        set.clear();
        System.out.println("After invoking clear(): " + set);
    }
}
