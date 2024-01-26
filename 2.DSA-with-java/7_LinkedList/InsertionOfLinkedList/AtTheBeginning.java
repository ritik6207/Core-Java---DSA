package InsertionOfLinkedList;

public class AtTheBeginning {
    Node head;
     class Node{
         int data;
         Node next;

         Node(int d){
             data = d;
             next = null;
         }
     }

     //Implementation of linkedList at the Beginning
    public void insertAtBeginning(int newData){
         //Initialize the newNode with the newData entered the user
         Node newNode = new Node(newData);

         newNode.next = head;
         head = newNode;
    }

    //Displaying the linkedList
    public void display()
    {
        Node current = head;
        while (current != null){
            System.out.print(current.data + " ");
            current = current.next;
        }
    }
    public static void main(String[] args) {
        AtTheBeginning list = new AtTheBeginning();
        list.insertAtBeginning(2);
        list.insertAtBeginning(4);
        list.insertAtBeginning(6);
        System.out.println();
        list.display();
        System.out.println();
        list.insertAtBeginning(1);
        list.display();
    }
}
