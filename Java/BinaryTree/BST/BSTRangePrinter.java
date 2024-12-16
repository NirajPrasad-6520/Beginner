package BinaryTree.BST;

class TreeNode
{
    int val; // Value of the node
    TreeNode left, right;  // Left and right child nodes

    // Constructor to create a new node with a given value
    TreeNode(int val)
    {
        this.val = val;
        left = right = null;  // Initialize left and right children as null
    }
}

public class BSTRangePrinter
{
    // Method to print all the nodes in the BST that are in the range [x, y]
    public void printRange(TreeNode root, int x, int y)
    {
        // Base case: If the current node is null, return
        if (root == null) {
            return;
        }

        // If the current node's value is greater than the lower bound, recursively traverse the left subtree
        if (root.val > x)
        {
            printRange(root.left, x, y);
        }

        // If the current node's value is in the range [x, y], print it
        if (root.val >= x && root.val <= y)
        {
            System.out.print(root.val + " ");
        }

        // If the current node's value is less than the upper bound, recursively traverse the right subtree
        if (root.val < y)
        {
            printRange(root.right, x, y);
        }
    }
    public static void main(String[] args)
    {
        // Create a sample BST
        TreeNode root = new TreeNode(10);
        root.left = new TreeNode(5);
        root.right = new TreeNode(20);
        root.left.left = new TreeNode(3);
        root.left.right = new TreeNode(7);
        root.right.left = new TreeNode(15);
        root.right.right = new TreeNode(25);

        // Create an instance of BSTRangePrinter to use the printRange method
        BSTRangePrinter printer = new BSTRangePrinter();

        System.out.println("Nodes in range [7, 20]:");
        printer.printRange(root, 7, 20);
    }
}