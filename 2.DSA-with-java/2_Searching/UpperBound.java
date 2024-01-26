import java.util.Scanner;

public class UpperBound {
    public static int findLastOccurrence(int arr[], int target)
    {
        int low = 0;
        int high = arr.length - 1;
        int reslut = -1;
        while(low <= high)
        {
            int mid = low + (high - low)/2;
            if(arr[mid] == target)
            {
                reslut = mid;
                low = mid + 1;
            }
            else if(arr[mid] < target)
            {
                low = mid + 1;
            }
            else
            {
                high = mid - 1;
            }
        }
        return reslut;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of array");
        int n = sc.nextInt();
        int[] arr = new int[n];
        System.out.println("Enter the elements of array");
        for(int i = 0; i < n; i++)
        {
            arr[i] = sc.nextInt();
        }
        System.out.println("Enter the target");
        int target = sc.nextInt();
        int ans = findLastOccurrence(arr, target);
        if(ans == -1)
        {
            System.out.println("Element is not presret at any index");
        }
        else{
            System.out.println("Last Occurrence or Upper Bound of " + target + " is " + ans);
        }
    }
}
