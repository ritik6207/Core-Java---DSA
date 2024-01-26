public class ValidateBST {
    public static boolean isValidBST(Node root)
    {
        return check(root, Long.MIN_VALUE, Long.MAX_VALUE);
    }

    public static boolean check(Node root, long min, long max)
    {
        if(root == null)
                return true;
        if(root.data <= min || root.data >= max)
            return false;

        return check(root.left, min, root.data) && check(root.right, root.data, max);
    }
    public static void main(String[] args) {
        Node root = new Node(50);
        root.left = new Node(30);
        root.right = new Node(70);
        root.left.left = new Node(20);
        root.left.right = new Node(40);
        root.right.left = new Node(60);
        root.right.right = new Node(90);
        System.out.println(isValidBST(root));
    }
}
