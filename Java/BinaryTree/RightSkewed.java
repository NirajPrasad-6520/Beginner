package BinaryTree;

public class RightSkewed
{
// A Tree node
static class Node
{
	int key;
	Node left, right;
}
// Utility function to create a new node
static Node newNode(int key)
{
	Node temp = new Node();
	temp.key = key;
	temp.left = temp.right = null;

	return (temp);
}
public void display(Node root)
{
    if(root == null)
    {
        return;
    }
    System.out.print(root.key + " ");
    display(root.right);
}
// Driver code
public static void main(String args[])
{
    RightSkewed obj = new RightSkewed();
	Node root = newNode(1);
	root.right = newNode(4);
	root.right.right = newNode(5);

    System.out.print("right Skewed Binary Tree : ");
    obj.display(root);
}
}