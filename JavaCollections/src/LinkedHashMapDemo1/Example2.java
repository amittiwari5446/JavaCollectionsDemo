package LinkedHashMapDemo1;

import java.util.LinkedHashMap;

public class Example2 {
    public static void main(String[] args) {
        LinkedHashMap<Integer, String> lhm = new LinkedHashMap<>();
        lhm.put(100, "Roshan");
        lhm.put(102, "Kedar");
        lhm.put(101, "Kirti");
        lhm.put(105, "Shushma");
        lhm.put(104, "Banda");

        System.out.println("Initial List: " + lhm);

        lhm.putFirst(107, "Supriya");
        System.out.println("After putFirst(): " + lhm);

        lhm.putLast(108, "Mridula");
        System.out.println("After putLast(): " + lhm);
        System.out.println("List Size(): " + lhm.size());
        lhm.pollFirstEntry();
        System.out.println("After pollFirstEntry(): " + lhm);
        lhm.pollLastEntry();
        System.out.println("After pollLastEntry(): " + lhm);
        lhm.reversed();
        System.out.println("After reversed(): " + lhm);
        System.out.println("After containsKey(103): " + lhm.containsKey(103));
        System.out.println("After containsValue(\"Kirti\"): " + lhm.containsValue("Kirti"));
        lhm.clear();
        System.out.println("After clear(): " + lhm);
    }
}
