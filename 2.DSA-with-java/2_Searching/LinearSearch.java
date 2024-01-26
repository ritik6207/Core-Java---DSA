import java.util.Scanner;

public class LinearSearch {
    public static int linearSearch(int arr[], int key)
    {
        for(int i = 0; i < arr.length; i++)
        {
            if(arr[i] == key)
            {
                return i;
                // break;
            }
        }
        return -1;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of array");
        int n = sc.nextInt();
        int arr[] = new int[n];
        System.out.println("Enter the elements of array");
        for(int i = 0; i < n;i++)
        {
            arr[i] = sc.nextInt();
        }
        System.out.println("Enter the Target");
        int Target = sc.nextInt();
        int ans = linearSearch(arr, Target);
        if(ans == -1)
        {
            System.out.println("Element is not present at any index");
        }
        else
        {
            System.out.println("Element is present at index " + ans);
        }
    }
}
