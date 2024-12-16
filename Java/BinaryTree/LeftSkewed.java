package BinaryTree;

public class LeftSkewed
{
    static class Node
    {
        int key; // Value of the node
        Node left, right; // Left and right child references
    }
    static Node newNode(int key)
    {
        Node temp = new Node();
        temp.key = key;
        temp.left = temp.right = null; // Initialize children as null
        return temp;
    }

    public void display(Node root)
    {
        if (root == null)
        {
            return; // Base case: If tree is empty, do nothing
        }
        System.out.print(root.key + " "); // Print the key of the current node
        display(root.left); // Recursive call to display the left subtree
    }
    public static void main(String args[])
    {
        LeftSkewed obj = new LeftSkewed();

        // Create a left-skewed binary tree
        Node root = newNode(1);
        root.left = newNode(2);
        root.left.left = newNode(3);

        System.out.print("Left Skewed Binary Tree: ");
        obj.display(root);
    }
}