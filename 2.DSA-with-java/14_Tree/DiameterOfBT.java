
public class DiameterOfBT {
    static int max = 0;

    public static int diameterOfBinaryTree(Node root) {
        height(root);
        return max;
    }

    public static int height(Node root) {
        if (root == null)
            return 0;

        int left = height(root.left);
        int right = height(root.right);
        int diameter = left + right;
        max = Math.max(max, diameter);
        return 1 + Math.max(left, right);
    }

    public static void main(String[] args) {
        Node root = new Node(1);
        root.left = new Node(2);
        root.right = new Node(6);
        root.left.left = new Node(3);
        root.left.right = new Node(4);
        root.left.right.right = new Node(5);
        root.right.left = new Node(7);
        root.right.right = new Node(8);
        root.right.right.right = new Node(9);
        System.out.println("Maximum path of one node to other node: " + diameterOfBinaryTree(root));
    }
}
