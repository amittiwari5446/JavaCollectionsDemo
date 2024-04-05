package ArrayListDemo1;

import java.util.ArrayList;
import java.util.Collections;

public class Example5 {
    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<>();
        list.add("Apple");
        list.add("Mango");
        list.add("Banana");
        list.add("Litchi");
        list.add("Grapes");
        list.add("Orange");
        list.add("Pineapple");

        for (String str : list) System.out.print(str + " ");

        System.out.println();
        Collections.sort(list);
        System.out.println("After Sorting...");

        for (String str : list) System.out.print(str + " ");
    }
}
