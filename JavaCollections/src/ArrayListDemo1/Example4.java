package ArrayListDemo1;

import java.util.ArrayList;
import java.util.Collections;

public class Example4 {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();
        list.add(44);
        list.add(12);
        list.add(9);
        list.add(32);
        list.add(17);

        for (Integer x : list) System.out.print(x + " ");

        System.out.println();
        Collections.sort(list);
        System.out.println("After Sorting...");

        for (Integer x : list) System.out.print(x + " ");
    }
}
