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

public class DeleteBST
{
    // This function deletes a given key x from the given BST and returns the modified root of the BST
    static Node delNode(Node root, int x)
    {
        // Base case: if the root is null, return null (nothing to delete)
        if (root == null) return root;

        // If the key to be deleted is smaller than the current node's key,
        // it lies in the left subtree, so we recursively call delNode on the left child
        if (root.key > x)
        {
            root.left = delNode(root.left, x);
        }
        // If the key to be deleted is greater than the current node's key,
        // it lies in the right subtree, so we recursively call delNode on the right child
        else if (root.key < x)
        {
            root.right = delNode(root.right, x);
        }
        else
        { // If the current node matches the key to be deleted
            // Case 1: If the node has no left child (only right child or no child)
            if (root.left == null) return root.right;

            // Case 2: If the node has no right child (only left child)
            if (root.right == null) return root.left;

            // Case 3: If the node has both left and right children
            // Find the in-order successor (smallest node in the right subtree)
            Node successor = getSuccessor(root);
            
            // Replace the key of the current node with the key of the successor
            root.key = successor.key;
            
            // Delete the successor node (which has been moved to the current node)
            root.right = delNode(root.right, successor.key);
        }
        return root;
    }

    // This function finds the in-order successor (smallest node in the right subtree)
    static Node getSuccessor(Node curr)
    {
        // Move to the right child
        curr = curr.right;

        // Continue moving to the leftmost node in the right subtree
        while (curr != null && curr.left != null)
        {
            curr = curr.left;
        }

        // Return the leftmost node, which is the in-order successor
        return curr;
    }

    // Utility function to do an in-order traversal and print the tree
    static void inorder(Node root)
    {
        if (root != null)
        {
            inorder(root.left);   // Traverse left subtree
            System.out.print(root.key + " ");  // Print current node's key
            inorder(root.right);  // Traverse right subtree
        }
    }
    public static void main(String[] args)
    {
        // Create a sample BST
        Node root = new Node(10);
        root.left = new Node(5);
        root.right = new Node(15);
        root.right.left = new Node(12);
        root.right.right = new Node(18);

        // Print the original BST
        System.out.print("Original BST (in-order): ");
        inorder(root);
        System.out.println();

        // The value to be deleted
        int x = 15;

        // Delete the node with the given value (x)
        root = delNode(root, x);

        // Print the modified BST after deletion
        System.out.print("BST after deleting " + x + " (in-order): ");
        inorder(root);
    }
}