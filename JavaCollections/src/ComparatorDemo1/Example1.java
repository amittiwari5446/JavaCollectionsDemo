package ComparatorDemo1;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

public class Example1 {
    public static void main(String[] args) {
        List<Student> list = new ArrayList<>();
        list.add(new Student(104, "Suresh", 23));
        list.add(new Student(102, "Gopal", 22));
        list.add(new Student(107, "Vickey", 23));
        list.add(new Student(101, "Naresh", 21));
        list.add(new Student(109, "Jagdeesh", 24));

        System.out.println("Sort by age...");
        Collections.sort(list, new AgeComparator());
        Iterator itr = list.iterator();
        while (itr.hasNext()) {
            Student st = (Student) itr.next();
            System.out.println(st.id + ", " + st.name + ", " + st.age);
        }

        System.out.println("Sort by name...");
        Collections.sort(list, new NameComparator());
        Iterator itr2 = list.iterator();
        while (itr2.hasNext()) {
            Student st = (Student) itr2.next();
            System.out.println(st.id + ", " + st.name + ", " + st.age);
        }
    }
}
