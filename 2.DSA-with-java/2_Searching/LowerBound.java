import java.util.Scanner;
public class LowerBound {
    public static int findFistOccurrence(int arr[], int target)
    {
        int low = 0;
        int high = arr.length - 1;
        int result = -1;
        while(low <= high)
        {
            int mid = low + (high - low)/2;
            if(arr[mid] == target)
            {
                result = mid;
                high = mid - 1;
            }
            else if(arr[mid] > target)
            {
                high = mid - 1;
            }
            else
            {
                low = mid + 1;
            }
        }
        return result;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of array");
        int n  = sc.nextInt();
        int []arr = new int[n];
        System.out.println("Enter the elements of array");
        for(int i = 0; i < n; i++)
        {
            arr[i] = sc.nextInt();
        }
        System.out.println("Enter the target");
        int target = sc.nextInt();
        int ans = findFistOccurrence(arr, target);
        if(target == -1)
        {
            System.out.println("Element is not present at any index");
        }
        else{
            System.out.println("First Occurence or Lower Bound of " + target + " is " + ans);
        }
    }
}
