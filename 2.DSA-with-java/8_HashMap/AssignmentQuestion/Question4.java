//Find the largest element in the array
package AssignmentQuestion;
import java.util.*;
import java.io.*;
public class Question4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of array");
        int n = sc.nextInt();
        int[] arr = new int[n];
        System.out.println("Enter the elements");
        for(int i = 0; i < n;i++)
        {
            arr[i] = sc.nextInt();
        }

        TreeMap<Integer,Integer> map = new TreeMap<>();
        for(int i = 0; i < n; i++)
        {
            map.put(arr[i], 1);
        }
        System.out.println("Largest element in the array: " + map.lastEntry().getKey());
    }
}
