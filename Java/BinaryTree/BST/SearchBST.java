package BinaryTree.BST;
//Recursive Program to implement search in BST:
class Node
{
    int key;
    Node left, right;

    public Node(int item)
    {
        key = item;
        left = right= null;
    }
}
public class SearchBST
{
    // function to search a key in a BST
    static Node search(Node root, int key)
    {
        // Base Cases: root is null or key is present at
        // root
        if(root == null || root.key == key)
        return root;

        // Key is greater than root's key
        if(root.key < key)
        return search(root.right, key);

        // Key is smaller than root's key
        return search(root.left, key);
    }
    public static void main(String[] args)
    {
        Node root = new Node(50);
        root.left = new Node(30);
        root.right = new Node(70);
        root.left.left = new Node(20);
        root.left.right = new Node(40);
        root.right.left = new Node(60);
        root.right.right = new Node(80);

        // Searching for keys in the BST
        int[] keysToSearch = {19, 80};

        for (int key : keysToSearch) {
            Node result = search(root, key);
            if (result != null) {
                System.out.println("Key " + key + " is Found");
            } else {
                System.out.println("Key " + key + " is Not Found");
            }
        }
    }
}