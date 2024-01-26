import java.util.Scanner;

public class Prefix_Sum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the Size of array");
        int n = sc.nextInt();
        int arr[] = new int[n];
        System.out.println("Enter the element of array");
        for(int i = 0; i < n; i++)
        {
            arr[i] = sc.nextInt();
        }
        System.out.println("Your Array is");
        for(int i = 0; i < n; i++)
        {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
        //find PrefixSum
        int prefixsum[] = new int[arr.length];
        for(int i = 0; i < arr.length; i++)
        {
            prefixsum[i] = arr[i] + prefixsum[i - 1];
        }
        System.out.println("PrefixSum is ");
        for(int i = 0; i < arr.length; i++)
        {
            System.out.print(prefixsum[i] + " ");
        }
    }
}
