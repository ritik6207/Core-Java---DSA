public class ReverseLinkedList {
    Node head;
    class Node{
        int data;
        Node next;
        Node(int d){
            data = d;
            next = null;
        }
    }

    //Implementation linkedList at end
    public void insertAtEnd(int newData)
    {
        Node newNode = new Node(newData);
        //LikedList is empty
        if(head == null)
        {
            head = new Node(newData);
            return;
        }

        //if LinkedList is not empty
        newNode.next = null;
        Node temp = head;
        while (temp.next != null){
            temp = temp.next;
        }
        temp.next = newNode;
        return;
    }

    //Reversal LinkedList in Iteratively(using loop)
    public Node reverseLL()
    {
        Node curr = head;
        Node prev_ptr = null;
        Node nextPtr = null;

        while (curr != null)
        {
            nextPtr = curr.next;
            curr.next = prev_ptr;
            prev_ptr = curr;
            curr = nextPtr;
        }
        head = prev_ptr;
        return head;
    }

    //Implementation of Reversal LinkedList in Recursion Way
    public void reverseRec(Node curr, Node prev)
    {
        if(curr.next == null)
        {
            head = curr;
            curr.next = prev;
            return;
        }

        Node nextPtr = curr.next;
        curr.next = prev;
        reverseRec(nextPtr, curr);
    }

    //Displaying the LikedList
    public void display()
    {
        Node currData = head;
        while (currData.next != null)
        {
            System.out.print(currData.data + " ");
            currData = currData.next;
        }

    }
    public static void main(String[] args) {
        ReverseLinkedList list = new ReverseLinkedList();
        list.insertAtEnd(2);
        list.insertAtEnd(4);
        list.insertAtEnd(6);
        list.insertAtEnd(8);
        list.insertAtEnd(10);
        list.insertAtEnd(12);
//        System.out.println("Before Reversal LinkedList");
        list.display();
        System.out.println();
        System.out.println("After Reversal LinkedList");

//        list.reverseLL();            //Reversal LinkedList in Iteratively(using loop)
//        list.display();
//        list.reverseRec(list.head, null);
//        list.display();

    }
}
