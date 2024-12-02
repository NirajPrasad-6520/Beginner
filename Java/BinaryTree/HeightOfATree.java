package BinaryTree;

class Node
{
    int data;
    Node left, right;

    // Constructor to create a new Node
    public Node(int item)
    {
        data = item;
        left = right = null;
    }
}

public class HeightOfATree
{
    public static int height(Node root)
    {
        if(root == null) return 0;

        int leftHeight = height(root.left);
        int rightHeight = height(root.right);

        int myHeight = Math.max(leftHeight , rightHeight) + 1 ;

        return myHeight;
    }
    public static void main(String[] args) {
        // Create a binary tree
        Node root = new Node(1);
        root.left = new Node(2);
        root.right = new Node(3);
        root.left.left = new Node(4);
        root.left.right = new Node(5);

        int nodeHeight = height(root);

        // Print the result
        System.out.println("Height of a tree: " + nodeHeight);
    }
}