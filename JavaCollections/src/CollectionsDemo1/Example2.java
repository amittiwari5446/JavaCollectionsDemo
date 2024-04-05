package CollectionsDemo1;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Example2 {
    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>();
        list.add(10);
        list.add(41);
        list.add(23);
        list.add(32);
        list.add(49);
        list.add(8);
        list.add(76);
        list.add(18);

        System.out.println("Maximum: " + Collections.max(list));
        System.out.println("Minimum: " + Collections.min(list));

        System.out.println("Unsorted List: " + list);
        Collections.sort(list);
        System.out.println("Sorted List: " + list);
        Collections.sort(list, Collections.reverseOrder());
        System.out.println("Sorted List in Reverse Order: " + list);

        System.out.println("Position of 32 available?: " + Collections.binarySearch(list, 32));

        Collections.fill(list, 20);
        System.out.println("List: " + list);

        // Initialize list2 with the same size as list
        List<Integer> list2 = new ArrayList<>(list.size());
        Collections.copy(list2, list);
        System.out.println("List2: " + list2);
    }
}
