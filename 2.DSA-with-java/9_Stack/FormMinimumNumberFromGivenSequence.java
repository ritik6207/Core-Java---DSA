/*
Q:- Auxiliary given a pattern containing only I's and D's. I form increasing and D for Decreasing.
Device an algorithm to print the minimum number following that pattern Digits 1 - 9 and Digits can't repeat.

Example:
Input : D      Output : 21
Input : I      Output : 12
Input : DD     Output : 321
Input : II     Output : 123
 */
import java.util.*;
public class FormMinimumNumberFromGivenSequence {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter String only I's and D's");
        String str = sc.nextLine();
        Stack<Integer> stack = new Stack<>();
        for(int i = 0; i <= str.length(); i++)
        {
            stack.push(i + 1);

            if(i == str.length() || str.charAt(i) == 'I')
            {
                while (!stack.isEmpty())
                {
                    System.out.print(stack.pop()+ " ");
                }
            }
        }
    }
}
