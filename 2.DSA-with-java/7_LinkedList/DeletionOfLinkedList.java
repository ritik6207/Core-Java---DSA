public class DeletionOfLinkedList {
    Node head;
    class Node{
        int data;
        Node next;
        Node(int d)
        {
            data = d;
            next = null;
        }
    }

    //Implementation of Insertion Linked List at end of Node
    public void insertNode(int newData)
    {
        Node newNode = new Node(newData);

        //Linked is empty
        if(head == null)
        {
            head = new Node(newData);
            return;
        }

        //Linked is not empty
        newNode.next = null;
        Node temp = head;

        while (temp.next != null)
        {
            temp = temp.next;
        }
        temp.next = newNode;
        return;
    }

    //Implementation of deletion LinkedList
    public void deleteLL(int position)
    {
        //LinkedList is empty
        if(head == null){
            return;
        }

        Node temp = head;
        //Deletion is in the Beginning of the Node
        if(position == 0){
            head = temp.next;
            return;
        }

        //Deletion is not in the Beginning of node
        for(int i = 0; temp != null && i < position - 1; i++){
            temp = temp.next;
        }

        if(temp == null && temp.next == null){
            return;
        }
        temp.next = temp.next.next;
    }
    //Displaying the Linked List
    public void display()
    {
        Node currNode = head;
        while (currNode != null)
        {
            System.out.print(currNode.data + " ");
            currNode = currNode.next;
        }
    }
    public static void main(String[] args) {
        DeletionOfLinkedList del = new DeletionOfLinkedList();
        del.insertNode(1);
        del.insertNode(2);
        del.insertNode(3);
        del.insertNode(4);
        del.insertNode(5);
        System.out.println("Before Deletion LinkedList");
        del.display();
        System.out.println();
        del.deleteLL(2);
        System.out.println("After Deletion LinkedList");
        del.display();
    }
}
