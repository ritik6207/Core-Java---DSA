import java.util.PriorityQueue;

public class Priority_Queue {
    public static void main(String[] args) {
        PriorityQueue pq = new PriorityQueue();
        pq.add(100);
        pq.add(50);
        pq.add(150);
        pq.add(25);
        pq.add(75);
        pq.add(125);
        pq.add(175);

        System.out.println(pq);   //PriorityQueue is follows Min - Heap Algorithm and complete binary tree data structure
        //in priority queue duplicate is allowed
        pq.add(25);
        System.out.println(pq);
    }
}
