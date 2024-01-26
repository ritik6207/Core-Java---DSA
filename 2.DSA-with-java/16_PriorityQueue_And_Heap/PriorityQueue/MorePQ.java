package PriorityQueue;

import java.util.PriorityQueue;

public class MorePQ {
    static class Student implements Comparable<Student>
    {
        String name;
        int rank;
        public Student(String name, int rank)
        {
            this.name = name;
            this.rank = rank;
        }
        @Override
       public int compareTo(Student st)
        {
            return this.rank - st.rank;
        }
    }
    public static void main(String[] args) {
        //Comparator.reverseOrder(), reverse the order
//        PriorityQueue<Student> pq = new PriorityQueue<>(Comparator.reverseOrder());
        PriorityQueue<Student> pq = new PriorityQueue<>();
        pq.add(new Student("A" , 5));
        pq.add(new Student("B", 4));
        pq.add(new Student("C", 3));
        pq.add(new Student("D", 1));
        pq.add(new Student("E", 7));

        while (!pq.isEmpty())
        {
            System.out.println(pq.peek().name + " -> " + pq.peek().rank);
            pq.remove();
        }
    }
}
