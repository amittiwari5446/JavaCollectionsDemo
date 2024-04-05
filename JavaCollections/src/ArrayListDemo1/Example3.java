package ArrayListDemo1;

import java.util.ArrayList;
import java.util.Iterator;

public class Example3 {
    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<>();
        list.add("First");
        list.add("Second");
        list.add("Third");
        list.add("Fourth");
        list.add("Fifth");

        System.out.println(list.get(1));
        list.set(1, "Hundred");
        System.out.println("After Changing...");

        Iterator it = list.iterator();

        while (it.hasNext()) {
            System.out.println(it.next());
        }
    }
}
