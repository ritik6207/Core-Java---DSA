//Reverse word and each character
package Reversing_String;
import java.util.Scanner;
public class case3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the String");
        String s1 = sc.nextLine();
        String s2 = "";
        for (int i = s1.length() - 1; i >= 0; i--)
        {
            s2 += s1.charAt(i);
        }
        System.out.println("Reverse word and each character are");
        System.out.println(s2);
    }
}
