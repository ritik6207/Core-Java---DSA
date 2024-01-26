import java.util.Scanner;

public class CountWays {
    public static int countWays(int n)
    {
        if(n <= 1)
        {
            return n;
        }
        return countWays(n - 1) + countWays(n - 2);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the Stairs");
        int n = sc.nextInt();
        int result = countWays(n + 1);
        System.out.println("The number of Ways are : " + result);
    }
}
