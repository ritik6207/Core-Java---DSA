package InsertionOfLinkedList;

import java.util.LinkedList;

public class AtTheEnd {
    Node head;
     class Node{
         int data;
         Node next;

         Node(int d){
             data = d;
             next = null;
         }
     }

     //Implementation of Insertion of a node at the end
    public void insertAtEnd(int newData)
    {
        //
        Node newNode = new Node(newData);

        //LikedList is empty
        if(head == null){
            head = new Node(newData);
            return;
        }

        //LinkedList is not empty
        newNode.next = null;
        Node temp = head;
        while (temp.next != null){
            temp = temp.next;
        }
        temp.next = newNode;
        return;
    }

    //Implementation of Displaying the linkedList
    public void display()
    {
        Node current = head;
        while (current != null){
            System.out.print(current.data + " ");
            current = current.next;
        }
    }
    public static void main(String[] args) {
        AtTheEnd llist = new AtTheEnd();
        llist.insertAtEnd(2);
        llist.insertAtEnd(4);
        llist.insertAtEnd(6);
        llist.insertAtEnd(8);

        System.out.println("Before Inserting of 10");
        llist.display();

        System.out.println();

        llist.insertAtEnd(10);
        System.out.println("After Inserting of 10");
        llist.display();
    }
}
