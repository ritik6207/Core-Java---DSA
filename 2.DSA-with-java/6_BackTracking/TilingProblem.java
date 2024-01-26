import java.util.Scanner;

public class TilingProblem {
    public static int getWays(int n)
    {
        //Base case
        if(n <= 3)
        {
            return n;
        }
        //Recursive call
        return getWays(n - 1) + getWays(n - 2);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the Size of Board");
        int n = sc.nextInt();
        int result = getWays(n);
        System.out.println("Total number of ways: " + result);
    }
}
