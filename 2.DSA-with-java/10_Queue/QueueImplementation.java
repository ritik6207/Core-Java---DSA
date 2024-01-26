import java.util.LinkedList;
import java.util.Queue;

public class QueueImplementation {
    public static void main(String[] args) {
        Queue<Integer> q = new LinkedList<>();

        //Inserting the element in Queue
        for(int i = 1; i <= 10; i++)
        {
            q.add(i);   //Enqueue -> Inserting the element.
        }

        System.out.println("Queue Looks like is: " + q);

        System.out.println("Topmost element in Queue before deletion is: " + q.peek());

        //Remove the element in queue
        q.remove();

        System.out.println("Topmost element in Queue after deletion is: " + q.peek());

        //size of queue
        System.out.println("Size of Queue: " + q.size());
    }
}
