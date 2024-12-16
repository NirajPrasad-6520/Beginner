package BinaryTree;
// Number of Nodes in the Longest Path Between Any Two Nodes
// Optimized Approach: O(n)

class Node
{
    int data;
    Node left, right;

    // Constructor to initialize node data
    public Node(int item)
    {
        data = item;
        left = right = null;
    }
}

public class DiameterOfTree2
{
    // Helper class to store both height and diameter information
    static class TreeInfo
    {
        int height;
        int diameter;

        TreeInfo(int height, int diameter)
        {
            this.height = height;
            this.diameter = diameter;
        }
    }

    // Recursive function to calculate height and diameter
    public static TreeInfo calculateDiameter(Node root)
    {
        if (root == null)
        {
            // For null nodes, height and diameter are 0
            return new TreeInfo(0, 0);
        }

        // Recursive calls for left and right subtrees
        TreeInfo leftInfo = calculateDiameter(root.left);
        TreeInfo rightInfo = calculateDiameter(root.right);

        // Height of the current node
        int currentHeight = Math.max(leftInfo.height, rightInfo.height) + 1;

        // Diameter calculation:
        // 1. Diameter in the left subtree
        // 2. Diameter in the right subtree
        // 3. Diameter passing through the root
        int diameterThroughRoot = leftInfo.height + rightInfo.height + 1;
        int currentDiameter = Math.max(Math.max(leftInfo.diameter, rightInfo.diameter), diameterThroughRoot);

        // Return combined TreeInfo
        return new TreeInfo(currentHeight, currentDiameter);
    }
    public static void main(String[] args)
    {
        // Create a binary tree
        Node root = new Node(1);
        root.left = new Node(2);
        root.right = new Node(3);
        root.left.left = new Node(4);
        root.left.right = new Node(5);

        System.out.println("Diameter of the tree: " + calculateDiameter(root).diameter);
    }
}