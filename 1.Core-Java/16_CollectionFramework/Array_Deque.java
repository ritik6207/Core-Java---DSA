import java.util.ArrayDeque;

public class Array_Deque {
    public static void main(String[] args) {
        ArrayDeque ad1 = new ArrayDeque();
        ad1.add(100);
        ad1.add(200);
        ad1.add(300);
        System.out.println(ad1);

        ad1.add("RK");
        System.out.println(ad1);

        ad1.addFirst(50);
        ad1.addLast(250);
        System.out.println(ad1);

        ad1.offer(15);
        ad1.offerFirst(10);
        ad1.offerLast(25);
        System.out.println(ad1);
    }
}
