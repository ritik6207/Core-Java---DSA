package Traversal;
//DFS (Depth-first Search)
public class DFS_Traversal {
    //Preorder Traversal
    public static void preOrderTraversal(Node root)
    {
        if(root == null)
        {
            return;
        }
        System.out.print(root.data + " ");
        preOrderTraversal(root.left);
        preOrderTraversal(root.right);
    }

    //Inorder Traversal
    public static void inOrderTraversal(Node root)
    {
        if(root == null)
            return;
        inOrderTraversal(root.left);
        System.out.print(root.data + " ");
        inOrderTraversal(root.right);
    }

    //Postorder Traversal
    public static void postOrderTraversal(Node root)
    {
        if(root == null)
            return;
        postOrderTraversal(root.left);
        postOrderTraversal(root.right);
        System.out.print(root.data + " ");
    }
    public static void main(String[] args) {
         /* Construct the following tree
                   1
                 /   \
                /     \
               2       3
              /      /   \
             /      /     \
            4      5       6
                  / \
                 /   \
                7     8
        */

        Node root = new Node(1);
        root.left = new Node(2);
        root.right = new Node(3);
        root.left.left = new Node(4);
        root.right.left = new Node(5);
        root.right.right = new Node(6);
        root.right.left.left = new Node(7);
        root.right.left.right = new Node(8);
        System.out.println("Preorder TraverSal: Rule:- root, left, right");
        preOrderTraversal(root);
        System.out.println();
        System.out.println("Inorder TraverSal: Rule:- left, root, right");
        inOrderTraversal(root);
        System.out.println();
        System.out.println("Postorder TraverSal: Rule:- left, right, root");
        postOrderTraversal(root);
    }
}
