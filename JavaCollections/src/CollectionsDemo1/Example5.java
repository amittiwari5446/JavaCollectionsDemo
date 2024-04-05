package CollectionsDemo1;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Example5 {
    static class Student implements Comparable<Student> {
        int id;
        String name;
        int age;

        public Student(int id, String name, int age) {
            this.id = id;
            this.name = name;
            this.age = age;
        }

        public int compareTo(Student student) {
            if (this.id > student.id) return 1;
            else if (this.id < student.id) return -1;
            else return 0;
        }
        /* alternate
        public int compareTo(Student student){
            return Integer.compare(this.id,student.id);
        }
         */

        @Override
        public String toString() {
            return "Student{" +
                    "id=" + id +
                    ", name='" + name + '\'' +
                    ", age=" + age +
                    '}';
        }

        public static void main(String[] args) {
            List<Student> list = new ArrayList<>();
            list.add(new Student(104, "Suresh", 23));
            list.add(new Student(102, "Gopal", 22));
            list.add(new Student(107, "Vickey", 23));
            list.add(new Student(101, "Suresh", 21));
            list.add(new Student(109, "Jagdeesh", 24));

            Collections.sort(list);
            System.out.println("List: " + list);
        }
    }
}
