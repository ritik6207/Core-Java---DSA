import java.util.Stack;

public class QueueUsingStack {
    Stack<Integer> stack1 = new Stack<>();
    Stack<Integer> stack2 = new Stack<>();

    //Insert the element in the Queue
    //Time Complexity: O(1)
     void enQueue(int data)
    {
        stack1.push(data);
    }

    //Deletion of data form the queue
    int deQueue()
    {
        int ele;
        if(stack1.empty() && stack2.empty())
        {
            System.out.println("Queue is Empty");
            System.exit(0);
        }

        //push all element form stack1 to stack2
        if(stack2.empty())
        {
            while (!stack1.empty())
            {
                ele = stack1.pop();
                stack2.push(ele);
            }
        }

        //pop the top most element from stack2
        ele = stack2.pop();
        return ele;
    }

    public static void main(String[] args) {
        QueueUsingStack q = new QueueUsingStack();
        //Calling the method enQueue
        q.enQueue(1);
        q.enQueue(2);
        q.enQueue(3);
        q.enQueue(4);

        //Calling the method deQueue
        System.out.println("Queue is "+q.deQueue());
        System.out.println("Queue is "+q.deQueue());
        System.out.println("Queue is "+q.deQueue());
    }
}
