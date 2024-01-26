package Map;

import java.util.*;

public class AccessingTheObjectInMap {
    public static void main(String[] args) {
        Map map = new HashMap();
        map.put(1, "Ritik"); // Entry
        map.put(2, "Rohit");
        map.put(3, "Rohan");
        map.put(4, "Ramesh");
        System.out.println(map);

        System.out.println(map.get(3)); // using get method print particular value with the help of key

        // Accessing only key with the help of keySet method
        Set key = map.keySet();
        Iterator itr = key.iterator(); // return only key
        while (itr.hasNext()) {
            // System.out.println(itr.next());
            // With the help of object
            Integer key1 = (Integer) itr.next();
            System.out.println(key1);
        }

        // Accessing only value with the help of value method
        Collection value = map.values();
        Iterator itr1 = value.iterator(); // Return only values
        while (itr1.hasNext()) {
            // System.out.println(itr1.next());
            // with the help of object
            String names = (String) itr1.next();
            System.out.println(names);
        }

        // Accessing both key and values with the help of entrySet method
        Set entry = map.entrySet();
        Iterator irt2 = entry.iterator();
        while (irt2.hasNext()) {
            // System.out.println(irt2.next());
            // with the help of object
            Map.Entry data = (Map.Entry) irt2.next();
            System.out.println(data.getKey() + " : " + data.getValue());
        }
    }
}
