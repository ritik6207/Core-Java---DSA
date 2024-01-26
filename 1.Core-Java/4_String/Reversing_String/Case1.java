//reverse each character
package Reversing_String;
import java.util.Scanner;
public class Case1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the String");
        String str1 = sc.next();
        String str2 = "";
        for(int i = str1.length() - 1; i >= 0; i--)
        {
            str2 = str2 + str1.charAt(i);   // + is use for concatenating the string
        }
        System.out.println("Reverse the each character");
        System.out.println(str2);
        sc.close();
    }
}
