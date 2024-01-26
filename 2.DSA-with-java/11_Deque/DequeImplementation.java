import java.util.ArrayDeque;
import java.util.Deque;

public class DequeImplementation {
    public static void main(String[] args) {
        Deque<Integer> dq = new ArrayDeque<>();
        dq.addFirst(5);
        dq.addFirst(7);
        dq.addFirst(9);

        System.out.println("Deque is look like: " + dq);

        Deque<Integer> dq1 = new ArrayDeque<>();
        dq1.addLast(5);
        dq1.addLast(7);
        dq1.addLast(9);

        System.out.println("Deque is look like: "+ dq1);

        dq1.removeFirst();
        System.out.println("Deque updated is look like: "+ dq1);
    }
}
