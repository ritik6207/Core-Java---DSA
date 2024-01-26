package StringAssignmentTwo;

import java.util.Scanner;

public class RemoveDuplicate {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the String");
        String s1 = sc.next();
        String s2 = "";
        for (int i = 0; i < s1.length(); i++)
        {
            boolean isDuplicate = false;
            for (int j = i + 1; j < s1.length(); j++)
            {
                if(s1.charAt(i) == s1.charAt(j))
                {
                    System.out.println(s1.charAt(i));
                    isDuplicate = true;
                }
            }
            if(!isDuplicate)
            {
                s2 += s1.charAt(i);
            }
        }
        System.out.println(s2);
    }
}
