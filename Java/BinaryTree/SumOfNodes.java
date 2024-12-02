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

public class SumOfNodes {

    public static int sumOfNodes(Node root) {
        // Base case: if the node is null, return 0
        if (root == null) {
            return 0;
        }

        // Recursively sum nodes in the left and right subtrees
        int leftSum = sumOfNodes(root.left);
        int rightSum = sumOfNodes(root.right);

        return leftSum + rightSum + root.data;
    }

    public static void main(String[] args) {
        // Create a binary tree
        Node root = new Node(1);
        root.left = new Node(2);
        root.right = new Node(3);
        root.left.left = new Node(4);
        root.left.right = new Node(5);

        // Sum the nodes in the tree
        int nodeSum = sumOfNodes(root);

        // Print the result
        System.out.println("Total sum of nodes in the tree: " + nodeSum);
    }
}