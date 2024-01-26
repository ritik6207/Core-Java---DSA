package RevisionClass.MoreClassSecond;

import java.util.Scanner;

public class AlternateSighSeries {
    public static int alternateEvenSignSeries(int n)    //if n = 5; then  -1 + 2 - 3 + 4 - 5  = -3
    {
        if(n == 0)
        {
            return 0;
        }
        if(n % 2 == 0)
        {
            return alternateEvenSignSeries(n - 1) + n;
        }
        else
        {
            return alternateEvenSignSeries(n - 1) - n;
        }
    }

    public static int alternateOddSignSeries(int n)      //if n = 5; then  1 - 2 + 3 - 4 + 5  = 3
    {
        if(n == 0)
        {
            return 0;
        }
        if(n % 2 == 0)
        {
            return alternateOddSignSeries(n - 1) - n;
        }
        else {
            return alternateOddSignSeries(n - 1) + n;
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number");
        int n = sc.nextInt();
        System.out.println("If Even is +(ve) Sing");
        int result = alternateEvenSignSeries(n);
        System.out.println("Alternate Sum of Series: " + result);
        System.out.println();
        System.out.println("If Odd is +(ve) Sing");
        int ans = alternateOddSignSeries(n);
        System.out.println("Alternate Sum of Series: " + ans);
    }
}
