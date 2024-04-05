package HashMapDemo1;

import java.util.HashMap;

public class Example3 {
    public static void main(String[] args) {
        HashMap<Integer, String> mp = new HashMap<>();
        mp.put(1, "Apple");
        mp.put(2, "Orange");
        mp.put(3, "Grapes");
        mp.put(4, "Banana");
        mp.put(5, "Kiwi");
        mp.put(6, "Guava");

        System.out.println("Initial List..." + mp);

        //key based removal
        mp.remove(2);
        System.out.println("After Key Based Removal..." + mp);

        //key-value based removal
        mp.remove(6, "Guava");
        System.out.println("After Key-value Based Removal..." + mp);
    }
}
