import java.util.HashMap;
import java.util.Map;

public class HashMapFunction {
    public static void main(String[] args) {
        //Functionality of put() function
        HashMap<Integer, String> hashmap = new HashMap<>();
        hashmap.put(1, "Ritik");
        hashmap.put(2, "Rohit");
        hashmap.put(3, "Rakesh");
        hashmap.put(4, "Supriya");
        hashmap.put(5,"Mushkan");
        hashmap.put(6, "Prity");

        System.out.println("HashMap of given data is: " + hashmap);

        //Functionality of get() function
        String res = hashmap.get(3);
        System.out.println("Value for given key is: " + res);

        //functionality of containsKey() function
        System.out.println(hashmap.containsKey(9));

        //Functionality of the remove() function
        hashmap.remove(2);
        System.out.println("Updated hashmap : " + hashmap);

        //Iterating using for loop
        for(Map.Entry<Integer,String > e : hashmap.entrySet())
        {
            System.out.println("HashMap is ");
            System.out.println(e.getKey() + " : " + e.getValue());
        }
    }
}
