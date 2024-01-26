import java.util.Scanner;
import java.util.Stack;

public class ValidParenthesis {
    public static boolean isValid(String str)
    {
        char[] chars = str.toCharArray();

        Stack<Character> stack = new Stack<>();

        for (char ele : chars)
        {
            if(ele == '(' || ele == '[' || ele == '{')
            {
                stack.push(ele);
                continue;
            }
            else if(stack.empty())
            {
                return false;
            }

            char top = stack.pop();
            if(top == '(' && ele != ')')
            {
                return false;
            }
            else if(top == '[' && ele != ']')
            {
                return false;
            }
            else if(top == '{' && ele != '}')
            {
                return false;
            }
        }
        //is the stack is empty or not
        return (stack.empty() == true);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the Parenthesis");
        String str = sc.nextLine();
        System.out.println("Is the given String is valid? " + isValid(str));
    }
}
