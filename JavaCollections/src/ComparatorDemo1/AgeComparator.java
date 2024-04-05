package ComparatorDemo1;

import java.util.Comparator;

public class AgeComparator implements Comparator {
    public int compare(Object ob1, Object ob2) {
        Student st1 = (Student) ob1;
        Student st2 = (Student) ob2;

        if (st1.age > st2.age) return 1;
        else if (st1.age < st2.age) return -1;
        else return 0;
    }
}
