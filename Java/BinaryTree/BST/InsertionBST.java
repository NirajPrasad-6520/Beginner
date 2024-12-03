package BinaryTree.BST;
//Insertion in Binary Search Tree using Recursion:
class Node
{
    int key;
    Node left, right;

    public Node(int item)
    {
        key = item;
        left = right = null;
    }
}
public class InsertionBST
{
    // A utility function to insert a new node
    // with the given key
    static Node insert(Node root, int key)
    {
        // If the tree is empty, return a new node
        if(root == null)
            return new Node(key);

        // If the key is already present in the tree,
        // return the node
        if(root.key == key)
            return root;

        // Otherwise, recur down the tree
        if(key < root.key)
            root.left = insert(root.left, key);
        else
            root.right = insert(root.right, key);

        // Return the (unchanged) node pointer
            return root;
    }
    // A utility function to do inorder tree traversal
    static void inOrder(Node root)
    {
        if(root != null)
        {
            inOrder(root.left);
            System.out.print(root.key + " ");
            inOrder(root.right);
        }
    }
    public static void main(String[] args)
    {
        Node root = null;
         // Creating the following BST
        //      50
        //     /  \
        //    30   70
        //   / \   / \
        //  20 40 60 80
        
        root = insert(root, 50);
        root = insert(root, 30);
        root = insert(root, 20);
        root = insert(root, 40);
        root = insert(root, 70);
        root = insert(root, 60);
        root = insert(root, 80);

        inOrder(root);
    }
}