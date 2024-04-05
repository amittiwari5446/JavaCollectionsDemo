package CollectionsDemo1;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

class Students implements Comparable<Students> {
    String name;
    int age;

    Students(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public int compareTo(Students student) {
        return Integer.compare(this.age, student.age);
    }

    //customized toString() Method
    @Override
    public String toString() {
        return name;
    }

    /* original toString() method
    @Override
    public String toString() {
        return "Students{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }
     */
}

public class Example4 {
    public static void main(String[] args) {

        List<Students> list = new ArrayList<>();

        list.add(new Students("Rahul", 23));
        list.add(new Students("Ganesh", 24));
        list.add(new Students("Vijay", 21));
        list.add(new Students("Aman", 22));

        System.out.println("Unsorted List: " + list);
        Collections.sort(list);
        System.out.println("Sorted List: " + list);

    }
}
