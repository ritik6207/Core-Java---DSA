package AssignmentQuestion;
//Time complexity: O(NlogN)
//Space Complexity: O(n)
import java.util.Scanner;
import java.util.TreeMap;

public class Question2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of key - value pairs: ");
        int n = sc.nextInt();
        TreeMap<String , Integer> map = new TreeMap<>();
        System.out.println("Enter the key - value pairs: ");
        for(int i = 0; i < n; i++)
        {
            int key = sc.nextInt();
            String value = sc.next();
            map.put(value, key);
        }
        System.out.println("The Mpa is: " + map);
    }
}
