package ArrayList;
import java.util.*;
public class InbultMethodArrayList {
    public static void main(String[] args) {
        ArrayList al1 = new ArrayList();
        al1.add(100);
        al1.add(200);
        al1.add(300);
        System.out.println(al1);
        //check elements present or not using Contains method if element is present print true otherwise false
        System.out.println(al1.contains(200));
        //find index of element of arraylist
        System.out.println(al1.indexOf(300));
        //find size of collection
        System.out.println(al1.size());

        //ensure capacity of collection, if required
        al1.ensureCapacity(10);
        //Trim the capacity ,
        al1.trimToSize();
        System.out.println(al1.size());
        //clear the collection of array list
        al1.clear();
        System.out.println(al1);

        List al = new ArrayList();
        al.add(10);
        al.add(20);
        al.add(30);
        System.out.println(al);
    }
}
