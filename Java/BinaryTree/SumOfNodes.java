package BinaryTree;

class Node
{
    int data; // Value stored in the node
    Node left, right; // References to the left and right child nodes

    public Node(int item)
    {
        data = item;
        left = right = null; // Initialize children as null
    }
}

public class SumOfNodes
{
    public static int sumOfNodes(Node root)
    {
        // Base case: If the current node is null, return 0
        if (root == null)
        {
            return 0;
        }

        // Recursively calculate the sum of the left and right subtrees
        int leftSum = sumOfNodes(root.left);
        int rightSum = sumOfNodes(root.right);

        // Return the sum of the left subtree, right subtree, and the current node's value
        return leftSum + rightSum + root.data;
    }
    public static void main(String[] args)
    {
        // Create a binary tree
        Node root = new Node(1); // Root node
        root.left = new Node(2); // Left child of the root
        root.right = new Node(3); // Right child of the root
        root.left.left = new Node(4); // Left child of node 2
        root.left.right = new Node(5); // Right child of node 2

        // Calculate the sum of all nodes in the tree
        int nodeSum = sumOfNodes(root);

        System.out.println("Total sum of nodes in the tree: " + nodeSum);
    }
}