package practice.ArrayList;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;

public class ArrayListSerializationAndDeserialization {
    public static void main(String[] args) {

        ArrayList<String> two = new ArrayList<>();

        two.add("Daniel");
        two.add("Martins");
        two.add("Dean");
        two.add("James");
        System.out.println(two);

        try {
//            Serialization
            FileOutputStream three = new FileOutputStream("file");
            ObjectOutputStream four = new ObjectOutputStream(three);
            four.writeObject(two);
            three.close();
            four.close();

//            Deserialization
            FileInputStream five = new FileInputStream("file");
            ObjectInputStream six = new ObjectInputStream(five);
            ArrayList list = (ArrayList) six.readObject();
            System.out.println(list);
        } catch (Exception e) {
            System.out.println(e);
        }
    }
}
