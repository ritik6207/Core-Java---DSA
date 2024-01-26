import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.TreeMap;

/*
There are four Type of Map:-
1. HashMap
2. LinkedHashMap
3. TreeMap
4. HashTable
 */
public class TypesOfMap {
    public static void main(String[] args) {
        //HashMap:- Storing key or Value Unordered map
        HashMap<Integer, String > map = new HashMap<>();
        map.put(3, "Ritik");
        map.put(1, "Supriya");
        map.put(4, "Rohit");
        map.put(2, "Priya");
        map.put(5, "Neha");
        System.out.println("HashMap class Looks Like: " + map);

        //LinkedHashMap:- Storing key or Value Ordered map
        LinkedHashMap<Integer, String > map1 = new LinkedHashMap<>();
        map1.put(3, "Ritik");
        map1.put(1, "Supriya");
        map1.put(4, "Rohit");
        map1.put(2, "Priya");
        map1.put(5, "Neha");
        System.out.println("LinkedHashMap class Looks Like: " + map1);

        //TreeMap:- Sorted data in terms of keys
        TreeMap<Integer, String > map2 = new TreeMap<>();
        map2.put(3, "Ritik");
        map2.put(1, "Supriya");
        map2.put(4, "Rohit");
        map2.put(2, "Priya");
        map2.put(5, "Neha");
        map2.put(6, "Anjali");
        System.out.println("TreeMap class Looks Like: " + map2);
    }
}
