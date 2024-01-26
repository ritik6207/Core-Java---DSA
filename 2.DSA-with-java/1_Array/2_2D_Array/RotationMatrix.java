//Rotation of matirx by 90 degree
import java.util.*;
public class RotationMatrix {
    public static void roatatMatrix(int[][] arr)
    {
        int row = arr.length;
        int col = arr[0].length;

        //Step 1: Transpose of Matrix
        for(int i = 0; i < row; i++)
        {
            for(int j = i; j < col; j++)
            {
                int temp = arr[i][j];
                arr[i][j] = arr[j][i];
                arr[j][i] = temp;
            }
        }

        //Step 2: Swaping elements left and right side
        for(int i = 0; i < row; i++)
        {
            int left_index = 0;
            int right_index = col - 1;

            while(left_index < right_index)
            {
                int temp = arr[i][left_index];
                arr[i][left_index] = arr[i][right_index];
                arr[i][right_index] = temp;
                left_index++;
                right_index--;
            }
        }
    }
    public static void main(String[] args) {
        int[][] arr = {
            {1, 2, 3, 4},
            {5, 6, 7, 8},
            {9, 10, 11, 12},
            {13, 14, 15, 16}
        };

        //Method calling
        roatatMatrix(arr);

        for(var mat : arr)
        {
            System.out.println(Arrays.toString(mat));
        }
    }
}
