package ArrayListDemo1;

import java.sql.Array;
import java.util.ArrayList;
import java.util.Iterator;

class Student {
    int rollnumber;
    String name;
    int age;

    Student(int rollnumber, String name, int age) {
        this.rollnumber = rollnumber;
        this.name = name;
        this.age = age;
    }
}

public class Example7 {
    public static void main(String[] args) {
        Student s1 = new Student(1, "Rahul", 17);
        Student s2 = new Student(2, "John", 18);
        Student s3 = new Student(3, "Deeksha", 17);

        ArrayList<Student> list = new ArrayList<>();
        list.add(s1);
        list.add(s2);
        list.add(s3);

        Iterator<Student> itr = list.iterator();
        while (itr.hasNext()) {
            Student st = itr.next();
            System.out.println(st.rollnumber + " " + st.name + " " + st.age);
        }
    }
}
