package InsertionOfLinkedList;

public class AfterAnyNode {
    Node head;

    class Node{
        int data;
        Node next;

        Node(int d){
            data = d;
            next = null;
        }
    }
    //Implementation of Linked list at the end
    public void atEnd(int newData)
    {
        Node newNode = new Node(newData);
        if(head == null){
            head = new Node(newData);
            return;
        }
        newNode.next = null;
        Node temp = head;
        while ((temp.next != null)){
            temp = temp.next;
        }
        temp.next = newNode;
        return;
    }
    //Implementation of Linked List at after any node
    public void insertAfterAnyNode(Node prev_node, int newData)
    {
        if(prev_node == null){
            System.out.println("The Previous node cannot contain any values");
            return;
        }

        Node newNode = new Node(newData);

        newNode.next = prev_node.next;
        prev_node.next = newNode;

    }

    //displaying the linked list
    public void display(){
        Node currNode = head;
        while (currNode != null)
        {
            System.out.print(currNode.data + " ");
            currNode = currNode.next;
        }
    }
    public static void main(String[] args) {
        AfterAnyNode list = new AfterAnyNode();
        list.atEnd(2);
        list.atEnd(4);
        list.atEnd(6);
        list.atEnd(8);
        System.out.println("Before at any node ");
        list.display();
        System.out.println();
        System.out.println("After at any node");
        list.insertAfterAnyNode(list.head.next, 5);
        list.insertAfterAnyNode(list.head.next.next, 7);
        list.display();
    }
}
