package ArrayListDemo1;

import java.util.ArrayList;
import java.util.Iterator;

public class Example2 {
    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<>();
        list.add("First");
        list.add("Second");
        list.add("Third");
        list.add("Fourth");
        list.add("Fifth");

        Iterator it = list.iterator();

        while (it.hasNext()) {
            System.out.println(it.next());
        }
        System.out.println("********************");

        for (String str : list) {
            System.out.println(str);
        }

    }
}
