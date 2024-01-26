import java.util.Scanner;

public class TwoDarray {
    public static void main(String[] args) {
//        int a[][] = {
//                {3, 4, 6},
//                {5, 6, 3},
//                {8, 9, 2}
//                    };
//        for(int i = 0; i <= 2; i++)
//        {
//            for (int j = 0; j <= 2; j++)
//            {
//                System.out.print(a[i][j] + " ");
//            }
//            System.out.println();
//        }

        // Taking user input
        Scanner sc = new Scanner(System.in);
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
        for (int i = 0; i < r; i++)
        {
            for (int j = 0; j < c; j++)
            {
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }
    }
}
