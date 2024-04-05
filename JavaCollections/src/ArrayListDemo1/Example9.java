package ArrayListDemo1;

import java.util.ArrayList;

public class Example9 {
    public static void main(String[] args) {
        ArrayList<String> l1 = new ArrayList<>();
        l1.add("john");
        l1.add("raju");
        System.out.println("After using add method: " + l1);
        l1.add(1, "kate");
        System.out.println("After using add method with index: " + l1);

        ArrayList<String> l2 = new ArrayList<>();
        l2.add("bheem");
        l2.add("komal");
        l1.addAll(l2);
        System.out.println("After using addAll method: " + l1);

        ArrayList<String> l3 = new ArrayList<>();
        l3.add("anamika");
        l3.add("ritesh");
        l1.addAll(1, l3);
        System.out.println("After using addAll method with index: " + l1);
    }
}
