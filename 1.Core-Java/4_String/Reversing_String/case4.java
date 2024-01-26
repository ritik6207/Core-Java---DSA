//reverse character without changing the position of word
package Reversing_String;
import java.util.Scanner;
public class case4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the String");
        String s1 = sc.nextLine();
        String s2 = "";
        String sarr[] = s1.split(" ");
        for(String srt : sarr)
        {
            for(int i = srt.length() - 1; i >= 0; i--)
            {
                s2 += srt.charAt(i);
            }
            s2 += " ";
        }
        System.out.println("Reverse each character without changing word position");
        System.out.println(s2);
    }
}
