package PracticsQuestion;

import java.util.Scanner;

public class NumberOfPaths {
    public static long numberOfPaths(int m , int n)
    {
        long[][] M = new long[m][n];
        for (int i = 0; i < m; i++)
        {
            for (int j = 0; j < n; j++)
            {
                if (i == 0 || j == 0)
                {
                    M[i][j] = 1;
                }
                else
                {
                    M[i][j] =  M[i - 1][j] +  M[i][j - 1];
                }
            }
        }
        return M[m - 1][n - 1];
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of row");
        int m = sc.nextInt();
        System.out.println("Enter the size of column");
        int n = sc.nextInt();
        System.out.println();
        System.out.println("Total paths to reach to start point to Eed Point : " + numberOfPaths(m, n));
    }
}
