package BinaryTree.BST;
import java.util.ArrayList;
import java.util.List;

class TreeNode
{
    int val;  // Value of the node
    TreeNode left, right; // Left and right children

    // Constructor to create a new node with a given value
    TreeNode(int val)
    {
        this.val = val;
        left = right = null; // Initialize children to null
    }
}

public class BSTPaths
{
    // Method to print all root-to-leaf paths in the tree
    public void printRootToLeafPaths(TreeNode root)
    {
        // List to keep track of the current path from root to the leaf
        List<Integer> currentPath = new ArrayList<>();
        // Helper method to recursively find and print the paths
        printPathsRecursive(root, currentPath);
    }

    // Helper method to recursively find all the paths
    private void printPathsRecursive(TreeNode node, List<Integer> currentPath)
    {
        // Base case: If the current node is null, return (do nothing)
        if (node == null)
        {
            return;
        }

        // Add the current node's value to the path
        currentPath.add(node.val);

        // If the current node is a leaf node (no left or right child), print the path
        if (node.left == null && node.right == null)
        {
            System.out.println(currentPath);  // Print the current root-to-leaf path
        }
        else
        {
            // If not a leaf, recurse for the left and right children
            printPathsRecursive(node.left, currentPath);
            printPathsRecursive(node.right, currentPath);
        }

        // Backtrack: remove the current node from the path before returning to the parent node
        currentPath.remove(currentPath.size() - 1);
    }
    // Main function to test the printRootToLeafPaths method
    public static void main(String[] args)
    {
        // Creating a sample BST (Binary Search Tree)
        TreeNode root = new TreeNode(10);  // Root node with value 10
        root.left = new TreeNode(5);       // Left child with value 5
        root.right = new TreeNode(20);     // Right child with value 20
        root.left.left = new TreeNode(3);  // Left child of 5 with value 3
        root.left.right = new TreeNode(7); // Right child of 5 with value 7
        root.right.left = new TreeNode(15); // Left child of 20 with value 15
        root.right.right = new TreeNode(25); // Right child of 20 with value 25

        // Create an instance of BSTPaths to call the method
        BSTPaths paths = new BSTPaths();

        System.out.println("Root-to-leaf paths:");
        paths.printRootToLeafPaths(root);  // Print all root-to-leaf paths from the BST
    }
}