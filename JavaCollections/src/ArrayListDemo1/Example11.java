package ArrayListDemo1;

import java.util.ArrayList;
import java.util.Iterator;

public class Example11 {
    public static void main(String[] args) {
        ArrayList<String> l1 = new ArrayList<>();
        l1.add("john");
        l1.add("raju");
        l1.add("ajay");
        l1.add("ritu");
        l1.add("kirti");
        l1.add("betty");

        ArrayList<String> l2 = new ArrayList<>();
        l2.add("ajay");
        l2.add("nobita");
        l2.add("betty");

        System.out.println("Is list l1 empty? : " + l1.isEmpty());
        System.out.println("Size of list l1 : " + l1.size());

        l1.retainAll(l2);
        System.out.println("After using retainAll() method: " + l1);

        Iterator<String> itr = l1.iterator();
        while (itr.hasNext()) {
            System.out.println(itr.next());
        }

        ArrayList<String> l3 = new ArrayList<>(10);
        System.out.println("Size of list 3: " + l3.size());
    }
}
