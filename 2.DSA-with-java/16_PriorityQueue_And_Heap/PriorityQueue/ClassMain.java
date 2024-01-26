package PriorityQueue;

import java.util.Comparator;
import java.util.PriorityQueue;

public class ClassMain {
    public static void main(String[] args) {
//        Comparator.reverseOrder() , reverse the order we can say that descending order
        PriorityQueue<Integer> pq = new PriorityQueue<>(Comparator.reverseOrder());
//        Time Complexity of add Method O(logN)
        pq.add(4);
        pq.add(2);
        pq.add(1);
        pq.add(8);
        pq.add(7);

        while (!pq.isEmpty())
        {
            //Time Complexity of peek method O(1)
            System.out.println(pq.peek());
            //Time Complexity of remove method O(logN)
            pq.remove();
        }
    }
}
