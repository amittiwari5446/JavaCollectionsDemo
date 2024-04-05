package HashMapDemo1;

import java.util.HashMap;
import java.util.Map;

public class Example4 {
    public static void main(String[] args) {
        HashMap<Integer, String> mp = new HashMap<>();
        mp.put(1, "Apple");
        mp.put(2, "Orange");
        mp.put(3, "Grapes");
        mp.put(4, "Banana");
        mp.put(5, "Kiwi");
        mp.put(6, "Guava");

        System.out.println("Initial List...");
        for (Map.Entry m : mp.entrySet()) {
            System.out.println(m.getKey() + " -> " + m.getValue());
        }

        mp.replace(2, "Papaya");
        System.out.println("Updated List...");
        for (Map.Entry m : mp.entrySet()) {
            System.out.println(m.getKey() + " -> " + m.getValue());
        }

        mp.replace(2, "Papaya", "Li");
        System.out.println("Updated List...");
        for (Map.Entry m : mp.entrySet()) {
            System.out.println(m.getKey() + " -> " + m.getValue());
        }

        mp.replaceAll((k, v) -> "Kiwi");
        System.out.println("Initial List...");
        for (Map.Entry m : mp.entrySet()) {
            System.out.println(m.getKey() + " -> " + m.getValue());
        }
    }
}
