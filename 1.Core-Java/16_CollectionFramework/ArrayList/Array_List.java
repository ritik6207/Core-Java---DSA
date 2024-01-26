package ArrayList;

import java.util.*;

public class Array_List {
    public static void main(String[] args) {
        ArrayList al1 = new ArrayList();
        al1.add(122);
        al1.add(343);
        al1.add(123);
        al1.add(349);
        System.out.println(al1 + " Storing Homogeneous data type");

        System.out.println("*********************************************************");

        ArrayList al2 = new ArrayList ();
        al2.add("PW java");
        al2.add('R');
        al2.add(12);
        al2.add(2.23);
        System.out.println(al2 + " Storing  Heterogeneous data type");
        System.out.println("*********************************************************");
        al2.add(500);
        System.out.println(al2);
        System.out.println("*********************************************************");

        ArrayList al3 = new ArrayList();
        al3.add(1);
        al3.add(2);
        al3.add(3);
        al3.add(4);
        System.out.println(al3);
        System.out.println("After adding collection");
        al3.addAll(al2);
        System.out.println(al3);
        //adding particular index of data
        al3.add(2, "Ritik");
        System.out.println(al3);
    }
}
