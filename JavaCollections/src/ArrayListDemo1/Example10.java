package ArrayListDemo1;

import java.util.ArrayList;

public class Example10 {
    public static void main(String[] args) {
        ArrayList<String> l1 = new ArrayList<>();
        l1.add("john");
        l1.add("raju");
        l1.add("ajay");
        l1.add("ritu");
        l1.add("kirti");
        l1.add("betty");

        l1.remove("raju");
        System.out.println("After using remove(object) method: " + l1);
        l1.remove(0);
        System.out.println("After using remove(index) method: " + l1);

        ArrayList<String> l2 = new ArrayList<>();
        l2.add("komal");
        l2.add("nobita");
        l1.addAll(l2);
        System.out.println("After using addAll method: " + l1);
        l1.removeAll(l2);
        System.out.println("After using removeAll(collection<?>) method: " + l1);

        l1.removeIf(str -> str.contains("ajay"));
        System.out.println("After using removeIf() method: " + l1);

        l1.clear();
        System.out.println("After using clear() method: " + l1);

    }
}
