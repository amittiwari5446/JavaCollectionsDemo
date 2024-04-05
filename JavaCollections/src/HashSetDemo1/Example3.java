package HashSetDemo1;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;

public class Example3 {
    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<>();
        list.add("Ravi");
        list.add("Vijay");
        list.add("Arun");
        list.add("Sumit");

        HashSet<String> set = new HashSet<>(list);

        Iterator itr = set.iterator();
        while (itr.hasNext()) System.out.println(itr.next());
    }
}
