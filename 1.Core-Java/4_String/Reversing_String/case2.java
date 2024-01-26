//reverse word in string
package Reversing_String;
import java.util.Scanner;
public class case2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the String");
        String s1 = sc.nextLine();
        String s2 = "";
        String sarr[] = s1.split(" ");   // in this split method converting the string in the form of array string
        for (int i = sarr.length - 1; i >= 0; i--)
        {
            s2 += sarr[i] + " ";
        }
        System.out.println("reverse word is ");
        System.out.println(s2);
    }
}
