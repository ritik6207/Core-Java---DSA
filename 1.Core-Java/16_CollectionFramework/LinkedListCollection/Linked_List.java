package LinkedListCollection;

import java.util.LinkedList;

public class Linked_List {
    public static void main(String[] args) {
        //Adding Homogeneous type of data
        LinkedList ll1 = new LinkedList();
        ll1.add(100);
        ll1.add(200);
        ll1.add(300);
        System.out.println(ll1);

        //Adding Heterogeneous type of data
        LinkedList ll2 = new LinkedList();
        ll2.add("Ritik");
        ll2.add(20);
        ll2.add('K');
        ll2.add(4.2);
        System.out.println(ll2);

        LinkedList ll3 = new LinkedList();
        ll3.add(10);
        ll3.add(20);
        ll3.add(30);
        System.out.println(ll3);

        ll3.addFirst("Ram");
        ll3.addLast(100);
        System.out.println(ll3);

        //using peak method we can find first elements of linkedList collection,
        System.out.println(ll3.peek());
        System.out.println(ll3);  //not delete first element of collection

        //using poll method we can find first element of linkedList of collection, but delete the element 2nd time
        System.out.println(ll3.poll());
        System.out.println(ll3);    //Delete first element of collection
    }
}
