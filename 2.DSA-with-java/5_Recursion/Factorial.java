import java.util.Scanner;

public class Factorial {
    public static long factorialNum(int n)
    {
        if(n == 0 || n == 1)
        {
            return  1;
        }
        return n * factorialNum(n - 1);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number");
        int n = sc.nextInt();
        long ans = factorialNum(n);
        System.out.println("Factorial of " + n + " is : " + ans );
    }
}
