//Detect Duplicate in array , at most 1 duplicate is present
package AssignmentQuestion;
import java.util.*;
import java.io.*;
public class Question3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of array: ");
        int n = sc.nextInt();
        int[] arr = new int[n];
        System.out.println("Enter the elements: ");
        for(int i = 0; i < n; i++)
        {
            arr[i] = sc.nextInt();
        }

        HashMap<Integer, Integer> map = new HashMap<>();
        boolean duplicate = false;
        for(int i = 0; i < n; i++)
        {
            if(map.containsKey(arr[i]))
            {
                duplicate = true;
                System.out.println("Yes");
                break;
            }
            map.put(arr[i], 1);
        }
        if(!duplicate)
        {
            System.out.println("No");
        }
    }
}
