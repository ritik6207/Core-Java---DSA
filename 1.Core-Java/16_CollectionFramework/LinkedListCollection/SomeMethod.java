package LinkedListCollection;

import java.util.LinkedList;

public class SomeMethod {
    public static void main(String[] args) {
        LinkedList ll1 = new LinkedList();
        ll1.add(100);
        ll1.add(200);
        ll1.add(300);
        ll1.add(300);
        System.out.println(ll1);

        System.out.println(ll1.get(1));
        System.out.println(ll1.indexOf(300));
        System.out.println(ll1.lastIndexOf(300));
        System.out.println(ll1.getFirst());
        System.out.println(ll1.getLast());

        ll1.push(10);
        System.out.println(ll1);

        System.out.println(ll1.poll());
        System.out.println(ll1);
    }
}
