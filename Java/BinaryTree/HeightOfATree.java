package BinaryTree;

class Node
{
    int data;
    Node left, right;

    // Constructor to initialize node data and children as null
    public Node(int item)
    {
        data = item;
        left = right = null;
    }
}

public class HeightOfATree
{
    public static int height(Node root)
    {
        if (root == null)
        {
            // Base case: If tree is empty, height is 0
            return 0;
        }

        // Recursive calls to calculate the height of left and right subtrees
        int leftHeight = height(root.left);
        int rightHeight = height(root.right);

        // Height of the current node is the maximum of left and right subtree heights, plus 1
        return Math.max(leftHeight, rightHeight) + 1;
    }

    public static void main(String[] args)
    {
        // Create a binary tree
        Node root = new Node(1);
        root.left = new Node(2);
        root.right = new Node(3);
        root.left.left = new Node(4);
        root.left.right = new Node(5);

        // Calculate the height of the tree
        int treeHeight = height(root);

        System.out.println("Height of the tree: " + treeHeight);
    }
}