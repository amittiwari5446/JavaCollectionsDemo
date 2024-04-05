package HashSetDemo1;

import java.util.ArrayList;
import java.util.HashSet;

class Book {
    int id;
    String name, author, publisher;
    int quantity;

    public Book(int id, String name, String author, String publisher, int quantity) {
        this.id = id;
        this.name = name;
        this.author = author;
        this.publisher = publisher;
        this.quantity = quantity;
    }
}

public class Example4 {
    public static void main(String[] args) {
        HashSet<Book> set = new HashSet<>();
        set.add(new Book(101, "Let us C", "Yashwant Kanetkar", "BPB", 8));
        set.add(new Book(102, "Data Communication and Networking", "Forouzen", "Mc Graw Hill", 4));
        set.add(new Book(103, "Operating System", "Galvin", "Wiley", 6));

        for (Book b : set)
            System.out.println(b.id + ", " + b.name + ", " + b.author + ", " + b.publisher + ", " + b.quantity);
    }
}
