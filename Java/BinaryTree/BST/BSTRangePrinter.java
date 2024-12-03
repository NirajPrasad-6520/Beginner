package BinaryTree.BST;

    class TreeNode
    {
        int val;
        TreeNode left, right;
    
        TreeNode(int val) {
            this.val = val;
            left = right = null;
        }
    }
    
    public class BSTRangePrinter
    {
        // Method to print nodes in the given range
        public void printRange(TreeNode root, int x, int y)
        {
            if (root == null)
            {
                return;
            }
    
            // Traverse the left subtree if the current node's value is greater than the lower bound
            if (root.val > x)
            {
                printRange(root.left, x, y);
            }
    
            // Print the current node if it lies within the range
            if (root.val >= x && root.val <= y)
            {
                System.out.print(root.val + " ");
            }
    
            // Traverse the right subtree if the current node's value is less than the upper bound
            if (root.val < y)
            {
                printRange(root.right, x, y);
            }
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
    
            BSTRangePrinter printer = new BSTRangePrinter();
    
            // Print values in range [7, 20]
            System.out.println("Nodes in range [7, 20]:");
            printer.printRange(root, 7, 20);
        }
    }