public class FindMiddleNodeLinkedList {
    Node head;
    class Node
    {
        int data;
        Node next;
        Node(int d)
        {
            data = d;
            next = null;
        }
    }

    //Implementation of inserting LinkedList at beginning
    public void insertAtBeginning(int newData)
    {
        Node newNode = new Node(newData);
        newNode.next = head;
        head = newNode;
    }

    //Find Middle data or Node in LinkedList
    public void findMidData()
    {
        Node slow = head;
        Node fast = head;

        while (fast != null && fast.next != null)
        {
            slow = slow.next;
            fast = fast.next.next;
        }
        assert slow != null;
        System.out.println("Middle value of Linked List is " + slow.data);
    }
    //Displaying the LinkedList
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
        FindMiddleNodeLinkedList list = new FindMiddleNodeLinkedList();
        list.insertAtBeginning(4);
        list.insertAtBeginning(3);
        list.insertAtBeginning(2);
        list.insertAtBeginning(1);
        list.insertAtBeginning(5);
        list.display();
        System.out.println();
        list.findMidData();
    }
}
