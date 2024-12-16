package BinaryTree;
//Number of Nodes in the longest path between ant 2 nodes.
//Approach 1= 0(n^2)

class Node
{
    int data; // Data value stored in the node.
    Node left, right; // References to the left and right child nodes.

    // Constructor to initialize the node with a value and null children.
    public Node(int item)
    {
        data = item; // Assign the value to the node.
        left = right = null; // Initially, both children are set to null.
    }
}

// Main class to calculate the diameter of a binary tree.
public class DiameterOfTree
{
    // Method to calculate the height of a binary tree.
    public static int height(Node root)
    {
        // Base case: if the current node is null, the height is 0.
        if (root == null)
            return 0;

        // Recursively calculate the height of the left subtree.
        int leftHeight = height(root.left);
        // Recursively calculate the height of the right subtree.
        int rightHeight = height(root.right);

        // The height of the current node is the greater height of its subtrees + 1.
        int myHeight = Math.max(leftHeight, rightHeight) + 1;

        return myHeight; // Return the height of the current node.
    }

    // Method to calculate the diameter of the binary tree.
    public static int diameter(Node root)
    {
        // Base case: if the current node is null, the diameter is 0.
        if (root == null)
            return 0;

        // Recursively calculate the diameter of the left subtree.
        int diam1 = diameter(root.left);

        // Recursively calculate the diameter of the right subtree.
        int diam2 = diameter(root.right);

        // Calculate the diameter passing through the current node.
        // This is the sum of the heights of the left and right subtrees plus 1 (current node).
        int diam3 = height(root.left) + height(root.right) + 1;

        // Return the maximum diameter out of the three calculated values.
        return Math.max(diam3, Math.max(diam1, diam2));
    }
    public static void main(String[] args)
    {
        // Create a binary tree.
        // Root node with value 1.
        Node root = new Node(1);
        // Left child of root with value 2.
        root.left = new Node(2);
        // Right child of root with value 3.
        root.right = new Node(3);
        // Left child of node 2 with value 4.
        root.left.left = new Node(4);
        // Right child of node 2 with value 5.
        root.left.right = new Node(5);

        System.out.println("Diameter of the tree: " + diameter(root));
    }
}