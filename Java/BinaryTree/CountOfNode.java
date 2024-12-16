package BinaryTree;
// Class to represent a Node in the binary tree.
class Node
{
    int data; // Data stored in the node.
    Node left, right;// References to the left and right child nodes.

    // Constructor to initialize a new node with a value and null children.
    public Node(int item)
    {
        data = item;
        left = right = null;// Set left and right children to null initially.
    }
}

public class CountOfNode
{
    // Method to count the nodes in a binary tree
    public static int countOfNodes(Node root)
    {
        // Base case: if the current node is null, return 0 as there are no nodes.
        if (root == null)
        {
            return 0;
        }

        // Recursively count nodes in the left and right subtrees.
        int leftNodes = countOfNodes(root.left); // Count nodes in the left subtree.
        int rightNodes = countOfNodes(root.right);// Count nodes in the right subtree.

         // Return the total count: left subtree + right subtree + 1 (for the current node).
        return leftNodes + rightNodes + 1;
    }
    public static void main(String[] args)
    {
        // Create a binary tree
        Node root = new Node(1);
        root.left = new Node(2);
        root.right = new Node(3);
        root.left.left = new Node(4);
        root.left.right = new Node(5);

        // Count the total number of nodes in the tree.
        int nodeCount = countOfNodes(root);

        System.out.println("Total number of nodes in the tree: " + nodeCount);
    }
}