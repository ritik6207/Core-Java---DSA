import java.util.Scanner;

public class OptimizePrefixSum {
    public static void PrefixSum(int arr[][])
    {
        int m = arr.length;      //Length of rows
        int n = arr[0].length;    //Length of column

        //Traverse the Array row - wise calculate the row - wise prefix sum
        for(int i = 0; i < m; i++)
        {
            for(int j = 1; j < n; j++)
            {
                arr[i][j] += arr[i][j - 1];
            }
        }

        //Traverse the Array column - wise calculate the column - wise prefix sum
        for(int j = 0; j < n; j++)
        {
            for(int i = 1; i < m; i++)
            {
                arr[i][j] += arr[i - 1][j];
            }
        }
    }

    public static int sumRegion(int arr[][], int r1, int c1, int r2, int c2)
    {
        int sum = 0, up = 0, left = 0, repeated_Region = 0,  result = 0;
        sum = arr[r2][c2];
        up = arr[r1 - 1][c2];
        left = arr[r2][c1 - 1];
        repeated_Region = arr[r1 - 1][c1 - 1];
        result =  sum - up - left + repeated_Region;
        return result;

    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the Size of rows");
        int rows = sc.nextInt();
        System.out.println("Enter the Size of column");
        int col = sc.nextInt();
        int arr[][] = new int[rows][col];
        System.out.println("Enter the elements of Matrix");
        for(int i = 0; i < rows; i++)
        {
            for(int j = 0; j < col; j++)
            {
                arr[i][j] = sc.nextInt();
            }
        }
        System.out.println("Your Matrix is ");
        for(int i = 0; i < rows; i++)
        {
            for(int j = 0; j < col; j++)
            {
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }
        System.out.println();
        //Calculating Prefix Sum 
        System.out.println("Enter the value of r1 Cordinate");
        int r1 = sc.nextInt();
        System.out.println("Enter the value of c1 Cordinate");
        int c1 = sc.nextInt();
        System.out.println("Enter the value of r2 Cordinate");
        int r2 = sc.nextInt();
        System.out.println("Enter the value of c2 Cordinate");
        int c2 = sc.nextInt();
        PrefixSum(arr);
        int result = sumRegion(arr, r1, c1, r2, c2);
        System.out.println("Sum of elements of given rectangle is : " + result);
    }
}
