package ArrayListDemo1;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.ListIterator;

public class Example6 {
    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<>();
        list.add("Apple");
        list.add("Mango");
        list.add("Banana");
        list.add("Litchi");
        list.add("Grapes");
        list.add("Orange");
        list.add("Pineapple");

        System.out.println("Iterating through advance 'for' loop");
        for (String str : list) System.out.println(str + " ");

        System.out.println("Iterating through List Iterator");
        //reverse order
        ListIterator<String> listItr = list.listIterator(list.size());
        while (listItr.hasPrevious()) System.out.println(listItr.previous() + " ");

        System.out.println("Iterating through for loop");
        for (int i = 0; i < list.size(); i++) System.out.println(list.get(i));

        System.out.println("Iterating through forEach Method");
        list.forEach((data) -> {
            System.out.println(data);
        });

        System.out.println("Iterating through forEachRemaining Method");
        Iterator<String> itr = list.iterator();
        itr.forEachRemaining((data) -> {
            System.out.println(data);
        });
    }
}
