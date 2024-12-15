package BinaryTree;
//Number of Nodes in the longest path between ant 2 nodes.
//Approach 1= 0(n^2)
class Node
{
    int data;
    Node left, right;

    public Node(int item)
    {
        data = item;
        left = right = null;
    }
}
public class DiameterOfTree
{
    public static int height(Node root)
    {
        if(root == null) return 0;

        int leftHeight = height(root.left);
        int rightHeight = height(root.right);

        int myHeight = Math.max(leftHeight , rightHeight) + 1 ;

        return myHeight;
    }

    public static int diameter(Node root)
    {
        if(root == null) return 0;

        int diam1 = diameter(root.left);
        int diam2 = diameter(root.right);
        int diam3 = height(root.left) + height(root.right) + 1;
        return Math.max(diam3, Math.max(diam1, diam2));
    }
    public static void main(String[] args)
    {
        // Create a binary tree
        Node root = new Node(1);
        root.left = new Node(2);
        root.right = new Node(3);
        root.left.left = new Node(4);
        root.left.right = new Node(5);

        System.out.println(diameter(root));
    }
}