import java.util.Arrays;

public class FibonacciSeries {
    //Top - Down Approach
    public static int fib(int n)
    {
        int a = 0, b = 1, c = 0;

        if (n == 0)
        {
            return a;
        }
        for(int i = 2; i <= n; i++)
        {
            c = a + b;
            a = b;
            b = c;
        }
        return c;
    }

    //Bottom - up Approach
    public static int fibHelper(int n, int[] fibSeries)
    {
        ///Base Case
        if (n == 0 || n == 1)
        {
            return n;
        }

        //check if an array contains -1 or not
        if(fibSeries[n] != -1)
        {
            return fibSeries[n];
        }

        int x = fibHelper(n - 1, fibSeries);
        int y = fibHelper(n - 2, fibSeries);

        fibSeries[n] = x + y;

        return fibSeries[n];
    }
    public static int fib1(int n)
    {
        int[] fibSeries = new int[n + 1];

        Arrays.fill(fibSeries, -1);

        return fibHelper(n, fibSeries);
    }
    public static void main(String[] args) {
        int n = 7;
        System.out.println("Fibonacci Series of " +  n + " is : " + fib(n));
        System.out.println();
        System.out.println("Fibonacci Series of " +  n + " is : " + fib1(n));
    }
}
