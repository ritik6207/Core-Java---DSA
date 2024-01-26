package RevisionClass.MoreClassSecond;

import java.util.Scanner;

public class PrintMazePathTwo {
    public static void printMazePathTwo(int cr, int cc, int dr, int dc, String ans)
    {
        if(cr > dr || cc > dc){
            return;
        }
        if(cr == dr && cc == dc)
        {
            System.out.println(ans);
            return;
        }
        printMazePathTwo(cr, cc + 1, dr, dc, ans + 'H');     //if travers column wise print H
        printMazePathTwo(cr + 1, cc, dr, dc, ans + 'V');     //if travers row wise print V
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Current row");
        int cr = sc.nextInt();
        System.out.println("Enter Current column");
        int cc = sc.nextInt();
        System.out.println("Enter Destination row");
        int dr = sc.nextInt();
        System.out.println("Enter Destination column");
        int dc = sc.nextInt();
        String ans = "";
        System.out.println("Possible path to reach Destination");
        printMazePathTwo(cr, cc, dr, dc, ans);
    }
}
