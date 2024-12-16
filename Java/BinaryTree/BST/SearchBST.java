package BinaryTree.BST;
// Class to represent a node in the Binary Search Tree (BST)
class Node
{
    int key; // Value of the node
    Node left, right;  // Left and right children of the node

    // Constructor to create a new node with a given value
    public Node(int item)
    {
        key = item;
        left = right = null;  // Initialize left and right children as null
    }
}

public class SearchBST
{
    // Function to search for a key in a BST
    static Node search(Node root, int key)
    {
        // Base Case: If root is null or key is present at the root
        if (root == null || root.key == key)
        {
            return root;  // Return the node if key is found, or return null if root is null
        }

        // If the key is greater than root's key, search in the right subtree
        if (root.key < key)
        {
            return search(root.right, key);
        }

        // If the key is smaller than root's key, search in the left subtree
        return search(root.left, key);
    }
    public static void main(String[] args)
    {
        // Creating the BST:
        //           50
        //          /  \
        //         30   70
        //        / \   / \
        //       20 40 60 80

        Node root = new Node(50);
        root.left = new Node(30);
        root.right = new Node(70);
        root.left.left = new Node(20);
        root.left.right = new Node(40);
        root.right.left = new Node(60);
        root.right.right = new Node(80);

        // Searching for keys in the BST
        int[] keysToSearch = {19, 80};  // Keys to be searched in the BST

        for (int key : keysToSearch)
        {
            Node result = search(root, key);  // Call the search function to find the key
            if (result != null)
            {
                // If the key is found, print that it's found
                System.out.println("Key " + key + " is Found");
            }
            else
            {
                // If the key is not found, print that it's not found
                System.out.println("Key " + key + " is Not Found");
            }
        }
    }
}