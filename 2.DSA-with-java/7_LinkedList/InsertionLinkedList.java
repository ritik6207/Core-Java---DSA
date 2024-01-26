import java.util.Scanner;

import static java.lang.System.exit;

public class InsertionLinkedList {
    Node head;
    class Node{
        int data;
        Node next;
        Node(int d){
            data = d;
            next = null;
        }
    }

    //Implementation of Insertion at the end
    public void insertAtEnd(int newData)
    {
        Node  newNode = new Node(newData);

        //if LinkedList is empty
        if(head == null){
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

    //Implementation of Insertion at the first
    public void insertAtBeginning(){
        Scanner b = new Scanner(System.in);
        System.out.println("Enter Value");
        int neData = b.nextInt();
        Node newNode = new Node(neData);
        newNode.next = head;
        head = newNode;
        System.out.println("Node inserted");
    }

    //Implementation of Insertion at after any node
    public void insertAtAnyNode(Node prev_node, int newData){
        if (prev_node == null){
            System.out.println("The previous does not contain any values");
            return;
        }
        Node newNode = new Node(newData);
        newNode.next = prev_node.next;
        prev_node.next = newNode;
    }

    //Displaying the LinkedList
    public void display(){
        Node currNode = head;
        while (currNode != null){
            System.out.print(currNode.data + " ");
            currNode = currNode.next;
        }
    }
    public static void main(String[] args) {
        InsertionLinkedList list = new InsertionLinkedList();
        int choice = 0;
        while (choice != 3)
        {
            Scanner sc = new Scanner(System.in);
            System.out.println("************Main Menu************");
            System.out.println("Choose one option form following list..");
            System.out.println("========================================");
            System.out.println("1. Insert in Beginning");
//            System.out.println("2. Insert in Last");
//            System.out.println("3. Insert at any random location");
            System.out.println("2. show");
            System.out.println("3. Exit");
            System.out.println("Enter your choice?");
            choice = sc.nextInt();
            switch (choice)
            {
                case 1:
                    list.insertAtBeginning();
                case 2:
                    list.display();
                case 3:
                    exit(0);
                    break;
                default:
                    System.out.println("Please enter valid choice..");
            }
        }
    }
}
