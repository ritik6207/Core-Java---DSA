package RevisionClass.MoreClassSecond;

import java.util.Scanner;

public class BalancedParentheses {
    public static void pintBal(int n, int oc, int cc, String ans)
    {
        if(oc == n && cc == n)
        {
            System.out.println(ans);
            return;
        }
        if(oc < n)
        {
            pintBal(n, oc + 1, cc, ans + '(');
        }
        if(oc > cc)
        {
            pintBal(n, oc , cc + 1, ans + ')');
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number print Balanced Parentheses");
        int n = sc.nextInt();
        String str = "";
        pintBal(n, 0, 0, str);   //Oc is denoted as OpenCount and cc is denoted as CloseCount
    }
}
