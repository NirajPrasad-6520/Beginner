package BinaryTree;

public class RightSkewed
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
        display(root.right); // Recursive call to display the right subtree
    }
    public static void main(String args[])
    {
        RightSkewed obj = new RightSkewed();

        // Create a right-skewed binary tree
        Node root = newNode(1);
        root.right = newNode(4);
        root.right.right = newNode(5);

        System.out.print("Right Skewed Binary Tree: ");
        obj.display(root);
    }
}