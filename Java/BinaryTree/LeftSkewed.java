package BinaryTree;

public class LeftSkewed
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
    display(root.left);
}
// Driver code
public static void main(String args[])
{
    LeftSkewed obj = new LeftSkewed();
	Node root = newNode(1);
	root.left = newNode(2);
	root.left.left = newNode(3);

    System.out.print("Left Skewed Binary Tree : ");
    obj.display(root);
}
}