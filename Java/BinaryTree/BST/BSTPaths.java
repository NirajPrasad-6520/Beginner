package BinaryTree.BST;
import java.util.ArrayList;
import java.util.List;

class TreeNode
{
    int val;
    TreeNode left, right;

    TreeNode(int val)
    {
        this.val = val;
        left = right = null;
    }
}

public class BSTPaths
{
    // Method to print all root-to-leaf paths
    public void printRootToLeafPaths(TreeNode root)
    {
        List<Integer> currentPath = new ArrayList<>();
        printPathsRecursive(root, currentPath);
    }

    // Helper method to recursively find paths
    private void printPathsRecursive(TreeNode node, List<Integer> currentPath)
    {
        if (node == null)
        {
            return;
        }

        // Add the current node's value to the path
        currentPath.add(node.val);

        // If it's a leaf node, print the path
        if (node.left == null && node.right == null)
        {
            System.out.println(currentPath);
        }
        else
        {
            // Recurse for left and right subtrees
            printPathsRecursive(node.left, currentPath);
            printPathsRecursive(node.right, currentPath);
        }

        // Backtrack: remove the current node from the path
        currentPath.remove(currentPath.size() - 1);
    }

    public static void main(String[] args)
    {
        // Creating a sample BST
        TreeNode root = new TreeNode(10);
        root.left = new TreeNode(5);
        root.right = new TreeNode(20);
        root.left.left = new TreeNode(3);
        root.left.right = new TreeNode(7);
        root.right.left = new TreeNode(15);
        root.right.right = new TreeNode(25);

        BSTPaths paths = new BSTPaths();

        // Print all root-to-leaf paths
        System.out.println("Root-to-leaf paths:");
        paths.printRootToLeafPaths(root);
    }
}