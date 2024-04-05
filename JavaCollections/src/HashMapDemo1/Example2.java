package HashMapDemo1;

import java.util.HashMap;
import java.util.Map;

public class Example2 {
    public static void main(String[] args) {
        HashMap<Integer, String> mp = new HashMap<>();
        mp.put(1, "Apple");
        mp.put(2, "Orange");
        mp.put(3, "Grapes");
        mp.put(4, "Banana");

        System.out.println("After Invoking put() method...");
        for (Map.Entry m : mp.entrySet()) {
            System.out.println(m.getKey() + " -> " + m.getValue());
        }

        mp.putIfAbsent(5, "Guava");
        System.out.println("After Invoking putIfAbsent() method...");
        for (Map.Entry m : mp.entrySet()) {
            System.out.println(m.getKey() + " -> " + m.getValue());
        }

        HashMap<Integer, String> mp2 = new HashMap<>();
        mp2.put(6, "Kiwi");

        mp.putAll(mp2);
        System.out.println("After Invoking putAll() method...");
        for (Map.Entry m : mp.entrySet()) {
            System.out.println(m.getKey() + " -> " + m.getValue());
        }
    }
}
