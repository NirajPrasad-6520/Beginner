package BinaryTree;

class TreeNode
{
    int val; // Value of the node
    TreeNode left;
    TreeNode right;

    // Constructor to initialize the node value and its children as null
    TreeNode(int val)
    {
        this.val = val;
        this.left = null;
        this.right = null;
    }
}

public class SubtreeOfAnotherTree
{
    public static boolean isSubtree(TreeNode tree, TreeNode subtree)
    {
        // If the subtree is null, it is always a subtree
        if (subtree == null) return true;
        // If the main tree is null, the subtree cannot exist within it
        if (tree == null) return false;

        // Check if the current trees are identical
        if (areIdentical(tree, subtree)) return true;

        // Otherwise, recursively check the left and right subtrees
        return isSubtree(tree.left, subtree) || isSubtree(tree.right, subtree);
    }

    private static boolean areIdentical(TreeNode t1, TreeNode t2)
    {
        // Both trees are null, so they are identical
        if (t1 == null && t2 == null) return true;
        // If one tree is null and the other is not, they are not identical
        if (t1 == null || t2 == null) return false;

        // Check if the current node values are equal and their respective subtrees are identical
        return (t1.val == t2.val) &&
            areIdentical(t1.left, t2.left) &&
            areIdentical(t1.right, t2.right);
    }
    public static void main(String[] args)
    {
        // Create the main binary tree
        TreeNode tree = new TreeNode(3);
        tree.left = new TreeNode(4);
        tree.right = new TreeNode(5);
        tree.left.left = new TreeNode(1);
        tree.left.right = new TreeNode(2);

        // Create the subtree
        TreeNode subtree = new TreeNode(4);
        subtree.left = new TreeNode(1);
        subtree.right = new TreeNode(2);

        // Check if 'subtree' is a subtree of 'tree' and print the result
        System.out.println("Is subtree: " + isSubtree(tree, subtree));
    }
}