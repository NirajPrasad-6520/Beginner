package BinaryTree;
import java.util.LinkedList;
import java.util.Queue;

// Node class to represent each node in the binary tree
class Node
{
    int data; // The value stored in the node
    Node left, right; // Left and right children of the node

    // Constructor to initialize a new node with a given value
    Node(int d)
    {
        data = d;
        left = right = null; // Initialize children as null
    }
}

class Traversal1
{
    static void inOrderDFS(Node node)
    {
        // Base case: if the node is null, return
        if (node == null) return;

        // Recursively traverse the left subtree
        inOrderDFS(node.left);
        // Visit the root (print the node data)
        System.out.print(node.data + " ");
        // Recursively traverse the right subtree
        inOrderDFS(node.right);
    }

    static void preOrderDFS(Node node)
    {
        // Base case: if the node is null, return
        if (node == null) return;

        // Visit the root (print the node data)
        System.out.print(node.data + " ");
        // Recursively traverse the left subtree
        preOrderDFS(node.left);
        // Recursively traverse the right subtree
        preOrderDFS(node.right);
    }

    static void postOrderDFS(Node node)
    {
        // Base case: if the node is null, return
        if (node == null) return;

        // Recursively traverse the left subtree
        postOrderDFS(node.left);
        // Recursively traverse the right subtree
        postOrderDFS(node.right);
        // Visit the root (print the node data)
        System.out.print(node.data + " ");
    }

    static void BFS(Node root)
    {
        // If the tree is empty, return
        if (root == null) return;

        // Initialize a queue to hold nodes for BFS
        Queue<Node> queue = new LinkedList<>();
        // Add the root node to the queue
        queue.add(root);

        // While the queue is not empty, process the nodes
        while (!queue.isEmpty())
        {
            // Remove the front node from the queue
            Node node = queue.poll();
            // Print the data of the current node
            System.out.print(node.data + " ");

            // Add the left child to the queue if it exists
            if (node.left != null) queue.add(node.left);
            // Add the right child to the queue if it exists
            if (node.right != null) queue.add(node.right);
        }
    }
    public static void main(String[] args)
    {
        // Create a binary tree
        Node root = new Node(2);
        root.left = new Node(3);
        root.right = new Node(4);
        root.left.left = new Node(5);

        // Perform and print the results of different traversals
        System.out.print("In-order DFS: ");
        inOrderDFS(root); // Expected Output: 5 3 2 4

        System.out.print("\nPre-order DFS: ");
        preOrderDFS(root); // Expected Output: 2 3 5 4

        System.out.print("\nPost-order DFS: ");
        postOrderDFS(root); // Expected Output: 5 3 4 2

        System.out.print("\nLevel order (BFS): ");
        BFS(root); // Expected Output: 2 3 4 5
    }
}