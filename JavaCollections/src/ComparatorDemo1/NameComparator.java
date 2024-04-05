package ComparatorDemo1;

import java.util.Comparator;

public class NameComparator implements Comparator {
    public int compare(Object ob1, Object ob2) {
        Student st1 = (Student) ob1;
        Student st2 = (Student) ob2;

        return st1.name.compareTo(st2.name);
    }
}
