public class CountLeavesInTree {
    public static int countLeaves(Node root)
    {
        if(root == null)
            return 0;
        if(root.left == null && root.right == null)
            return 1;
//        recursive call
        return countLeaves(root.left) + countLeaves(root.right);
    }
    public static void main(String[] args) {
        Node root = new Node(1);
        root.left = new Node(2);
        root.right = new Node(3);
        root.left.left = new Node(4);
        root.left.right = new Node(5);
        root.right.left = new Node(6);
        root.right.right = new Node(7);
        System.out.println("Leave node are in tree: " + countLeaves(root));
    }
}
