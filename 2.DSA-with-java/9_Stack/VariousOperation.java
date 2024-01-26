import java.util.Stack;

public class VariousOperation {
    public static void main(String[] args) {
        Stack<Integer> stack = new Stack<>();

        //Inserting the elements , with push() method
        stack.push(2);
        stack.push(4);
        stack.push(6);
        stack.push(8);
        stack.push(9);

        //Print topmost element in the stack , with peek() method
        System.out.println("Before Deletion topmost element present in the stack is: " + stack.peek());

        //Delete topmost element in the stack , with pop() method
        stack.pop();

        System.out.println("After Deletion topmost element present in the stack is: " + stack.peek());

        //Searching the element present in the stack , with search() , if element is not present in the stack print -1.
        System.out.println("At index: " + stack.search(5));

        //Check Stack is empty or not , with empty(), It is return true or false ,  if stack is empty return true otherwise return false.

        System.out.println(stack.empty());
    }
}
