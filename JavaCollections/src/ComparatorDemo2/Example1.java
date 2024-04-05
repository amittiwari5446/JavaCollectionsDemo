package ComparatorDemo2;

import ComparatorDemo2.Student;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class Example1 {
    public static void main(String[] args) {
        List<Student> list = new ArrayList<>();
        list.add(new Student(104, "Suresh", 23));
        list.add(new Student(102, "Gopal", 22));
        list.add(new Student(107, "Vickey", 23));
        list.add(new Student(101, "Naresh", 21));
        list.add(new Student(109, "Jagdeesh", 24));

        System.out.println("Sorting According to age...");
        Comparator<Student> cmp1 = Comparator.comparing(Student::getAge);
        Collections.sort(list, cmp1);
        for (Student st : list) System.out.println(st.id + ", " + st.name + ", " + st.age);

        System.out.println("Sorting According to name...");
        Comparator<Student> cmp2 = Comparator.comparing(Student::getName);
        Collections.sort(list, cmp2);
        for (Student st : list) System.out.println(st.id + ", " + st.name + ", " + st.age);

        System.out.println("Sorting According to id...");
        Comparator<Student> cmp3 = Comparator.comparing(Student::getId);
        Collections.sort(list, cmp3);
        for (Student st : list) System.out.println(st.id + ", " + st.name + ", " + st.age);

        System.out.println("Considers null to be less than non-nulls...");
        Comparator<Student> cmp4 = Comparator.comparing(Student::getName, Comparator.nullsFirst(String::compareTo));
        Collections.sort(list, cmp4);
        for (Student st : list) System.out.println(st.id + ", " + st.name + ", " + st.age);

        System.out.println("Considers null to be greater than non-nulls...");
        Comparator<Student> cmp5 = Comparator.comparing(Student::getName, Comparator.nullsLast(String::compareTo));
        Collections.sort(list, cmp5);
        for (Student st : list) System.out.println(st.id + ", " + st.name + ", " + st.age);
    }
}
