// Package declaration
package BinaryTree;

// Class to represent a Node in the tree
class Node {
    int data;
    Node left, right;

    // Constructor to create a new Node
    public Node(int item) {
        data = item;
        left = right = null;
    }
}

public class CountOfNode {

    // Method to count the nodes in a binary tree
    public static int countOfNodes(Node root) {
        // Base case: if the node is null, return 0
        if (root == null) {
            return 0;
        }

        // Recursively count nodes in the left and right subtrees
        int leftNodes = countOfNodes(root.left);
        int rightNodes = countOfNodes(root.right);

        // Return the total number of nodes (left + right + 1 for the current node)
        return leftNodes + rightNodes + 1;
    }

    public static void main(String[] args) {
        // Create a binary tree
        Node root = new Node(1);
        root.left = new Node(2);
        root.right = new Node(3);
        root.left.left = new Node(4);
        root.left.right = new Node(5);

        // Count the nodes in the tree
        int nodeCount = countOfNodes(root);

        // Print the result
        System.out.println("Total number of nodes in the tree: " + nodeCount);
    }
}
