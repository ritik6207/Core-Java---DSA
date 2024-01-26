package RevisionClass;

import java.util.Scanner;

public class BinarySearchRecur {
    public static int binarySearch(int[] arr, int low, int high, int target)
    {
        int result = -1;
        while(low <= high)
        {
            int mid = low + (high - low)/2;
            if(arr[mid] == target)
            {
                return mid;
            }
            else if(arr[mid] < target)
            {
                return binarySearch(arr, mid + 1, high, target);
            }
            else {
                return binarySearch(arr, low, mid - 1, target);
            }
        }
        return result;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] arr = {2, 4, 6, 8, 10, 12};
        System.out.println("Enter the target");
        int target = sc.nextInt();
        int ans = binarySearch(arr, 0, arr.length - 1, target);
        if(ans == -1)
        {
            System.out.println("No target element found in array");
        }
        else {
            System.out.println("Target element found at index " + ans);
        }

    }
}
