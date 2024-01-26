public class InsertionBST {
    public static Node insertInBST(Node root, int val)
    {
        if(root == null)
        {
            return new Node(val);
        }

        if(val < root.data)
        {
            root.left = insertInBST(root.left, val);
        }
        else
        {
            root.right = insertInBST(root.right, val);
        }
        return root;
    }
    public static void main(String[] args) {
        Node root = new Node(27);
        root.left = new Node(17);
        root.right = new Node(37);
        root.left.left = new Node(7);
        root.left.right = new Node(24);
        root.right.left = new Node(31);
        root.right.right = new Node(47);
       insertInBST(root, 28);
    }

    private static void insertInBST(Node root) {
    }
}
