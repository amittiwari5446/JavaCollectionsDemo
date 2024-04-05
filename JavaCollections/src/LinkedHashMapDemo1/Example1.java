package LinkedHashMapDemo1;

import java.util.LinkedHashMap;
import java.util.Map;

public class Example1 {
    public static void main(String[] args) {
        LinkedHashMap<Integer, String> lhm = new LinkedHashMap<>();
        lhm.put(100, "Roshan");
        lhm.put(102, "Kedar");
        lhm.put(101, "Kirti");
        lhm.put(105, "Shushma");
        lhm.put(104, "Banda");

        System.out.println("Initial List...");
        for (Map.Entry m : lhm.entrySet()) {
            System.out.println(m.getKey() + " -> " + m.getValue());
        }

        System.out.println("Keys: " + lhm.keySet());
        System.out.println("Values: " + lhm.values());
        System.out.println("Key-Value pairs: " + lhm.entrySet());

        lhm.remove(102);
        System.out.println("Updated List: " + lhm);
    }
}
