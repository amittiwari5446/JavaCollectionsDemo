package CollectionsDemo1;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Example1 {
    public static void main(String[] args) {
        List<String> list = new ArrayList<>();
        list.add("C++");
        list.add("Java");
        list.add("Python");
        list.add("MySQL");
        System.out.println("Initial List: " + list);

        Collections.addAll(list, "C#", "DotNet");
        System.out.println("Updated List: " + list);

        String[] str = {"Ruby", "Swift"};
        Collections.addAll(list, str);
        System.out.println("Updated Again List: " + list);

        //sorting
        Collections.sort(list);
        System.out.println("Sorted List: " + list);

        //reverse sorting
        Collections.sort(list, Collections.reverseOrder());
        System.out.println("Sorted List in Reverse Order: " + list);
    }
}
