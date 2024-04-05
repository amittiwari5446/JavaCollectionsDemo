package TreeMapDemo1;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.TreeMap;

public class Example1 {
    public static void main(String[] args) {
        TreeMap<Integer, String> tm = new TreeMap<>();
        tm.put(100, "Roshan");
        tm.put(102, "Kedar");
        tm.put(101, "Kirti");
        tm.put(105, "Shushma");
        tm.put(104, "Banda");

        System.out.println("Initial List: ");
        for (Map.Entry m : tm.entrySet()) {
            System.out.println(m.getKey() + " -> " + m.getValue());
        }

    }
}
