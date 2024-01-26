package Map;
import java.util.*;
public class HashMap_And_LinkedHashMap {
    public static void main(String[] args) {
        HashMap hm = new HashMap();
//        hm.put(null , null);
        hm.put(01, "Ritik");         //Key must be unique and value is common
        hm.put(02, "Rohit");
        hm.put(03, "Raj");
        hm.put(04, "Ritesh");
//        hm.put(04, "Ritesh");     //if you entry the key is duplicate then in HashMap consider only one time
        System.out.println(hm);

        HashMap hm1 = new  HashMap();
        hm1.put("Virat", "Ritik");
        hm1.put("Dhoni", "Rohan");
        hm1.put("K L Rahul", "Sundram");

        System.out.println(hm1);  //in this output order is not preserve


        //For preserving the order we are using LinkedHashMap

        LinkedHashMap hm2 = new  LinkedHashMap();
        hm2.put("Virat", "Ritik");
        hm2.put("Dhoni", "Rohan");
        hm2.put("K L Rahul", "Sundram");

        System.out.println(hm2);
    }
}
