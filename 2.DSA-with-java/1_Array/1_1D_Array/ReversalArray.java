import java.util.Scanner;

public class ReversalArray {
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            System.out.println("Enter the size of array ");
            int n = sc.nextInt();
            int[] arr = new int[n];
            System.out.println("Enter the element of array ");
            for(int i = 0; i < n; i++)
            {
                arr[i] = sc.nextInt();
            }
            System.out.println("Before Reversal of array");
            for(int i = 0; i < n; i++)
            {
                System.out.print(arr[i] + " ");
            }
            System.out.println();

            //Algorithm of Reversal
            for(int i = 0; i < n / 2; i++)
            {
                //Swaping elements between arr[i] and arr[n - i - 1].
                int temp = arr[i];
                arr[i] = arr[n - i - 1];
                arr[n - i - 1] = temp;
            }
            System.out.println();
            System.out.println("After Reversal of array ");
            for(int i = 0; i < n; i++)
            {
                System.out.print(arr[i] + " ");
            }
        }
    }
}
