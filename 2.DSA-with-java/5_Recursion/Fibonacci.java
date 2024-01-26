import java.util.Scanner;

public class Fibonacci {
    public static int fibonacciSeries(int n)
    {
        if(n <= 1)
        {
            return n;
        }
        return fibonacciSeries(n - 1) + fibonacciSeries(n - 2);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number find Fibonacci Series");
        int n = sc.nextInt();
        int result = fibonacciSeries(n);
        System.out.println("Fibonacci series of " + n + " is " + result);
    }
}
