package BinaryTree;

class TreeNode
{
    int val;
    TreeNode left;
    TreeNode right;

    TreeNode(int val)
    {
        this.val = val;
        this.left = null;
        this.right = null;
    }
}

public class SubtreeOfAnotherTree
{

    // Main function to check if 'subtree' is a subtree of 'tree'
    public static boolean isSubtree(TreeNode tree, TreeNode subtree)
    {
        // If subtree is null, it is always a subtree
        if (subtree == null) return true;
        // If tree is null, subtree cannot be a subtree
        if (tree == null) return false;

        // Check if the current trees are identical
        if (areIdentical(tree, subtree)) return true;

        // Otherwise, check the left and right subtrees
        return isSubtree(tree.left, subtree) || isSubtree(tree.right, subtree);
    }

    // Helper function to check if two trees are identical
    private static boolean areIdentical(TreeNode t1, TreeNode t2)
    {
        // Both trees are null, so they are identical
        if (t1 == null && t2 == null) return true;
        // One tree is null and the other is not, so they are not identical
        if (t1 == null || t2 == null) return false;

        // Check if the current nodes are equal and their subtrees are identical
        return (t1.val == t2.val) &&
            areIdentical(t1.left, t2.left) &&
            areIdentical(t1.right, t2.right);
    }

    // Main function to test the implementation
    public static void main(String[] args) {
        TreeNode tree = new TreeNode(3);
        tree.left = new TreeNode(4);
        tree.right = new TreeNode(5);
        tree.left.left = new TreeNode(1);
        tree.left.right = new TreeNode(2);

        TreeNode subtree = new TreeNode(4);
        subtree.left = new TreeNode(1);
        subtree.right = new TreeNode(9);

        System.out.println(isSubtree(tree, subtree));
    }
}