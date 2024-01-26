import java.util.Scanner;

public class BinarySearchIn2DMatrix {
    public static boolean searchMatrix(int[][] matrix, int target)
    {
        int row = matrix.length;
        int col = matrix[0].length;

        int low = 0;
        int high = row * col - 1;

        while(low <= high)
        {
            int midIdx = low + (high - low) / 2;
            int element = matrix[midIdx / col][midIdx % col];
            if(element == target)
            {
                return true;
            }
            else if (element < target)
            {
                low = midIdx + 1;
            }
            else
            {
                high = midIdx - 1;
            }
        }
        return false;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of row ");
        int m = sc.nextInt();
        System.out.println("Enter the size of column");
        int n = sc.nextInt();
        int[][] matrix = new int[m][n];
        System.out.println("Enter the element in Sorted ways");
        for(int i = 0; i < m; i++)
        {
            for(int j = 0; j < n; j++)
            {
                matrix[i][j] = sc.nextInt();
            }
        }
        System.out.println("Enter the target value");
        int target = sc.nextInt();
        if(!searchMatrix(matrix, target))
        {
            System.out.println("Element is not present");
        }
        else {
            System.out.println("Element is present");
        }
    }
}
