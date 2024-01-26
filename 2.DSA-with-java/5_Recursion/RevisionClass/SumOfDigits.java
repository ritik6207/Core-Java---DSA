package RevisionClass;

import java.util.Scanner;

//given number = 12345 , that's sum are 1+2+3+4+5 = 15
public class SumOfDigits {
    public static int sumOfDigits(int num)
    {
        if(num == 0)
            return 0;
        return (num % 10) + sumOfDigits(num / 10);
    }
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("Enter the number");
        int n = s.nextInt();
        int result = sumOfDigits(n);
        System.out.println("Sum of total Digits is: " + result);
    }
}
