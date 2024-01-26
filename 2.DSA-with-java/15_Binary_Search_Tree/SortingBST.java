public class SortingBST {
    public static void sorting(Node root)
    {
        //Using Preorder technique sort the BST
        if(root == null)
            return;
        sorting(root.left);
        System.out.print(root.data + " ");
        sorting(root.right);
    }
    public static void main(String[] args) {
        Node root = new Node(50);
        root.left = new Node(30);
        root.right = new Node(70);
        root.left.left = new Node(20);
        root.left.right = new Node(40);
        root.right.left = new Node(60);
        root.right.right = new Node(90);
        sorting(root);
    }
}
