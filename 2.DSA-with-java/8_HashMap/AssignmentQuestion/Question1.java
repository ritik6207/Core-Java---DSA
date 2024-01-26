package AssignmentQuestion;

import java.util.Scanner;
import java.util.TreeMap;

public class Question1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        TreeMap<Integer, String > map = new TreeMap<>();

        System.out.println("Enter the number of Key - value pairs: ");
        int n = sc.nextInt();
        System.out.println("Enter the key - value pairs: ");
        for(int i = 0; i < n; i++)
        {
            int key = sc.nextInt();
            String value = sc.next();
            map.put(key, value);
        }
        System.out.println("Map Looks like: " + map);
    }
}
