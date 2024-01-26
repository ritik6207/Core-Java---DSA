import java.util.Scanner;

public class PrefixSum {
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            System.out.println("Enter the size of arrray");
            int n = sc.nextInt();
            int arr[] = new int[n];
            System.out.println("Enter the Elements of array");
            for(int i = 0; i< n; i++)
            {
                arr[i] = sc.nextInt();
            }
            System.out.println("your array is : -");
            for(int i = 0; i < n; i++)
            {
                System.out.print(arr[i] + " ");
            }
            //Calculating Prefix Sum
            for(int i = 1; i < n; i++)
            {
                arr[i] = arr[i] + arr[i - 1];
            }
            System.out.println();
            System.out.println("Prefix Sum is");
            for(int i = 0; i < n; i++)
            {
                System.out.print(arr[i] + " ");
            }
        }
    }
}
