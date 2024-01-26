package RevisionClass;

import java.util.Scanner;

public class PrintMultiplicationGivenRange {
    public static void pintMulti(int n, int k)
    {
        if(k == 1)
        {
            System.out.println(n);
            return;
        }
        pintMulti(n, k - 1);
        System.out.println(n * k);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the Number");
        int n = sc.nextInt();
        System.out.println("Enter the Range of Multiplication");
        int k = sc.nextInt();
        System.out.println("Multiplication of " + n +" is ");
        pintMulti(n,k);
    }
}
