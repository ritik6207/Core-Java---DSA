import java.util.*;
public class ForEachOrEnhancedForLoop {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // 1 D array
       /* System.out.println("Enter the element of array you want to store");
        int n = sc.nextInt();
        int arr[] = new int[n];
        System.out.println("Enter the elements ");
        for(int i = 0; i < arr.length; i++)
        {
            arr[i] = sc.nextInt();
        }
        System.out.println("Array element are: ");
        for (int x : arr)  // using Enhanced for loop, and you can say that also for each
        {
            System.out.println(x + " ");
        }  */

        // 2 D array
        System.out.println("Enter the number of rows you want to store");
        int r = sc.nextInt();
        System.out.println("Enter the number of column you want to store");
        int c = sc.nextInt();
        int arr[][] = new int[r][c];
        System.out.println("Enter the elements of array");
        for(int i = 0; i < r; i++)
        {
            for(int j = 0; j < c; j++)
            {
                arr[i][j] = sc.nextInt();
            }
        }
        System.out.println("Array elements are: ");
        for (int a[] : arr)  // using Enhanced for loop in 2 D array
        {
            for (int b : a)
            {
                System.out.print(b + " ");
            }
            System.out.println();
        }
    }
}
