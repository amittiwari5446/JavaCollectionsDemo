package TreeSetDemo1;

import java.util.TreeSet;

public class Example2 {
    public static void main(String[] args) {
        TreeSet<Integer> tset = new TreeSet<>();
        tset.add(24);
        tset.add(10);
        tset.add(32);
        tset.add(19);
        tset.add(11);
        tset.add(90);

        System.out.println("tset.isEmpty(): " + tset.isEmpty());
        System.out.println("tset.first(): " + tset.first());
        System.out.println("tset.last(): " + tset.last());
        System.out.println("tset.pollFirst(): " + tset.pollFirst());//remove min element
        System.out.println("tset.pollLast(): " + tset.pollLast()); //remove max element
        System.out.println("tset.higher(15): " + tset.higher(15));
        System.out.println("tset.lower(15): " + tset.lower(15));
        System.out.println("tset.reversed(): " + tset.reversed());
        System.out.println("tset.size():" + tset.size());
        System.out.println("tset.ceiling(10): " + tset.ceiling(10));
        System.out.println("tset.floor(23): " + tset.floor(23));
        System.out.println("tset.contains(11): " + tset.contains(11));
        System.out.println("tset.removeFirst(): " + tset.removeFirst());
        System.out.println("tset.removeLast(): " + tset.removeLast());

    }
}
