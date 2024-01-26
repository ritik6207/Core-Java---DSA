//Floyd's Cycle Detection Algorithm
public class CycleDetection {
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
    //Implementation of inserting linkedList at Beginning
    public void insertLL(int newData)
    {
        Node newNode = new Node(newData);
        newNode.next =  head;
        head = newNode;
    }

    //Implementation of cycle Detection Loop LinkedList
    public void cycleDetect()
    {
        Node slow = head;
        Node fast = head;
        int flag = 0;
        while (fast != null && fast.next != null && slow != null)
        {
            slow = slow.next;
            fast = fast.next.next;
            if(slow == fast)
            {
                flag = 1;
                break;
            }
        }
        if(flag == 0)
        {
            System.out.println("Loop is not Detected");
        }
        else {
            System.out.println("Loop is Detected");
        }
    }
    //printing the linkedList
    public void display()
    {
        Node cur = head;
        while (cur != null)
        {
            System.out.print(cur.data + " ");
            cur = cur.next;
        }
    }
    public static void main(String[] args) {
        CycleDetection list = new CycleDetection();
        list.insertLL(6);
        list.insertLL(5);
        list.insertLL(4);
        list.insertLL(3);
        list.insertLL(2);
        list.insertLL(1);
        list.display();
        System.out.println();

        //Creating Circular LinkedList that's way we're detecting the loop
        Node  temp = list.head;
        while (temp.next != null)
        {
            temp = temp.next;
        }
        temp.next = list.head;

        //calling  CycleDetected() method
        list.cycleDetect();
    }
}
