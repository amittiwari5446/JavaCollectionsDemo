package ArrayListDemo1;

import java.io.*;
import java.util.ArrayList;

public class Example8 {
    public static void main(String[] args) throws IOException, ClassNotFoundException {
        ArrayList<String> list = new ArrayList<>();
        list.add("Ravi");
        list.add("Bhupendra");
        list.add("Yogesh");
        list.add("Mahesh");

        //Serialization
        FileOutputStream fos = new FileOutputStream("D://Amit for Practice/java collections/files/newText1.txt");
        ObjectOutputStream oos = new ObjectOutputStream(fos);
        oos.writeObject(list);
        fos.close();
        oos.close();

        //Deserialization
        FileInputStream fis = new FileInputStream("D://Amit for Practice/java collections/files/newText1.txt");
        ObjectInputStream ois = new ObjectInputStream(fis);
        ArrayList list2 = (ArrayList) ois.readObject();
        fis.close();
        ois.close();
        System.out.println(list2);
    }
}
