import java.util.Scanner;
public class TotalOccurrence {
    //first occurrence
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
    //Last Occurrence
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
        int n  = sc.nextInt();
        int []arr = new int[n];
        System.out.println("Enter the elements of array");
        for(int i = 0; i < n; i++)
        {
            arr[i] = sc.nextInt();
        }
        System.out.println("Enter the target");
        int target = sc.nextInt();
        int firstOcc = findFistOccurrence(arr, target);
        int lastOcc = findLastOccurrence(arr, target);
        int totalOcc = (lastOcc - firstOcc) + 1;
        System.out.println("Total number of Occurrence of " + target + " are " + totalOcc);
    }
}
