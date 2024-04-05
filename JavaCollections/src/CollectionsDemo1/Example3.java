package CollectionsDemo1;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

class Student implements Comparable<Student> {
    String name;

    Student(String name) {
        this.name = name;
    }

    public int compareTo(Student student) {
        return this.name.compareTo(student.name);
    }

    //customized toString() Method
    @Override
    public String toString() {
        return name;
    }

     /* original toString method
     @Override
     public String toString() {
         return "Student{" +
                 "name='" + name + '\'' +
                 '}';
     }
     */

}

public class Example3 {
    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>();

        //applying Wrapper Classes to the integer values
        list.add(Integer.valueOf(10));
        list.add(Integer.valueOf(41));
        list.add(Integer.valueOf(23));
        list.add(Integer.valueOf(32));
        list.add(Integer.valueOf(49));
        list.add(Integer.valueOf(8));
        list.add(Integer.valueOf(76));
        list.add(Integer.valueOf(18));
        list.add(Integer.valueOf(75));

        System.out.println("Unsorted List: " + list);
        Collections.sort(list);
        System.out.println("Sorted List: " + list);

        List<Student> list2 = new ArrayList<>();
        list2.add(new Student("Rahul"));
        list2.add(new Student("Ganesh"));
        list2.add(new Student("Vijay"));
        list2.add(new Student("Aman"));

        System.out.println("Unsorted List: " + list2);
        Collections.sort(list2);
        System.out.println("Sorted List: " + list2);

    }
}
