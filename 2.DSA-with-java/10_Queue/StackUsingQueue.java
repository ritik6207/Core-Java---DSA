import java.util.LinkedList;
import java.util.Queue;

public class StackUsingQueue {
     static Queue<Integer> q1 = new LinkedList<>();
     static Queue<Integer> q2 = new LinkedList<>();

     //to add new data
     void add(int data)
    {
        //Move all the element from q1 to q2
        while (!q1.isEmpty())
        {
            q2.add(q1.peek());
            q1.poll();
        }

        //push new data to q1
        q1.add(data);

        //Move back all the element form q2 to q1
        while (!q2.isEmpty())
        {
            q1.add(q2.peek());
            q2.poll();
        }
    }

    //to delete the element form the stack
     int remove()
    {
        if(q1.isEmpty())
        {
            System.out.println("Stack OverFlow");
            System.exit(0);
        }
        int ele = q1.peek();
        q1.poll();
        return ele;
    }
    public static void main(String[] args) {
        StackUsingQueue s = new StackUsingQueue();
        //Push the element into the stack
        s.add(2);
        s.add(4);
        s.add(6);
        s.add(21);

        System.out.println("Deleted element from the Stack: "+s.remove());
        System.out.println("Deleted element from the Stack: "+s.remove());

    }
}
