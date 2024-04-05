package HashMapDemo1;

import java.util.HashMap;
import java.util.Map;

public class Example1 {
    public static void main(String[] args) {
        HashMap<Integer, String> mp = new HashMap<>();
        mp.put(1, "Apple");
        mp.put(2, "Orange");
        mp.put(3, "Grapes");
        mp.put(4, "Banana");
        mp.put(2, "Papaya"); //no duplicacy allowed

        System.out.println("Iterating HashMap...");
        for (Map.Entry m : mp.entrySet()) {
            System.out.println(m.getKey() + " -> " + m.getValue());
        }
    }
}
