import java.util.Scanner;

public class BinarySearch {
    public static int binarySearch(int arr[], int target) {
        int low = 0;
        int high = arr.length - 1;
        while (low <= high) {
            int mid = low + (high - low) / 2;
            if (arr[mid] == target) {
                return mid;
            } else if (arr[mid] < target) {
                low = mid + 1;
            } else // arr[mid] > target
            {
                high = mid - 1;
            }
        }
        return -1;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of array");
        int n = sc.nextInt();
        int[] arr = new int[n];
        System.out.println("Enter the elements in sorted way");
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        System.out.println("Enter the target");
        int key = sc.nextInt();
        int res = binarySearch(arr, key);
        if (res == -1) {
            System.out.println("Searched element is not present");
        } else {
            System.out.println("Searched element is present at index " + res);
        }
    }
}