import java.util.Scanner;

public class Power {
    //Optimize Approach to find a ^ b
    //Time Complexity : O(logN)
    //Space Complexity : O(N)
    public static int OptimizeApproachFindPower(int a, int b)
    {
        int result = 0, finalResult = 0, mid = 0;
        if(b == 1)
        {
            return a;
        }
        else {
            mid = b / 2;
            result = OptimizeApproachFindPower(a, mid);
            finalResult = result * result;
            if(b % 2 == 0)
            {
                return  finalResult;
            }
            else {
                return a * finalResult;
            }
        }
    }

    //Brute Force Approach to find Power
    //Time Complexity : O(n)
    //Space Complexity : O(n)
    public static int bruteForceApproachFindPower(int a, int b)
    {
        if(b == 1)
        {
            return a;
        }
        return a * bruteForceApproachFindPower(a, b - 1);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the value of a & b ");
        int a = sc.nextInt();
        int b = sc.nextInt();
        System.out.println("Optimize Approach to find the Power");
        int ans = OptimizeApproachFindPower(a, b);
        System.out.println("Power of " + a + "^" + b + " is : " + ans);
        System.out.println();
        System.out.println("Brute Force Approach to find the Power");
        int ans1 = bruteForceApproachFindPower(a, b);
        System.out.println("Power of " + a + "^" + b + " is : " + ans1);
    }
}
