package StringAssignmentOne;
import java.util.Scanner;
public class TakeInputUser {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the String");
        String s1 = sc.next(); // Without space
        String s2 = sc.nextLine(); // With space
        System.out.println(s1);
        System.out.println(s2);
    }
}