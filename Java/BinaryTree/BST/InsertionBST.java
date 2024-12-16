package BinaryTree.BST;
// Class to represent a node in the Binary Search Tree (BST)
class Node
{
    int key; // Value of the node
    Node left, right;  // Left and right children of the node

    // Constructor to create a new node with a given value
    public Node(int item)
    {
        key = item;
        left = right = null;  // Initialize left and right children as null
    }
}

public class InsertionBST
{
    // A utility function to insert a new node with the given key
    static Node insert(Node root, int key)
    {
        // Base case: If the tree is empty, return a new node
        if (root == null) {
            return new Node(key);
        }

        // If the key is already present in the tree, return the node (no duplicates allowed)
        if (root.key == key)
        {
            return root;
        }

        // Otherwise, recur down the tree
        if (key < root.key)
        {
            // If key is smaller than root's key, insert it in the left subtree
            root.left = insert(root.left, key);
        } else {
            // If key is greater than root's key, insert it in the right subtree
            root.right = insert(root.right, key);
        }

        // Return the (unchanged) node pointer
        return root;
    }

    // A utility function to do an inorder tree traversal and print the keys
    static void inOrder(Node root)
    {
        if (root != null) {
            // Recur on the left subtree
            inOrder(root.left);
            // Print the root's key
            System.out.print(root.key + " ");
            // Recur on the right subtree
            inOrder(root.right);
        }
    }
    public static void main(String[] args)
    {
        // Start with an empty tree (null root)
        Node root = null;

        // Insert nodes to create the following BST:
        //           50
        //          /  \
        //         30   70
        //        / \   / \
        //       20 40 60 80

        root = insert(root, 50);
        root = insert(root, 30);
        root = insert(root, 20);
        root = insert(root, 40);
        root = insert(root, 70);
        root = insert(root, 60);
        root = insert(root, 80);

        // Perform in-order traversal of the BST and print the nodes
        inOrder(root);
    }
}