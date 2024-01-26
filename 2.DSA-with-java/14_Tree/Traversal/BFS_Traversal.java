//BFS (Breadth-first Search): - In this technique we travers the node Level wise
package Traversal;
import java.util.*;
public class BFS_Traversal {

    //Non-Recursive Using Queue Method
    public static ArrayList <Integer> levelOrder(Node node)
    {
        // Storing node in arrayList
        ArrayList <Integer> ans = new ArrayList<>();

        //check if the node is empty return Arraylist
        if(node == null)
            return ans;

        //Create a Queue Class using LinkedList
        Queue<Node> q = new LinkedList<>();

        //Add first data in queue or node
        q.add(node);

        //Check Queue is empty or not if not empty goes to loop
        while(!q.isEmpty())
        {
            //Remove the node in first
            Node n = q.remove();

            //Store in List
            ans.add(n.data);

            //check left or right null or not
            if(n.left != null)
                q.add(n.left);

            if(n.right != null)
                q.add(n.right);
        }
        return ans;
    }

    //Recursive Method
    public  static  boolean printLevel(Node root, int level)
    {
        if(root == null)
            return false;
        if(level == 1)
        {
            System.out.print(root.data + " ");
            return true;
        }
        boolean left = printLevel(root.left, level - 1);
        boolean right = printLevel(root.right, level - 1);
        return (left || right);
    }
    public static void levelOrderTraversal(Node root)
    {
        int level = 1;
        while (printLevel(root, level))
        {
            level++;
        }
    }
    public static void main(String[] args) {
        Node root = new Node(1);
        root.left = new Node(2);
        root.right = new Node(3);
        root.left.left = new Node(4);
        root.left.right = new Node(5);
        root.right.left = new Node(6);
        root.right.right = new Node(7);
//        levelOrderTraversal(root);
        System.out.println(levelOrder(root));
    }
}
