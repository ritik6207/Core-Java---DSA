//Time Complexity: O(n)
//Space Complexity: O(n)
import java.util.HashMap;
import java.util.Scanner;

public class TwoSum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of array");
        int n = sc.nextInt();
        int[] arr = new  int[n];
        System.out.println("Enter the elements of array");
        for(int i = 0; i < n; i++)
        {
            arr[i] = sc.nextInt();
        }

        System.out.println("Enter the Target");
        int target = sc.nextInt();

        //Creating HashMap storing the key and value pairs
        HashMap<Integer, Integer> map = new HashMap<>();
        for(int i = 0; i < n; i++)
        {
            map.put(arr[i], i);
        }

        //Create Result array to display the index of two numbers
        int[] result = {-1, -1};   //if element is not present in array print[-1, -1] and given target value but index are not present then print[-1,-1]

        //traversing The key and value pair
        for(int i = 0;i < n; i++)
        {
            //if current element is equal to target
            if(arr[i] == target && map.containsKey(0))
            {
                result[0] = i;
                result[1] = map.get(0);
            }

            //if current element is not equal to target
            else if (map.containsKey(target - arr[i])) {
                //Check, Is element is non-repeatable
                if(map.get(target - arr[i]) > i)
                {
                    result[0] = i;
                    result[1] = map.get(target - arr[i]);
                    break;
                }
            }
        }
        System.out.println("Two sum of index is: " + "[" + result[0] + "," + result[1] + "]");
    }
}
