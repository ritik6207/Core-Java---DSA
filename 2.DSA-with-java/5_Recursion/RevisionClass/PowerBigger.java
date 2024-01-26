package RevisionClass;
//Find Big value of Power
import java.math.BigInteger;    //import java.math.*;
import java.util.Scanner;      //import java.util.*;

public class PowerBigger {
    public static BigInteger powerBig(BigInteger a, int b)
    {
        BigInteger result, finalResult;
        if(b == 1 || b == 0)
        {
            return  a;
        }
        else {
            result = powerBig(a, b / 2);
            finalResult = result.multiply(result);

            if(b % 2 == 0)
            {
                return finalResult;
            }
            else {
                return a.multiply(result);
            }
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the value of a and b");
        BigInteger a = sc.nextBigInteger();
        int b = sc.nextInt();
        BigInteger result = powerBig(a, b);
        System.out.println("Power of " + a + "^" + b + " is " + result);
    }
}
